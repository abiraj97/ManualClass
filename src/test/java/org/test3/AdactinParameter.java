package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinParameter {
	
	public static WebDriver driver;
		
	
	@Parameters({"username","password"})
	@Test(priority=-10)
	
	private void login(String s,String s1) {
		

	 WebDriverManager.chromedriver().setup();
	   
	   ChromeOptions ops=new ChromeOptions();
	   ops.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(ops);	
	   
	 
	   driver.get("https://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	   
	   WebElement txtUser = driver.findElement(By.id("username"));
	   txtUser.sendKeys(s);
	   
	   WebElement txtPass = driver.findElement(By.id("password"));
	   txtPass.sendKeys(s1);

	   
	   WebElement btnLogin = driver.findElement(By.name("login"));
	   btnLogin.click();
}
	
	   
	  @Parameters({"location","hotels","room_type","room_nos","adult_room","child_room"})
	  @Test(priority=-5)
	
	   private void SearchHotel(String s,String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
	    
		  WebElement loc = driver.findElement(By.id("location"));
		   loc.sendKeys(s);
		   
		   WebElement hotel = driver.findElement(By.id("hotels"));
		   hotel.sendKeys(s1);
		   
		   WebElement roomtype = driver.findElement(By.id("room_type"));
		   roomtype.sendKeys(s2);
		   
		   WebElement nor = driver.findElement(By.id("room_nos"));
		   nor.sendKeys(s3);
		   
		   WebElement adult = driver.findElement(By.id("adult_room"));
		   adult.sendKeys(s4);
		   
		   WebElement child = driver.findElement(By.id("child_room"));
		   child.sendKeys(s5);
		   
		   WebElement btnLogin = driver.findElement(By.name("Submit"));
		   btnLogin.click();
		   
		   WebElement radLogin = driver.findElement(By.name("radiobutton_0"));
		   radLogin.click();
		   
		   WebElement btncon = driver.findElement(By.name("continue"));
		   btncon.click();
		   
		  // Thread.sleep(3000);
	
		}
	  
	       
	 
	      @Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
		  @Test(priority=-1)
	
	      private void bookHotel(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException {
				
	    	  
	    	  
	    	  WebElement fname = driver.findElement(By.id("first_name"));
	    	  fname.sendKeys(s);
			   
			   WebElement lname = driver.findElement(By.id("last_name"));
			   lname.sendKeys(s1);
			   
			   WebElement add = driver.findElement(By.id("address"));
			   add.sendKeys(s2);
			   
			   WebElement ccnum = driver.findElement(By.id("cc_num"));
			   ccnum.sendKeys(s3);
			   
			   WebElement cctype = driver.findElement(By.id("cc_type"));
			   cctype.sendKeys(s4);
			   
			   WebElement month = driver.findElement(By.id("cc_exp_month"));
			   month.sendKeys(s5);
			   
			   WebElement year = driver.findElement(By.id("cc_exp_year"));
			   year.sendKeys(s6);
			   
			   WebElement cvv = driver.findElement(By.id("cc_cvv"));
			   cvv.sendKeys(s7);
			   
			   WebElement btnLogin = driver.findElement(By.name("book_now"));
			   btnLogin.click();
			   Thread.sleep(5000);
               WebElement order = driver.findElement(By.id("order_no"));
			   
               
               
               
			   String attribute = order.getAttribute("value");
			   System.out.println("Booking-----"+attribute);
	      }

	  }	

