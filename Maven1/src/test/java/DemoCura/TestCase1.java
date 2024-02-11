package DemoCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
    }
}
