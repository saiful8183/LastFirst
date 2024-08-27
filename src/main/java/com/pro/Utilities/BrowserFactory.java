package com.pro.Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	

	public static WebDriver launchapplication(WebDriver driver, String browser, String url) {

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			// ChromeOptions options=new ChromeOptions();
			// options.addArguments("--remote-allow-origins='");
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:

			System.out.println("This browser is not supproted");
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;

	}

	public static void quitBrowser(WebDriver driver) {

		driver.quit();

	}

}
