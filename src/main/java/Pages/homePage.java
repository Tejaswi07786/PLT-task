package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.baseClass;

public class homePage extends baseClass {
	
	public static void verifyhomepage(WebDriver driver) {
		baseClass.initialization();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
