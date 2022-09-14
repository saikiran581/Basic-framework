package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		String before = driver.findElement(By.xpath("//span[@class='rct-checkbox']/*")).getAttribute("class");
		if (before.contains("rct-icon rct-icon-uncheck"))
			System.out.println("element not Selecte");
		driver.findElement(By.xpath("//span[@class='rct-checkbox']/*")).click();
		System.out.println("element clicked");
		String after = driver.findElement(By.xpath("//span[@class='rct-checkbox']/*")).getAttribute("class");
		if (after.contains("rct-icon rct-icon-check"))
			System.out.println("Selected");
		Thread.sleep(2000);
		driver.close();

	}

}
