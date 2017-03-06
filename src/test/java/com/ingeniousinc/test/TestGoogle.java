package com.ingeniousinc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * First Selenium 
 * 
 * 參考:
 * 	http://stackoverflow.com/questions/38676719/selenium-using-java-the-path-to-the-driver-executable-must-be-set-by-the-webdr
 * 
 * 要先下載:
 * 	https://github.com/mozilla/geckodriver/releases
 * 
 * @author tommy.feng
 *
 */
public class TestGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/tommy.feng/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// By default, it will wait for 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch tje FireFox browser and visit google page
		driver.get("http://www.google.com.tw");
		
		// Max the window
		driver.manage().window().maximize();

		// Locate the search input field by name = "q"
		WebElement element = driver.findElement(By.name("q"));
		
		// Text input "Facebook"
		element.sendKeys("Facebook");
		
		// simulate the click search button
		element.submit();
		
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		
		// Sleep for 3 secs
		Thread.sleep(3000);

		// Close the browser
		driver.quit();
	}

}
