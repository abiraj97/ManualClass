package org.test1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin extends BaseClass {
    
	public static void main(String[] args) throws IOException, InterruptedException {
		 AdactinLogin al=new AdactinLogin();
		 al.launchBrowser("chrome");
		 al.launchUrl("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 
		 
		 Adactin a=new Adactin();
		 
		 WebElement txtUser = a.getTxtUser();
		 al.type(txtUser, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 0, 0));
		 
		 WebElement txtPass = a.getTxtPass();
		 al.type(txtPass, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 	1, 0));
		 
         al.btnClick(a.getBtnLogin());	
         
        AdactinDetails ad=new AdactinDetails();
        
        WebElement location = ad.getLocation();
        al.dropAndDown(location,  al.getDataFromExcel ("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 2, 0));
        
        WebElement hotels = ad.getHotels();
        al.dropAndDown(hotels,  al.getDataFromExcel( "C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 3, 0));
        
        WebElement room = ad.getRoom();
        al.dropAndDown(room, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 4, 0));
		
        
        WebElement noOfRoom = ad.getNoOfRoom();
        al.dropAndDown(noOfRoom, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 5, 0));
        
       WebElement adults = ad.getAdults();
       al.dropAndDown(adults,  al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 6, 0));
       
       WebElement child = ad.getChild();
       al.dropAndDown(child,  al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\Book3.xlsx", "Sheet1", 7, 0));
       
       WebElement search = ad.getSearch();
       al.btnClick(search);
       
       
       SelectHotel sh=new SelectHotel();
       
       WebElement radiobutton = sh.getRadiobutton1();
       al.btnClick(radiobutton);
       
       WebElement continueBtn = sh.getContinueBtn1();
       al.btnClick(continueBtn);
       
	
	   AdactinBook ab=new AdactinBook();
	   
	   WebElement firstname = ab.getFirstname();
	   al.type(firstname, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 7, 0));
	   
	   WebElement lastName = ab.getLastName();
	   al.type(lastName, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 8, 0));
	   
	   WebElement address = ab.getAddress();
	   al.type(address, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 9, 0));
	   
	   WebElement ccNo = ab.getCcNo();
	   al.type(ccNo, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 10, 0));
	   
	   WebElement getcctype = ab.getctype();
	   al.type(getcctype, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 11, 0));
	   
	   WebElement month = ab.getMonth();
	   al.type(month, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 12, 0));
	   
	   WebElement year = ab.getYear();
	   al.type(year, al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 13, 0));
	   
	   WebElement cvv = ab.getCvv();
	   al.type(cvv,al.getDataFromExcel("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Excel\\New.xlsx", "Course", 14, 0));
	   
	   WebElement book = ab.getBook();
	   al.btnClick(book);
	   
	   Thread.sleep(5000);
	   
	   
	   Attribut a1=new Attribut();
	  
	   WebElement orderNo = a1.getOrderNo();
	   String attribute = al.getAttribute(orderNo);
	   System.out.println(attribute);
	   
	   WebElement search2 = a1.getSearch();
	   al.jsScrollDown(search2);
	
	   al.webPageScreenShot("Select Hotel");
	}

	
	}
     
	 

