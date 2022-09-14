package SeleniumKT;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Elementspage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\msedgedriver.exe");
//		WebDriver driver= new EdgeDriver();
		ChromeOptions opt= new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@id='cbb']")).click();
		driver.findElement(By.xpath("//div[@class='card-body']/child::h5[.='Elements']")).click();
		

		 driver.close();
}
}
