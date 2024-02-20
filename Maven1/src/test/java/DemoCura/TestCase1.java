package DemoCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase1 {
    public WebDriver driver;
    @BeforeClass
    void Setup(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
    }

    @Test
    void Crud(){
        WebElement ApptBtn = driver.findElement(By.id("btn-make-appointment"));
        ApptBtn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement btn = driver.findElement(By.id("btn-login"));
        btn.click();

        Select facility = new Select(driver.findElement(By.id("combo_facility")));
        facility.selectByIndex(2);

        WebElement chk = driver.findElement(By.id("chk_hospotal_readmission"));
        chk.click();

        WebElement radioBtn = driver.findElement(By.id("radio_program_medicaid"));
        radioBtn.click();

        WebElement calendar = driver.findElement(By.id("txt_visit_date"));
        calendar.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("datepicker-days")));

        String monthYear = driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[2]/th[2]")).getText();
        System.out.println(monthYear); //Feb(0) 2024(1) break it into two part month and year

        String month = monthYear.split(" ")[0].trim();
        String year = monthYear.split(" ")[1].trim();

        while(!(month.equals("July") && year.equals("2024"))){
            WebElement nxt = driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[2]/th[3]"));
            nxt.click();

            monthYear = driver.findElement(By.xpath("/html/body/div/div[1]/table/thead/tr[2]/th[2]")).getText();
            System.out.println(monthYear); //Feb(0) 2024(1) break it into two part month and year

           month = monthYear.split(" ")[0].trim();
            year = monthYear.split(" ")[1].trim();
        }

        WebElement day = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[3]"));
        day.click();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement space = driver.findElement(By.xpath("//*[@id=\"appointment\"]"));
        space.click();



        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("This is a comment");


        WebElement Bookbtn = driver.findElement(By.id("btn-book-appointment"));
        Bookbtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement homeLink = driver.findElement(By.linkText("Go to Homepage"));
        homeLink.click();
    }

    @AfterClass
    void end(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
