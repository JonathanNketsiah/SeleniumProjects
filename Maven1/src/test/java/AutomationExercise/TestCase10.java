import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Scroll down to footer
5. Verify text 'SUBSCRIPTION'
6. Enter email address in input and click arrow button
7. Verify success message 'You have been successfully subscribed!' is visible*/

public class TestCase10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		
		WebElement subInput = driver.findElement(By.id("susbscribe_email"));
		subInput.sendKeys("test12@hh.com");
		
		WebElement arrow= driver.findElement(By.xpath("//*[@id=\"subscribe\"]/i"));
		arrow.click();
		
		driver.close();

	}

}
