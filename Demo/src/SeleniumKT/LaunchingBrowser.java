package SeleniumKT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HR463VZ\\eclipse-workspace\\Demo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Test");
		driver.findElement(By.id("userEmail")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("permanentAddress")).sendKeys("Test@gmacom");
		//driver.findElement(By.id("userName")).clear();
		System.out.println("b4");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//driver.findElement(By.("btn btn-primary")).click();
		System.out.println("after");
		driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']")).getText();
		String url = driver.getCurrentUrl();
		System.out.println("The current page url is "+url);
		System.out.println("Title of the page is"+driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		System.out.println("browsed closed");

	}

}
