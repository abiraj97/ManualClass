package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter1 {

	
	@Parameters({"userName","passWord"})
	@Test
	private void test(String s,String s1) {
		   WebDriverManager.chromedriver().setup();
		   
		   ChromeOptions ops=new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   WebDriver driver1=new ChromeDriver(ops);
		   
		 
		   driver1.get("https://www.facebook.com/");
		   driver1.manage().window().maximize();
		   
		   WebElement txtUser = driver1.findElement(By.id("email"));
		   txtUser.sendKeys(s);
		   
		   WebElement txtPass = driver1.findElement(By.id("pass"));
		   txtPass.sendKeys(s1);
	
		   
		   WebElement btnLogin = driver1.findElement(By.name("login"));
		   btnLogin.click();
	  }
}
