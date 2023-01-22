package com.Utility.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DellBaseClass {

public static Properties prop;

public static WebDriver driver;
	
	
public  DellBaseClass() {
	

try {
	FileInputStream Fls = new	FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Config\\qa\\ConfigFile.properties");
			
	 prop = new Properties();
		
	 prop.load(Fls);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}

	
	
public void intbrowser() {	
	
String browserset = prop.getProperty("Browser1");	

if(browserset.equals("Chrome")) {
	
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");
	
driver= new ChromeDriver();	
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	
	
	
}

else if(browserset.equals("FireFox")) {	
	
}
	
}
	
public static void LaunchURL(String URL) {	
	
driver.get(prop.getProperty("URL"));
	
	
}
	
}
