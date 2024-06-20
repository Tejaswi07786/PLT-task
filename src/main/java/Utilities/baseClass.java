package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass { 
	public static Properties prop;
	public static WebDriver driver;
	public baseClass() {
		
	
	prop=new Properties();
	  try {
		  FileInputStream fis = new FileInputStream("/Users/tejaswi/eclipse-workspace/TaskPLT/src/main/java/Config/config.properties");
		  prop.load(fis);
	  }
	  catch(IOException e) {
	       e.getMessage();

	  }
	}
	  public static void initialization() {
		  

		   
		  String browserName=prop.getProperty("browser");
		   if(browserName.equals("chrome")) {
			   //Object webDriverManager;
			WebDriverManager.chromedriver().setup();
			   driver.get("https://www.prettylittlething.com/");
			  
			 //System.setProperty("webdriver.chrome.driver","C:\\JavaProjects\\PLTWebsite\\src\\main\\resources\\Drivers\\Chrome\\chromedriver.exe"); 
			   driver=new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get(prop.getProperty("url"));
		
			   
				   }
	  }
	 
			  
			 
}
