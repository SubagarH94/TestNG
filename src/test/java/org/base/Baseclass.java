package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static WebDriver Launchbrowser() {
		WebDriverManager.chromedriver().setup();
		return driver;
	}
	public static WebDriver launchbrowser(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		return driver;
		
	}
	public static void UrlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void quit() {
		driver.quit();
	}
	public static void Waits(int t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}
	public void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void click(WebElement e) {
		e.click();
		
	}
	public static String getelements(WebElement e) {
		String Text= e.getText();
		return Text;
	}
	public static String getattributes(WebElement e, String Value) {
		String attributes= e.getAttribute(Value);
		return attributes;
		
	}
	
	
	
	
	
	

}
