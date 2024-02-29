package PracticeComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Buttons {

  public WebDriver driver;

  @BeforeClass
    void setup(){
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://formy-project.herokuapp.com/buttons");
    }

    @Test
    void Buttons(){
        WebElement primary = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[1]"));
        primary.click();

        WebElement success = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[2]"));
        success.click();

        WebElement info = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[3]"));
        info.click();

        WebElement warning = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[4]"));
        warning.click();

        WebElement danger = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[5]"));
        danger.click();

        WebElement link = driver.findElement(By.xpath("/html/body/div/form/div[1]/div/div/button[6]"));
        link.click();

        WebElement left = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[1]"));
        left.click();

        WebElement middle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[2]"));
        middle.click();

        WebElement right = driver.findElement(By.xpath("/html/body/div/form/div[2]/div/div/div/button[3]"));
        right.click();

        WebElement one = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
        one.click();

        WebElement two = driver.findElement(By.xpath("/html/body/div/form/div[3]/div/div/div/button[1]"));
        two.click();

        WebElement dropdown = driver.findElement(By.id("btnGroupDrop1"));
        dropdown.click();

      WebElement drop2=  driver.findElement(By.linkText("Dropdown link 2"));
       drop2.click();

    }

    @AfterClass
    void end(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
