package FirstSeleniumCourse.FirstSeleniumCourse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebelementActions {
	WebDriver driver;
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get("https://demoqa.com/automation-practice-form");
		driver.get("https://demoqa.com/text-box");
	}
	@Test(priority=1,groups="TextBoxActions",enabled=false)
	public void SendKeys_Method()throws InterruptedException {
		WebElement first_name=driver.findElement(By.xpath("//input[@id='firstName']"));
		first_name.sendKeys(Keys.chord(Keys.SHIFT,"Hello World"));
		Thread.sleep(4000);
		first_name.sendKeys(Keys.chord(Keys.CONTROL,"A"));
		Thread.sleep(4000);
		first_name.sendKeys(Keys.chord(Keys.BACK_SPACE));
		Thread.sleep(4000);
	}
	@Test(priority=2,groups="TextBoxActions",enabled=false)
	public void submitAction() throws InterruptedException{
			WebElement full_Name=driver.findElement(By.xpath("//input[@id='userName']"));
			WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
			WebElement Current_Address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
			WebElement Permanent_Address=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
			WebElement SubmitButton=driver.findElement(By.xpath("//div[starts-with(@id,'perma')]//following-sibling::div[starts-with(@class,'mt-2')]//child::div[starts-with(@class,'text-')]//child::button[@id='submit']"));
			//WebElement LabelName=driver.findElement(By.xpath("//p[@id='name']"));
			
			full_Name.sendKeys(Keys.chord(Keys.SHIFT,"kiran Kumar Reddy"));
			Email.sendKeys(Keys.chord("kiran@gmail.com"));
			Current_Address.sendKeys(Keys.chord(Keys.SHIFT,"Bangalore"));
			Permanent_Address.sendKeys(Keys.chord(Keys.SHIFT,"prakasam"));
			Thread.sleep(3000);
			SubmitButton.click();
			Thread.sleep(6000);
			
			//Assert.assertTrue(LabelName.isDisplayed());
			
	}
	@Test(priority=3,groups="TextBoxActions",enabled=false)
	public void clearMethod() throws InterruptedException{
		WebElement full_Name=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		
		full_Name.sendKeys("hello world");
		Thread.sleep(2000);
		
		Email.sendKeys("Beautiful nature");
		Thread.sleep(2000);
		
		full_Name.clear();
		Thread.sleep(2000);
		
		Email.clear();
		Thread.sleep(2000);
		
	}
	@Test(priority=4,groups="genericActionMethods",enabled=false)
	public void getAttributeMethod() {
		WebElement fullname_TextBox=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement submitButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		
		System.out.println(fullname_TextBox.getAttribute("placeholder"));
		System.out.println(submitButton.getAttribute("class"));
				
	}
	@Test(priority=5,groups="genericActionMethods",enabled=false)
	public void getText() {
		WebElement SubmitButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		WebElement FullName_Label=driver.findElement(By.xpath("//label[starts-with(@id,'userName')]"));
		
		System.out.println("submiton button text :::"+SubmitButton.getText()+"Fullname Label text:::"+FullName_Label.getText());
		
	}
	@Test(priority=6,groups="LayoutMethods",enabled=false)
	public void getLocation_AND_DimensionMethod() {
		WebElement LogoImage=driver.findElement(By.xpath("//img[starts-with(@src,'/im')]"));
		WebElement textBox_Header=driver.findElement(By.xpath("//div[text()='Text Box']"));
		
		System.out.println(LogoImage.getLocation());
		System.out.println(textBox_Header.getSize());
	}
	@Test(priority=7,groups="genericActionMethods",enabled=false)
	public void getCSSValueMethod() {
		WebElement SubmitButton=driver.findElement(By.xpath("//button[text()='Submit']"));
		
		System.out.println(SubmitButton.getCssValue("background-color"));
		System.out.println(SubmitButton.getCssValue("border-color"));
		System.out.println(SubmitButton.getCssValue("text-align"));
		System.out.println(SubmitButton.getCssValue("font-size"));
		System.out.println(SubmitButton.getCssValue("font-family"));
	}
	@Test(priority=8,groups="genericActionMethods",enabled=false)
	public void getTagnameMethod() {
		WebElement CurrentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement PermanentAddress_Label=driver.findElement(By.xpath("//label[text()='Permanent Address']"));
		
		System.out.println(CurrentAddress.getTagName());
		System.out.println(PermanentAddress_Label.getTagName());
	}
	@Test(priority=9,groups="BooleanActionMethods")
	public void Boolean_method()throws InterruptedException {
		WebElement radiobuttons_link=driver.findElement(By.xpath("//span[text()='Radio Button']"));
		
		radiobuttons_link.click();
		WebElement yes_button=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		WebElement no_Button=driver.findElement(By.xpath("//input[@id='noRadio']"));
		WebElement impressive_button=driver.findElement(By.xpath("impressiveRadio"));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement Login_Button=driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]"));
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Login_Button.click();
		Thread.sleep(3000);
		
		
		Thread.sleep(3000);
		
		System.out.println(yes_button.isDisplayed());
		System.out.println(no_Button.isEnabled());
		System.out.println(yes_button.isSelected());
		
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
