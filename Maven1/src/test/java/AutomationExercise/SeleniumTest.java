import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    void Setup(){
     System.setProperty("webDriver.driver.chrome","C:\\Users\\jnket\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
     WebDriver driver = new ChromeDriver();
     driver.get("https://ggc.view.usg.edu/d2l/login?sessionExpired=0&target=%2fd2l%2fhome%2f1875451");


    }
}
