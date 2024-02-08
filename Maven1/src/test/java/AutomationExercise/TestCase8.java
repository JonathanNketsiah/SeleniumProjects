import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. The products list is visible
7. Click on 'View Product' of first product
8. User is landed to product detail page
9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
*/
public class TestCase8 {
	
	public static void main (String [] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\jnket\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		
		WebElement product = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a"));
		product.click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement viewPro= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewPro);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewPro);
		
		
		driver.close();
	
	}

}
