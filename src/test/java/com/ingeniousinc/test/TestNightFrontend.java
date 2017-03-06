package com.ingeniousinc.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNightFrontend {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/tommy.feng/Downloads/geckodriver-v0.14.0-win64/geckodriver.exe");
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();

		// By default, it will wait for 10 secs
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch tje FireFox browser and visit google page
		driver.get("http://www.8xvip.com/");
		
		// Max the window
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.id("showLoginModalBtn"));
		
		btn.click();
		
		WebElement txtUsername = driver.findElement(By.name("username"));
		
		txtUsername.sendKeys("tommymember1");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		
		txtPassword.sendKeys("7Kcr4iv3");
		
		WebElement btnLogin = driver.findElement(By.id("headerLoginFormCtlPwdBtn"));
		
		btnLogin.click();

//		// Sleep for 3 secs
//		Thread.sleep(3000);
//
//		// Close the browser
//		driver.quit();
	}
}
