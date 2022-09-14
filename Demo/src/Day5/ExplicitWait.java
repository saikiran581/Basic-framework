package Day5;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
		System.out.println(driver.findElement(By.id("visibleAfter")).getText());
		driver.close();
	}
}