import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Contact Us' button
5. Verify 'GET IN TOUCH' is visible
6. Enter name, email, subject and message
7. Upload file
8. Click 'Submit' button
9. Click OK button
10. Verify success message 'Success! Your details have been submitted successfully.' is visible
11. Click 'Home' button and verify that landed to home page successfully*/

public class TestCase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		
		WebElement contactBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));
		contactBtn.click();
		
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys("Jonathan");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("test@gas.com");
		
		WebElement subject = driver.findElement(By.name("subject"));
		subject.sendKeys("Selenium testing 101");
		
		WebElement message = driver.findElement(By.id("message"));
		message.sendKeys("I want to be a QA engineer pls give me a job");
		
		WebElement fileUpload = driver.findElement(By.name("upload_file"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileUpload);
		fileUpload.sendKeys("C:\\Users\\jnket\\Downloads\\Screenshot 2024-01-10 165814.png");
		
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileUpload);
		submitBtn.click();

		driver.close();
	}

}
