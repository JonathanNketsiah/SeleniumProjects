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
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page*/

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");
        
        WebElement signLog = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signLog.click();
		
		WebElement emailLog = driver.findElement(By.name("email"));
		emailLog.clear();
		emailLog.sendKeys("test90@gmail.com");
		
		WebElement passLog = driver.findElement(By.name("password"));
		passLog.clear();
		passLog.sendKeys("testpass123");
		
		WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		logBtn.click();
		
		WebElement logOut = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		logOut.click();
		
		driver.close();
	}

}
