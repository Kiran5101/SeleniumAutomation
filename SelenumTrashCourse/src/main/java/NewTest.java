import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @Test()
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
  @AfterTest()
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }

}
