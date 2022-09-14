package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionsClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		// WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		 Actions ac = new Actions(driver);
		 ac.doubleClick(doubleClick).build().perform();
		String Actual = driver.findElement(By.id("doubleClickMessage")).getText();
		String expected = "You have done a double click";
		Assert.assertEquals(Actual, expected);
		System.out.println("Verified");
		
		 
		// ac.contextClick(rightClick).build().perform();
		 
	//	 driver.get("https://demoqa.com/text-box");
//			driver.manage().window().maximize();
//			WebElement textbox = driver.findElement(By.id("userName"));
//			ac.moveToElement(textbox).keyDown(textbox,Keys.SHIFT).sendKeys(textbox,"demo").build().perform();
		 driver.close();
}
}
