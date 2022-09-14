package Selenium;

import org.openqa.selenium.By;

public class Sample extends BaseClass {
	public static void main(String[] args) throws Throwable {
		initBrowser();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("userName")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("userEmail")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.id("currentAddress")).sendKeys(prop.getProperty("address"));
		driver.close();
	}
 
}
