package PracticeComponents;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    public WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webDriver.chrome,driver", "C:\\\\Users\\\\jnket\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://www.browserstack.com/users/sign_up");
    }

    @Test
    void alert() {
        WebElement name = driver.findElement(By.id("user_full_name"));
        name.sendKeys("Shelby Gram");

        WebElement email = driver.findElement(By.id("user_email_login"));
        email.sendKeys("Gram44@test.com");

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("Gram@gmail.com");


        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement btn =driver.findElement(By.id("user_submit"));
        js.executeScript("arguments[0].scrollIntoView();",btn);
        btn.click();


try {


    Alert alert = driver.switchTo().alert();

    String alertMessage = driver.switchTo().alert().getText();
    System.out.println(alertMessage);

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    alert.accept();

}catch (NoAlertPresentException e){
    e.printStackTrace();
}

    }

    @AfterClass
    void end(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
