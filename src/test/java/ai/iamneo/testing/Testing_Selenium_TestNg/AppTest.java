package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
	//	System.setProperty("webdriver.chrome.driver", "/home/coder/project/workspace/Testing-with-Selenium-TestNg/chromedriver");
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
	}

	@Test
	public void TestCase_1() throws InterruptedException {
		driver.get("https://admin.pscollege841.exam.ly/");
		Thread.sleep(5000);  
		String title = driver.getTitle();
		Assert.assertEquals(title, "PS College");
	}
	@Test
	public void TestCase_2() throws InterruptedException {
		driver.get("https://admin.pscollege841.exam.ly/");
		Thread.sleep(5000);  
		String title = driver.getTitle();
		Assert.assertEquals(title, "PS College");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
