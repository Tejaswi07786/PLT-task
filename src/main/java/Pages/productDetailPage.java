package Pages;

import org.openqa.selenium.By;

import Utilities.baseClass;

public class productDetailPage extends baseClass { 
	public void productList() {
	homePage homepage=new homePage();
	loginPage loginpage=new loginPage();
	driver.findElement(By.id("accordion-Dresses--span")).click();
	String productlistpagetitle = driver.getTitle();
	System.out.println(productlistpagetitle);
	}

}
