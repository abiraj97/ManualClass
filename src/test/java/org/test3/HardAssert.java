package org.test3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssert {

	
	    @Test
	  
	     public void test1() {
		   WebDriverManager.chromedriver().setup();
		   
		   ChromeOptions ops=new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   WebDriver driver1=new ChromeDriver(ops);
		   
		  // WebDriver driver1=new ChromeDriver();
		   driver1.get("https://www.facebook.com/");
		   driver1.manage().window().maximize();
		  
		   Assert.assertTrue(driver1.getCurrentUrl().contains("facebook"), "Verify Url");
		   
		   WebElement txtUser = driver1.findElement(By.id("email"));
		   txtUser.sendKeys("greens");
		   
		   WebElement txtPass = driver1.findElement(By.id("pass"));
		   txtPass.sendKeys("Greens@123");
		   
		   Assert.assertEquals("Verify Password", "Greens@123", txtPass.getAttribute("value"));
		   
		   WebElement btnLogin = driver1.findElement(By.name("login"));
		   btnLogin.click();
	  }
	  
}
