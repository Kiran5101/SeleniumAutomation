package FirstSeleniumCourse.FirstSeleniumCourse;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestUtils.GenericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericTestCases {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=WebDriverManager.chromedriver().create();
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test(dataProvider="ExcelData",dataProviderClass=GenericMethods.class,enabled=false)
	public void readingExcelData(String Username,String Pass)throws InterruptedException{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UserName=driver.findElement(By.xpath("//input[@name='username']"));
		WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement Login_button=driver.findElement(By.xpath("//button[text()=' Login ']"));
		
		UserName.sendKeys(Username);
		Password.sendKeys(Pass);
		Login_button.click();
		Thread.sleep(3000);	
	}
	@Test(priority=2)
	public void brokenLinksAndImagesHandling() throws MalformedURLException, IOException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		List<WebElement> allList=driver.findElements(By.tagName("a"));
		allList.addAll(driver.findElements(By.tagName("img")));
		System.out.println(allList.size());
		List<WebElement> actList=new ArrayList<WebElement>();
		for(int i=0;i<allList.size();i++) {
			if(allList.get(i).getAttribute("href")!=null) {
				actList.add(allList.get(i));
			} 
		}
		System.out.println(actList.size());
		
	for(int j=0;j<actList.size();j++) {
		System.out.println(actList.get(j).getAttribute("href"));
		HttpURLConnection connection=(HttpURLConnection)new URL(actList.get(j).getAttribute("href")).openConnection();
		connection.connect();
		int status=connection.getResponseCode();
		connection.disconnect();
		System.out.println(actList.get(j).getAttribute("href")+"-------->"+status);
				
	}
	}
	@Test
	public void selectClass() throws InterruptedException{
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select select_Day=new Select(Day);
		select_Day.selectByValue("2rt9");
		
		Select select_month=new Select(Month);
		select_month.selectByIndex(0);
		
		Select select_year=new Select(Year);
		select_year.selectByValue("1994");
		
		Thread.sleep(4000);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
