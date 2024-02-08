import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase13 {

   public static WebDriver driver;
    @BeforeClass
   void setup(){
        System.setProperty("webDriver.driver.chrome","C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");

    }

    @Test
    void VerifyProQuantity(){
        WebElement viewPro = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[33]/div/div[2]/ul/li/a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewPro);
        viewPro .click();

        WebElement increase = driver.findElement(By.id("quantity"));
        int current = Integer.parseInt(increase.getAttribute("value"));
        int newCurrent = current + 3;
        increase.clear();
        increase.sendKeys(String.valueOf(newCurrent));

        WebElement add = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
        add.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement viewC = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a"));
        viewC.click();


    }


    @AfterClass
    void end(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
