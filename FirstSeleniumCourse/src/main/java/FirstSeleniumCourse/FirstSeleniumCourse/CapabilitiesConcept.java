package FirstSeleniumCourse.FirstSeleniumCourse;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapabilitiesConcept {
	WebDriver driver;
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test(enabled=false)
	public void takeScreenshot() {
		driver.get("https://www.facebook.com/");
		WebElement LoginButton=driver.findElement(By.xpath("//input[@name='pass']"));
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler file=new FileHandler();
		try {
			FileHandler.copy(srcfile, new File("./screenshots/image1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File LoginButtonS=LoginButton.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(LoginButtonS, new File("./screenshots/pass.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test(enabled=false)
	public void HandlingWindows() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement FacebookLInk=driver.findElement(By.xpath("//a[contains(@href,'face')]"));
		WebElement twitterLink=driver.findElement(By.xpath("//a[contains(@href,'tw')]"));
		WebElement youtubeLink=driver.findElement(By.xpath("//a[contains(@href,'you')]"));
		WebElement Linked=driver.findElement(By.xpath("//a[contains(@href,'link')]"));
		System.out.println(driver.getWindowHandle());
		
		FacebookLInk.click();
		Thread.sleep(4000);
		
		Set<String> set1=driver.getWindowHandles();
		ArrayList<String> list1=new ArrayList<String>(set1);
		String ParentWindow=list1.get(0);
		String childWindow=list1.get(1);
		
		driver.switchTo().window(childWindow);
		WebElement email=driver.findElement(By.xpath("//span[text()='Email address or phone number']//following-sibling::input[@name='email']"));
		WebElement password=driver.findElement(By.xpath("//span[text()='Password']//following-sibling::input[@name='pass']"));
		email.sendKeys("hello");
		password.sendKeys("world");
		
		driver.switchTo().window(ParentWindow);
		Thread.sleep(4000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		
	}
	@Test(enabled=false)
	public void handlingFrames() throws InterruptedException {
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='firstFr']")));
		WebElement inputBox=driver.findElement(By.xpath("//input[@name='fname']"));
		inputBox.sendKeys("Hello World");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='innerFrame']")));
		WebElement emailBox=driver.findElement(By.xpath("//input[@name='email']"));
		emailBox.sendKeys("Mounika");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='firstFr']")));
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lname']"));
		LastName.sendKeys("Reddy");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement ICOn=driver.findElement(By.xpath("//a[text()='Watch tutorial']"));
		ICOn.click();
		Thread.sleep(3000);
	}
	@Test(enabled=false)
	public void handlingAlerts() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement simpleALert=driver.findElement(By.xpath("//button[@id='alertBox']"));
		simpleALert.click();
		
		Alert SimpleAlert=driver.switchTo().alert();
		System.out.println("Text of the simple Alert box"+SimpleAlert.getText());
		SimpleAlert.accept();
		Thread.sleep(4000);
		
	}
	@Test(enabled=false)
	public void handlingConfirmAlert() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement DismissAlert=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		DismissAlert.click();

		Alert ConfirmAlert=driver.switchTo().alert();
		ConfirmAlert.accept();
		WebElement OkText=driver.findElement(By.xpath("//div[starts-with(text(),'Y')]"));
		System.out.println("OkText"+OkText.isDisplayed());
		
		DismissAlert.click();
		System.out.println(ConfirmAlert.getText());
		ConfirmAlert.dismiss();
		WebElement dismissText=driver.findElement(By.xpath("//div[starts-with(text(),'You pressed Cancel')]"));
		System.out.println("OkText"+dismissText.isDisplayed());
		Thread.sleep(4000);
		
	}
	
	@Test(enabled=false)
	public void handlingAlerts_SendKeys() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement SendKeysLink=driver.findElement(By.id("promptBox"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", SendKeysLink);
		SendKeysLink.click();
		
		Alert SendkeysAlert=driver.switchTo().alert();
		SendkeysAlert.sendKeys("Kiran Kumar Reddy");
		SendkeysAlert.accept();
		//WebElement dismissText=driver.findElement(By.xpath("//div[contains(text(),'Kiran')]')]"));
		//System.out.println("dismissText"+dismissText.isDisplayed());
		
		SendKeysLink.click();
		SendkeysAlert.sendKeys("Kiran Kumar Reddy");
		SendkeysAlert.dismiss();
		//System.out.println("Cancel text"+dismissText.isDisplayed());
		Thread.sleep(4000);
		
	}
	@Test()
	public void ExplicitWait() {
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		WebElement alertBox=driver.findElement(By.xpath("//button[@id='alertBox']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		alertBox=wait.until(ExpectedConditions.elementToBeClickable(alertBox));
		alertBox.click();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
