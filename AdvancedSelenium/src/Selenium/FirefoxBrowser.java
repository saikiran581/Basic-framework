package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HR463VZ\\eclipse-workspace\\AdvancedSelenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
