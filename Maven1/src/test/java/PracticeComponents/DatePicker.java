package PracticeComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DatePicker {
    public WebDriver driver;

    @BeforeClass
    void Setup() {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/datepicker");
    }

   @Test
    void datePicker() {

       WebElement date = driver.findElement(By.id("datepicker"));
       date.click();

       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div[1]/table")));

       String monthYear= driver.findElement(By.className("datepicker-switch")).getText();
       System.out.println(monthYear);

       String month = monthYear.split(" ")[0].trim();
       String year = monthYear.split(" ")[1].trim();

       System.out.println(month);
       System.out.println(year);

       while(!((month.equals("July") && year.equals("2024")))){
           WebElement nxt = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[3]"));
            nxt.click();

           monthYear= driver.findElement(By.className("datepicker-switch")).getText();
            month = monthYear.split(" ")[0].trim();
            year = monthYear.split(" ")[1].trim();

       }

       WebElement day = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]"));
       day.click();
   }

   @AfterClass
    void end(){
       try {
           Thread.sleep(6000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

       driver.quit();
   }

    }

