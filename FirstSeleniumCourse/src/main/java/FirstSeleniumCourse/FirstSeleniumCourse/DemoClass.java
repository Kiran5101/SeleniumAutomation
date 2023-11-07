package FirstSeleniumCourse.FirstSeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoClass {
	WebDriver driver;
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	}
	@Test(priority=1)
	public void demoExp() throws InterruptedException {
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@id='frm1']"));
		WebElement secondFrame=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(firstFrame);
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame2");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
