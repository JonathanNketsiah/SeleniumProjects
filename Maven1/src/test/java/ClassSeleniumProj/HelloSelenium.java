package ClassSeleniumProj;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HelloSelenium {
    public static WebDriver driver;


    public  void setUpChrome() {
// Create a new WebDriver instance (Use Chrome)
// download ChromeDriver from: // and put the path here...
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }


    public void googleSearchExample() throws Exception {
// Use webdriver to visit Google
        driver.get("http://www.google.com");
// Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
// Enter something to search for
        element.clear();
        element.sendKeys("GGC");
// Now submit the form. WebDriver will find the form for us from the element
        element.submit();

    }


    public void seleniumsTest() throws Exception{
        driver.get("http://halghazouli2.epizy.com/Activities/3-14.html");

        WebElement sID = driver.findElement(By.name("StudentID"));
        sID.clear();
        sID.sendKeys("900000000");

        //
        WebElement passW = driver.findElement(By.xpath("/html/body/form/fieldset[1]/table/tbody/tr[2]/td/input"));
        passW.clear();
        passW.sendKeys("1234563452");

        WebElement RepassW = driver.findElement(By.name("RetypePassword"));
        RepassW.clear();
        RepassW.sendKeys("1234563452");

        WebElement email = driver.findElement(By.name("Email"));
        email.clear();
        email.sendKeys("jnket123@gmail.com0");

        WebElement FN = driver.findElement(By.name("FirstName"));
       FN.clear();
       FN.sendKeys("John");

        WebElement LN = driver.findElement(By.name("LastName"));
      LN.clear();
       LN.sendKeys("Doe");

       //add phone,street,citty,staate,zip

        WebElement phone = driver.findElement(By.name("Phone"));
       phone.clear();
       phone.sendKeys("6602344729");

        WebElement street = driver.findElement(By.name("Street"));
        street.clear();
        street.sendKeys("Martin Boulevard");

        WebElement city = driver.findElement(By.name("City"));
       city.clear();
        city.sendKeys("Atlanta");

        WebElement state= driver.findElement(By.name("State"));
        state.clear();
        state.sendKeys("Georgia");

        WebElement zip = driver.findElement(By.name("Zip"));
       zip.clear();
        zip.sendKeys("30043");

        Select level = new Select(driver.findElement(By.name("Level")));
        level.selectByIndex(4);

        WebElement computer = driver.findElement(By.name("ownComputer"));
       computer.click();

        WebElement time = driver.findElement(By.id("t3"));
       time.click();

        WebElement FF = driver.findElement(By.name("firefox"));
      FF.click();

        WebElement chrome = driver.findElement(By.name("chrome"));
        chrome.click();

        WebElement safari = driver.findElement(By.name("safari"));
        safari.click();


        Select Mr = new Select(driver.findElement(By.name("major")));
        Mr.selectByIndex(1);

///
        WebElement submit = driver.findElement(By.xpath("/html/body/form/input[1]"));
        submit.click();
    }
}

