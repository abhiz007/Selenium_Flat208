package com.selenium.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserLaunch {
	public static String url="http://www.google.com";
	public static void main(String[] args) throws MalformedURLException{
		//DesiredCapabilities capability = DesiredCapabilities.firefox();
		WebDriver driver;
		//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"),capability);
		// just like that adding more
		driver = new FirefoxDriver();
		driver.get(url);
		driver.getCurrentUrl();
		driver.close();
	}
}
