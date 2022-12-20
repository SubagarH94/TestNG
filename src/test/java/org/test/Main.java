package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main extends Baseclass {
	
@BeforeClass
private void beforeclass() {
	launchbrowser("chrome");
}
	
	@AfterClass
	private void afterclass() {
driver.quit();
	}
	
	@BeforeMethod
	private void beforemethod() {
		Date d= new Date();
		System.out.println("test1"+d);
		System.out.println("Before method");
	}
	
	@AfterMethod
	private void aftermethod() {

	}
	@Test
	private void test1() {
		UrlLaunch("https://adactinhotelapp.com");
		Waits(20);
		
	}
	
	
}
	



