package FirstSeleniumCourse.FirstSeleniumCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.google.co.in/");
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void searchButtons() throws InterruptedException {
		/*
		 * // WebElement InputBox=driver.findElement(By.id("APjFqb")); // WebElement
		 * InputBox=driver.findElement(By.name("q"));
		 * 
		 * WebElement InputBox=driver.findElement(By.className("gLFyf"));
		 * InputBox.sendKeys(Keys.chord(Keys.SHIFT,"Selenium Trash Course"));
		 * Thread.sleep(4000); InputBox.submit();
		 * 
		 * List<WebElement> InputBox=driver.findElements(By.tagName("a"));
		 * System.out.println(InputBox.size());
		 * driver.findElement(By.tagName("button"));
		 * 
		 * 
		 * //InputBox.sendKeys(Keys.CLEAR);
		 * //InputBox.sendKeys(Keys.chord(Keys.SHIFT,"Papijenni")); InputBox.submit();
		 * 
		 * //WebElement ByLink_Text=driver.findElement(By.linkText("Gmail")); WebElement
		 * byPartialLInkText=driver.findElement(By.partialLinkText("Ima"));
		 * byPartialLInkText.click();
		 */
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
		MobileNumber.sendKeys("9573402192");
		WebElement CheckBox_Sports=driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		CheckBox_Sports.click();
		Thread.sleep(4000);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
