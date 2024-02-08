import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and already registered email address
7. Click 'Signup' button
8. Verify error 'Email Address already exist!' is visible
*/
public class TestCase5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\jnket\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		
		WebElement signLog = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signLog.click();

		WebElement name= driver.findElement(By.name("name"));
		name.clear();
		name.sendKeys("Shelby");




		WebElement emailAddy = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		emailAddy.clear();
		emailAddy.sendKeys("test90@gmail.com");

		WebElement signUpbtn= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
		signUpbtn.click();
		
		driver.close();
	}

}
