package FirstSeleniumCourse.FirstSeleniumCourse;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsMethods {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@Test(enabled=false)
	public void MoveToElementAndClickMethod() throws InterruptedException {
		driver.get("https://demoqa.com/login");
		WebElement Username=driver.findElement(By.xpath("//input[@id='userName']")); 	
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		
		Username.sendKeys("Hello101");
		Password.sendKeys("Hello@5101");
		
		
		Actions builder =new Actions(driver);
		builder.moveToElement(LoginButton).click();
		
		Action compositeAction=builder.build();
		compositeAction.perform();
		
		Thread.sleep(4000);
	}
	@Test(enabled=false)
	public void clickAndHoldAndReleaseMethod() throws InterruptedException {
		driver.get("https://demoqa.com/dragabble");
		WebElement Draggable=driver.findElement(By.xpath("//div[text()='Drag me']"));
		Actions builder=new Actions(driver);
		System.out.println(Draggable.getLocation());
		builder.clickAndHold(Draggable).moveByOffset(208, 200).release().perform();
		Thread.sleep(4000);
	}
	@Test(enabled=false)
	public void dragAndDropActions() throws InterruptedException{
		driver.get("https://demoqa.com/droppable");
		WebElement TargetElement=driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement SourceElement=driver.findElement(By.xpath("//div[text()='Drag me']//ancestor::div[@id='simpleDropContainer']//descendant::p[text()='Drop here']"));
		
		Actions builder =new Actions(driver);
		System.out.println(TargetElement.getLocation());
		//builder.dragAndDropBy(SourceElement, 400, 290).perform();
		builder.dragAndDrop(SourceElement, TargetElement).perform();
		Thread.sleep(3000);
	}
	@Test(enabled=false)
	public void  doubleAndRightClick() throws InterruptedException{
		driver.get("https://demoqa.com/buttons");
		WebElement DoubleClick=driver.findElement(By.xpath("//button[starts-with(@id,'dou')]"));
		WebElement RightCLick=driver.findElement(By.xpath("//button[starts-with(@id,'ri')]"));

		Actions builder=new Actions(driver);
		builder.doubleClick(DoubleClick).perform();
		builder.contextClick(RightCLick).perform();
		WebElement LabelRightClick=driver.findElement(By.xpath("//p[starts-with(@id,'ri')]"));
		Thread.sleep(4000);	
		
	}
	@Test()
	public void KeyboardsBasedInteractions()throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement ForgottenPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		WebElement PhoneNumber=driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(ForgottenPassword).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).moveToElement(PhoneNumber).perform();
		Thread.sleep(5000);
		builder.keyDown(Keys.SHIFT).sendKeys("k").keyUp(Keys.SHIFT).sendKeys("ran kumar reddy").perform();
		Thread.sleep(7000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
