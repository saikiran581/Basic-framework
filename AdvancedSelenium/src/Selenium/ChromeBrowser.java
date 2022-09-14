package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser extends BaseClass{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HR463VZ\\eclipse-workspace\\AdvancedSelenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("abcd");
		driver.findElement(By.id("userEmail")).sendKeys("abcd");
		driver.findElement(By.id("currentAddress")).sendKeys("abcd");
		
	}

}
