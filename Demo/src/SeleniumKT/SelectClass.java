package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='lasttname']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
	
	}

}