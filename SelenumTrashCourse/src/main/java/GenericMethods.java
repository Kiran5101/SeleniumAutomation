import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import com.google.common.io.Files;

public class GenericMethods {
	static WebDriver driver;
	
	public static void takesScreenshot(String filename) throws IOException {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("C:\\Users\\P Kiran Kumar Reddy\\git\\SeleniumAutomation\\SelenumTrashCourse\\Screenshots\\"+filename+".png"));
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		takesScreenshot("Hello world");
	}
}
