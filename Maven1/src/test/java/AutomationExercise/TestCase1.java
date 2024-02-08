package AutomationExercise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//Test Case 1 
/*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
*/
public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jnket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");


		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

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


		WebElement prefix = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[1]/div[1]/label"));
		prefix.click();


		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("testpass123");

		Select dayDate = new Select(driver.findElement(By.id("days")));
		dayDate.selectByIndex(19);

		Select Month = new Select(driver.findElement(By.id("months")));
		Month.selectByIndex(9);

		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByIndex(11);




		WebElement newsletterElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletterElement);
		newsletterElement.click();

		WebElement recieve = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/div[7]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", recieve);
		recieve.click();



		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys("Shelbyy");

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Baby");

		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Amazon");

		WebElement addressOne = driver.findElement(By.id("address1"));
		addressOne.sendKeys("54 providence oak ct");

		WebElement addressTwo = driver.findElement(By.id("address2"));
		addressTwo.sendKeys("56 providence oak ct");

		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(1);

		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("Maine");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Jameson");

		WebElement zip = driver.findElement(By.id("zipcode"));
		zip.sendKeys("50021");

		WebElement mobile = driver.findElement(By.id("mobile_number"));
		mobile.sendKeys("2347993425");


		WebElement createAccountButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
		createAccountButton.click();


		WebElement btn3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
		btn3.click();

		//	WebElement delete = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[5]/a"));
		//delete.click();

        driver.close();

	}
}