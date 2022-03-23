package com.k2js.seliniumbasics.openurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selinium training by jithendra sir\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		
		driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.get("http://newtours.demoaut.com/");
		driver.getTitle();
		System.out.println("Not Bad cherry");

	}

}
