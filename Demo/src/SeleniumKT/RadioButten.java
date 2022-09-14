package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButten {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		System.out.println(driver.findElement(By.xpath("//p/span[.='Yes']")).getAttribute("span"));
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//label[@for='yesRadio']")).isEnabled());
		
		driver.close();
	}

}
