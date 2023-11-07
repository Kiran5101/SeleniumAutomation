package com.qa.ActionsSelenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTestClass {
	public static WebDriver driver;
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://demoqa.com/droppable");
	}
	/*
	 * @Test() public void MovetoElementMethod() throws InterruptedException{
	 * WebElement Uname=driver.findElement(By.name("username")); WebElement
	 * PassWord=driver.findElement(By.xpath("//input[@name='password']"));
	 * WebElement
	 * LoginButton=driver.findElement(By.xpath("//button[@type='submit']")); Actions
	 * build=new Actions(driver);
	 * build.moveToElement(Uname).sendKeys(Keys.chord(Keys.SHIFT,"Hello Kiran")).
	 * click(PassWord).sendKeys("Kirn@1234").click(LoginButton); build.perform();
	 * Thread.sleep(4000);
	 

	}*/
	@Test()
	public void drragablemethodTest() throws InterruptedException{
		//WebElement draggable=driver.findElement(By.xpath("//div[text()='Drag me']"));
		//WebElement Droppable_Interface=driver.findElement(By.xpath("//span[text()='Droppable']"));
		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		draggable.click();
		Actions builder=new Actions(driver);
		builder.clickAndHold(draggable).release(droppable).perform();
		//builder.dragAndDrop(draggable, droppable).perform();
		System.out.println(droppable.getLocation());
		//builder.moveToElement(Droppable_Interface).click().perform();
		Thread.sleep(4000);
		WebElement COnfirmationText=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
