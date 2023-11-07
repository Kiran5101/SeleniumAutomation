package TestUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesConcept {
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\P Kiran Kumar Reddy\\eclipse-workspace\\FirstSeleniumCourse\\src\\main\\java\\TestUtils\\config.properties");
		pro.load(ip);
		System.out.println(pro.getProperty("browser"));
	}

}
