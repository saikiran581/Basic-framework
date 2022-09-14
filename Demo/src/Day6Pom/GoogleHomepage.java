package Day6Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomepage {

	WebDriver driver;

	public GoogleHomepage(WebDriver driver) {
		this.driver = driver;
	}

	By searchBox = By.name("q");
	By googlebutton = By.name("btnK");
	By gmailLink = By.linkText("Gmail");

	public WebElement Searchbox() {
		return driver.findElement(searchBox);

	}

	public WebElement Googlebutton() {
		return driver.findElement(googlebutton);

	}

	public WebElement GmailLink() {
		return driver.findElement(gmailLink);

	}

}
