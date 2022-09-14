package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WinHandle extends BaseClass {
	public static void main(String[] args) throws Throwable {
		initBrowser();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		Set<String> ids = driver.getWindowHandles();
		System.out.println("Total windows are " + ids.size());
		// we are iterating through the tabs
		Iterator<String> it = ids.iterator();
		String parantid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		driver.close();
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);

	}
}
