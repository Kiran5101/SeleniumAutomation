import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedDriverActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UserName_Entry=driver.findElement(By.name("username"));
		WebElement PassWord_Entry=driver.findElement(By.name("password"));
		WebElement Login_Button=driver.findElement(By.xpath("//button[starts-with(@class,'oxd')]"));
		UserName_Entry.clear();
		UserName_Entry.sendKeys("Admin");
		Thread.sleep(2000);
		PassWord_Entry.clear();
		PassWord_Entry.sendKeys("admin123");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(4000);
		driver.close();
	}

}
