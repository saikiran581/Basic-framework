package Day6Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPage {
	WebDriver driver;

	public GmailPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchText = By.xpath("\"//span[.='Ernst & Young']\"");

	public WebElement SearchText() {
		return driver.findElement(searchText);

	}

}
