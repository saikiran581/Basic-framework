package Day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("timerAlertButton")).click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		al.accept();
		System.out.println(text);
		driver.close();
	}

}
