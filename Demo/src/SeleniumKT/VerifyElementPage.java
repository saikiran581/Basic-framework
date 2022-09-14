package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyElementPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		String expected = driver.findElement(By.className("card-body")).getText();
		Assert.assertEquals("Elements", expected);
		System.out.println("Verified sucessfully");
		driver.close();

	}

}
