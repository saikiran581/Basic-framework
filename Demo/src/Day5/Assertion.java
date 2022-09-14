package Day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		String actual = driver.findElement(By.xpath("//span[.='Ernst & Young']")).getText();
		System.out.println(actual);
		String expected = "Ernst & Young";
		Assert.assertEquals(actual, expected);
		System.out.println("Validated Sucessfully");
		driver.close();
	
	}

}
