package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static String currDir = System.getProperty("user.dir");
	public static Properties prop;

	public static void initBrowser() throws Throwable {
		configFile();
		System.out.println("User dir :::" + currDir);

		if (prop.getProperty("browserType").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (prop.getProperty("browserType").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (prop.getProperty("browserType").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\Drivers\\geckodriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("Given" + prop.getProperty("browserType") + " have to impliment");
		}
	}

	public static void configFile() throws Throwable {
		FileInputStream fis = new FileInputStream(currDir + "\\Confi\\application.properties");
		prop = new Properties();
		prop.load(fis);
	}
}
