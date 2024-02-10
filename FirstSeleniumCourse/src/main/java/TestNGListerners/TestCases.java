package TestNGListerners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(TestNGListerners.ItestListernerConcept.class)
public class TestCases {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void googleTitleVerification() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google");
	}
	@Test
	public void verifcation() {
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
