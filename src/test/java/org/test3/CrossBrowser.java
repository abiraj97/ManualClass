package org.test3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	  WebDriver driver;
	  @Parameters("browser Name")
	  @Test
	
	private void cross(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ops=new ChromeOptions();
			   ops.addArguments("--remote-allow-origins=*");
			    driver=new ChromeDriver(ops);	
			    System.out.println("chrome");
			
		}
		else if (bName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("firefox");
		}
		else if (bName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("edge");
		}
		else {
			System.out.println("Invalid Browser");
		}
	}
}
