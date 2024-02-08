package AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webDriver.chrome.driver","C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");
        
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a"));
        cart.click();
        
        WebElement input = driver.findElement(By.id("susbscribe_email"));
        input.sendKeys("test@gmail.com");
        
        
        WebElement arrowBtn = driver.findElement(By.id("subscribe"));
        arrowBtn.click();
        
        driver.quit();
	}

}
