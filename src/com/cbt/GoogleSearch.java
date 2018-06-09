package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/Vika/Documents/selenium dependencies/driver/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.etsy.com/");
	}

}
