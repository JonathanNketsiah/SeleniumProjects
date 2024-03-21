package PracticeComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class Signify {
    public WebDriver driver;
    @BeforeClass
    void Setup() {
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.signify.com/en-us");
    }

    @Test
        void philipsHue(){

        driver.switchTo().frame(driver.findElement(By.name("trustarc_cm")));




        WebElement accept = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div[4]/a[1]"));
        Actions act = new Actions(driver);
        act.click(accept).perform();

        driver.switchTo().defaultContent();

        WebElement companyLink = driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div/header/div/nav/div/div[2]/div/div[6]/span"));
            Actions comp = new Actions(driver);
            comp.click(companyLink).perform();

        WebElement ourCompany = driver.findElement(By.xpath("/html/body/section/div/div[2]/div/div/header/div/nav/div/div[2]/div/div[6]/div[2]/div/div/ul/li[1]/a/span"));
        ourCompany.click();

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement about = driver.findElement(By.xpath("/html/body/div[3]/div[4]/section/div/div[2]/div/div/section/div/div/div/p[3]/a"));
        js.executeScript("arguments[0].scrollIntoView();", about);
        Actions ab = new Actions(driver);
        ab.click(about).perform();

        WebElement innovation = driver.findElement(By.xpath("/html/body/div[3]/div[5]/section/div/div[2]/div/div/section/div/div/div/p[6]/a/span"));
        js.executeScript("arguments[0].scrollIntoView();", innovation);
        Actions inov = new Actions(driver);
        inov.click(innovation).perform();

        WebElement philHue = driver.findElement(By.xpath("/html/body/div[3]/div[8]/section/div/div[2]/div/div/section/div/div/div/p[4]/a/span"));
        js.executeScript("arguments[0].scrollIntoView();", philHue);
        Actions Hue = new Actions(driver);
        Hue.click(philHue).perform();




        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        }


        @AfterClass
    void exit(){
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.quit();
        }
    }

