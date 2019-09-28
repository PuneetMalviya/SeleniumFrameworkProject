package Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest {

	static WebDriver driver = null;

	@BeforeTest
	public void SetUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("headless");
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(options);
	}

	@Test
	// public static void main(String[] args)
	public static void test1() {
		// TODO Auto-generated method stub
		// WebDriver driver = new FirefoxDriver();

		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("piyushmalvia2@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("F@bul0u3");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).sendKeys(Keys.RETURN);

		// driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		// WebDriverWait wait=new WebDriverWait(driver,20);
		// WebElement
		// birthdayLink=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//strong[text()=\"Raveena
		// Choudhary\"]")));

		// driver.findElement(By.xpath("//strong[text()=\"Raveena
		// Choudhary\"]")).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void tearDown() {
		// driver.quit();
	}

}
