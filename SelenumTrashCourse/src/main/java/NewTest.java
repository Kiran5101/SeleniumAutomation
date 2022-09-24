import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;
  @BeforeTest()
  public void intialization() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.get("https://www.google.co.in/");
	  driver.get("https://www.facebook.com/");
	  //driver.get("https://demoqa.com/radio-button");
  }
 /* @Test(priority=1)
  public void keyin_Credentials() throws InterruptedException {
	  WebElement Username_Entry=driver.findElement(By.name("username"));
	  WebElement Password_Entry=driver.findElement(By.name("password"));
	  WebElement Login_Button=driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]"));
	  Username_Entry.sendKeys("Admin");
	  Thread.sleep(2000);
	  Password_Entry.sendKeys("admin123");
	  Thread.sleep(2000);
	  Login_Button.click();
	  Thread.sleep(4000);
  }
  @Test(priority=2)
  public void fetchCSSProperties() {
	  //to fetch al the css properties in a single go , we need to depend on the javascriptexecutor
	  WebElement Login_Button=driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]"));
	  WebElement HeadeLogin=driver.findElement(By.xpath("//h5[text()='Login']"));
	  System.out.println(HeadeLogin.getCssValue("font-size"));
	  System.out.println(Login_Button.getCssValue("background-color"));
	  System.out.println(Login_Button.getCssValue("font-size"));
	  System.out.println(Login_Button.getCssValue("font-family"));
	
  }
  @Test(priority=3)
  public void checkKeyEnumClass() throws InterruptedException {
	  WebElement Username_entry=driver.findElement(By.name("username"));
	  Username_entry.sendKeys(Keys.chord(Keys.SHIFT,"admin"));
	  Thread.sleep(2000);
	  Username_entry.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	  Username_entry.sendKeys(Keys.chord(Keys.BACK_SPACE));
	  //Username_entry.clear();
	  Thread.sleep(4000);
  }
  @Test(priority=4)
  public void verifySubmitfunction() throws InterruptedException {
	  WebElement GoogleSearch_Input=driver.findElement(By.name("q"));
	  GoogleSearch_Input.sendKeys("Facebook");
	  WebElement Google_Submit=driver.findElement(By.name("btnK"));
	  System.out.println(Google_Submit.getAttribute("data-ved"));
	  //GetAttribute() method
	  System.out.println(GoogleSearch_Input.getAttribute("name"));
	  GoogleSearch_Input.submit();
	  Thread.sleep(3000);
  }*/
 @Test(priority=5)
 public void verifyWebelementFunctions() {
	 /*WebElement Disabled_Button=driver.findElement(By.xpath("//input[@class='custom-control-input disabled']"));
	 WebElement Yes_Button=driver.findElement(By.id("yesRadio"));
	 WebElement GoogleSearch_Button=driver.findElement(By.name("btnK"));
	 WebElement FacebookLogin_Button=driver.findElement(By.name("login"));
	 System.out.println(FacebookLogin_Button.getAttribute("name"));
	 System.out.println(FacebookLogin_Button.getLocation().getX()+"  "+FacebookLogin_Button.getLocation().getY());
	 System.out.println(FacebookLogin_Button.getTagName());
	 System.out.println(FacebookLogin_Button.getText());
	 System.out.println(FacebookLogin_Button.getLocation());
	 System.out.println(FacebookLogin_Button.getSize());
	 System.out.println(FacebookLogin_Button.isDisplayed());
	 System.out.println(FacebookLogin_Button.isEnabled());
	 System.out.println(FacebookLogin_Button.isSelected());
	 System.out.println(GoogleSearch_Button.getTagName());
	 System.out.println(GoogleSearch_Button.getText());
	 System.out.println(GoogleSearch_Button.getLocation());
	 System.out.println(GoogleSearch_Button.getSize());
	 System.out.println(GoogleSearch_Button.isDisplayed());
	 System.out.println(GoogleSearch_Button.isEnabled());
	 System.out.println(GoogleSearch_Button.isSelected());
	 System.out.println(Disabled_Button.isEnabled());
	 System.out.println(Disabled_Button.isDisplayed());
	 System.out.println(Yes_Button.isDisplayed());*/
	WebElement google=driver.findElement(By.xpath("//input[@name='q']"));
	WebElement mikeIcon=driver.findElement(By.xpath("//div[@class='XDyW0e']"));
	 System.out.println(google.isDisplayed());
	 System.out.println(mikeIcon.isDisplayed());
 }
  @AfterTest()
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }

}
