package org.test3;



import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUNITLaunch {

	   public static WebDriver driver;
		
	   
	   @AfterClass	
	     public static void afterClass() {
	     driver.quit();
    }	   
		   
	   @Before
	     public static void before() {
	     Date d = new Date();
         System.out.println(d);
		   
    }
		   
	   @BeforeClass
		 public static void beforeClass() {
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
    }
		   
	    @After 
		   public void after() {
			 Date d=new Date();
		     System.out.println(d);
    }
		   
	    @Test   
		   public void test1() {
		     WebElement txtUser = driver.findElement(By.id("email"));
		     txtUser.sendKeys("greens");
			   
			 WebElement txtPass = driver.findElement(By.id("pass"));
		     txtPass.sendKeys("greens@123");
			   
		     WebElement btnLogin = driver.findElement(By.name("login"));
		     btnLogin.click();
	}
	}
	
	














