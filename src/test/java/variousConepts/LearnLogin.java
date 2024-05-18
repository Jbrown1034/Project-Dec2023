package variousConepts;





import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnLogin {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void set() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jb378\\OneDrive\\Desktop\\Selenium\\Session3\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLogin() throws InterruptedException {

		// data type name = value

		
		// Element list - WebElement
		WebElement USER_NAME_ELEMENT = driver.findElement(By.xpath(" //input[@id='user_name']"));
		WebElement PASSWORD_ELEMENT = driver.findElement(By.xpath("//input[@id=\'password\']"));
		WebElement SIGNIN_ELEMENT = driver.findElement(By.xpath("//button[@id='login_submit']"));
		WebElement DASHBOARD_ELEMENT = driver.findElement(By.xpath("//strong[text()='Dashboard']"));
		
		// Element list - By type
		By USER_NAME_FIELD = By.xpath("//input[@id='user_name']");
		By PASSWORD_FIELD = By.xpath("//input[@id=\\'password\\']");
		By SIGNIN_FIELD = By.xpath("//button[@id='login_submit']");
		By Dash_Field = By.xpath("//strong[text()='Dashboard']");
		wait = new WebDriverWait(driver, 10);
		//driver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("demo@codefios.com");
		//driver.findElement(USER_NAME_FIELD).sendKeys("demo@codefios.com");
		//USER_NAME_ELEMENT.sendKeys("odmpeod");
		//Thread.sleep(2000);
		USER_NAME_ELEMENT.clear();
		USER_NAME_ELEMENT.sendKeys("demo@codefios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_ELEMENT.click();
		
	
	}

}
