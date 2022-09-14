package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Day6Pom.GoogleHomepage;

public class TC1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	GoogleHomepage ghp= new GoogleHomepage(driver);
	driver.get("https://www.google.com/");
	ghp.Searchbox().sendKeys("EY");
	ghp.Googlebutton().click();
	
	
}
}
