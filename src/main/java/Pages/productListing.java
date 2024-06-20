package Pages;

import org.openqa.selenium.By;

import Utilities.baseClass;

public class productListing extends baseClass {
	public void verifyProduct() {
		homePage homepage=new homePage();
		loginPage loginpage=new loginPage();
		productDetailPage productlist =new productDetailPage();
		driver.findElement(By.id("dropdown-test--PDP_SELECT_SIZE_DROPDOWN"));
		driver.findElement(By.xpath("//*[@id=\"PDP_SELECT_SIZE_DROPDOWN\"]/option[3]")).click();
		driver.findElement(By.id("add-to-bag-button")).click();
		
		
	}

}
