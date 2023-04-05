package org.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinDataProvider {

	public static WebDriver driver;
	
	@org.testng.annotations.DataProvider(name="data")
	private  Object[][] AdactinData() {
	return new Object[][] {{"Abiraj97","Qwerty@123","Sydney","Hotel Sunshine","Double","5","2","2","Abi",
		"Raj","Chennai","4869509087687612","VISA","April","2017","543"}};
	
	}
	@Test(dataProvider="data")
		private void login(String s,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
				String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15) throws InterruptedException {
		

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
		   
	    
		  WebElement loc = driver.findElement(By.id("location"));
		   loc.sendKeys(s2);
		   
		   WebElement hotel = driver.findElement(By.id("hotels"));
		   hotel.sendKeys(s3);
		   
		   WebElement roomtype = driver.findElement(By.id("room_type"));
		   roomtype.sendKeys(s4);
		   
		   WebElement nor = driver.findElement(By.id("room_nos"));
		   nor.sendKeys(s5);
		   
		   WebElement adult = driver.findElement(By.id("adult_room"));
		   adult.sendKeys(s6);
		   
		   WebElement child = driver.findElement(By.id("child_room"));
		   child.sendKeys(s7);
		   
		   WebElement btnsub = driver.findElement(By.name("Submit"));
		   btnsub.click();
		   
		   WebElement radLogin = driver.findElement(By.name("radiobutton_0"));
		   radLogin.click();
		   
		   WebElement btncon = driver.findElement(By.name("continue"));
		   btncon.click();

   	  WebElement fname = driver.findElement(By.id("first_name"));
   	  fname.sendKeys(s8);
		   
		   WebElement lname = driver.findElement(By.id("last_name"));
		   lname.sendKeys(s9);
		   
		   WebElement add = driver.findElement(By.id("address"));
		   add.sendKeys(s10);
		   
		   WebElement ccnum = driver.findElement(By.id("cc_num"));
		   ccnum.sendKeys(s11);
		   
		   WebElement cctype = driver.findElement(By.id("cc_type"));
		   cctype.sendKeys(s12);
		   
		   WebElement month = driver.findElement(By.id("cc_exp_month"));
		   month.sendKeys(s13);
		   
		   WebElement year = driver.findElement(By.id("cc_exp_year"));
		   year.sendKeys(s14);
		   
		   WebElement cvv = driver.findElement(By.id("cc_cvv"));
		   cvv.sendKeys(s15);
		   
		   WebElement btnbook = driver.findElement(By.name("book_now"));
		   btnbook.click();
		   Thread.sleep(5000);
          WebElement order = driver.findElement(By.id("order_no"));
		   
          
          
          
		   String attribute = order.getAttribute("value");
		   System.out.println("Booking-----"+attribute);
     } 
}
