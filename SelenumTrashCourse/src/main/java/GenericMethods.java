import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericMethods {
	static WebDriver driver;
	
	public static void takesScreenshot(String filename) throws IOException {
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("C:\\Users\\P Kiran Kumar Reddy\\git\\SeleniumAutomation\\SelenumTrashCourse\\Screenshots\\"+filename+".png"));
	}
	public List<Double> verifyDescendingorder(){
		ArrayList<Double> list1=new ArrayList<Double>();
		list1.add(20.67);
		list1.add(34.56);
		list1.add(14.19);
		list1.add(11.89);
		for(int i=0;i<list1.size();i++) {
			for(int j=i+1;j<list1.size();j++) {
				if(list1.get(i)>list1.get(j)) {
					break;
				}
				else
				{
					System.out.println("mnot in descending order");
				}
			}
		}
		
		return list1;
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		takesScreenshot("Hello world");
		GenericMethods GM=new GenericMethods();
		GM.verifyDescendingorder();
	}
}
