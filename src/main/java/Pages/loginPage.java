package Pages;

import org.openqa.selenium.By;

import Utilities.baseClass;

public class loginPage extends baseClass {
	public void login() {
	driver.findElement(By.id("account-link")).click();
	driver.findElement(By.id("login-email")).sendKeys("tejaqa94@gmail.com");
	driver.findElement(By.id("login-password")).sendKeys("Boohoo@1233");
	driver.findElement(By.id("login-tab")).click();
	String logintitle = driver.getTitle();
	System.out.println(logintitle);
	}
}