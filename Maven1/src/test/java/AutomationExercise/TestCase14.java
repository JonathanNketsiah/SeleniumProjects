package AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase14 {
    public WebDriver driver;
    @BeforeClass
    void Setup(){
      System.setProperty("webDriver.chrome.driver","C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");


    }


@Test
 void PlaceOrderReg(){

    WebElement add = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[2]/div/a"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", add);


    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

     WebElement cont = driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button"));
    cont.click();

    WebElement cartBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
cartBtn.click();

 WebElement proceed = driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a"));
 proceed.click();

 WebElement regLog = driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a"));
 regLog.click();

 WebElement name = driver.findElement(By.name("name"));
 name.sendKeys("Kelly");

 WebElement email = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
 email.sendKeys("Kelly@gmail.com");

 WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
 signBtn.click();

 WebElement prefix = driver.findElement(By.id("uniform-id_gender2"));
 prefix.click();

 WebElement name2 = driver.findElement(By.xpath("//*[@id=\"name\"]"));
 name2.clear();
 name2.sendKeys("Kelly");

//WebElement email2 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//email2.clear();
//email2.sendKeys("Ajjak@gmail.com");

WebElement password = driver.findElement(By.id("password"));
password.clear();
password.sendKeys("wonderland");

    Select day = new Select(driver.findElement(By.id("days")));
    day.selectByIndex(4);

    Select month = new Select((driver.findElement(By.id("months"))));
    month.selectByIndex(6);

    Select years = new Select((driver.findElement(By.id("years"))));
    years.selectByValue("1998");

    WebElement newsletterElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletterElement);
    newsletterElement.click();

    WebElement recieve = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recieve);
    recieve.click();

    WebElement firstName = driver.findElement(By.id("first_name"));
    firstName.clear();
    firstName.sendKeys("Kelly");

    WebElement lastName = driver.findElement(By.id("last_name"));
    lastName.clear();
    lastName.sendKeys("Helliss");

    WebElement company = driver.findElement(By.id("company"));
    company.clear();
    company.sendKeys("Apple");

    WebElement addy = driver.findElement(By.id("address1"));
    addy.clear();
    addy.sendKeys("99 glacier road ");

    WebElement addy2 = driver.findElement(By.id("address2"));
    addy2.clear();
    addy.sendKeys("88 uline constance");

    Select count = new Select(driver.findElement(By.id("country")));
    count.selectByIndex(3);

    WebElement state = driver.findElement(By.id("state"));
    state.clear();
    state.sendKeys("Georgia");

    WebElement city = driver.findElement(By.id("city"));
    city.clear();
    city.sendKeys("Atlanta");

    WebElement zip = driver.findElement(By.id("zipcode"));
    zip.clear();
    zip.sendKeys("30099");

    WebElement mobile = driver.findElement(By.id("mobile_number"));
    mobile.clear();
    mobile.sendKeys("8891233452");

    WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
    createAccountButton.click();

}

@AfterClass
void End(){
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();
}
}