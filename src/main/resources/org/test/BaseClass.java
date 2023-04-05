package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	Actions a;
	Select s;
	JavascriptExecutor js;
	
     public WebDriver launchBrowser(String browserName) {
    	 if (browserName.equals("chrome")) {
 			WebDriverManager.chromedriver().setup();
 			ChromeOptions ops = new ChromeOptions();
 			//ops.setBinary("/Applications/Google Chrome Beta.app/Contents/MacOS/Google Chrome Beta");
 			ops.addArguments("--remote-allow-origins=*");
 			driver = new ChromeDriver(ops);
 	}
 		
 		else if (browserName.equals("firefox")) {
 			WebDriverManager.firefoxdriver().setup();
 			driver=new FirefoxDriver();
 	}	
 		
 		else if (browserName.equals("edge")) {
 			WebDriverManager.edgedriver().setup();
 			driver=new EdgeDriver();
 	}
 		return driver;
 	}
     
     
     //Browser 
        public void launchUrl(String Url) {
			driver.get(Url);
			
    }	
        
        public void maximizeWindow() {
			driver.manage().window().maximize();
			
    }
        
        public void locatorId(String data) {
			WebElement element = driver.findElement(By.id(data));
		}
        
     
        public void type(WebElement element,String data) {
			element.sendKeys(data);		
	}     
     
        public void btnClick(WebElement element) {
			element.click();
	}
     
        public void quitBrowser() {
			driver.quit();
    } 
     
        public String getPageUrl() {
			String url = driver.getCurrentUrl();
			return url;	
	}     
     
        public String getPageTitle() {
			String title = driver.getTitle();
			return title;
	}
     
        public String getPageText(WebElement element) {
			String text = element.getText();
			return text;
	} 
        
        public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
	}
     
        
       //Actions
       public void mouseOverAction(WebElement element) {
		    a=new Actions(driver);
		    a.moveToElement(element).perform();
	}
       
       public void dragAndDropAction(WebElement e1,WebElement e2) {
		    a=new Actions(driver);
		    a.dragAndDrop(e1, e2).perform();
	}
       
       public void dropAndDown(WebElement element,String value ) {
		    Select s=new Select(element);
		    s.selectByValue(value);
    	 
	}
       public void rightClick(WebElement element) {
		    a=new Actions(driver);
		    a.contextClick(element).perform();
	}
       
       public void contextClickAction(WebElement element) {
		    a=new Actions(driver);
		    a.contextClick(element).perform();
	}
       
       public void keyDownAndKeyUpAction(WebElement e1,Keys k1,String s1) {
		   a=new Actions(driver);
		   a.keyDown(e1,k1).sendKeys(e1,s1).keyUp(e1,k1);
	}
       
       public void doubleClick(WebElement element) {
		    a=new Actions(driver);
		    a.doubleClick(element).perform();
	}
     
       
       //Alert
             
       
      public TargetLocator switchToElement() {
    	   TargetLocator locator = driver.switchTo();
		   return locator;
		
	}
       public Alert switchToAlert() {
		   Alert al = switchToElement().alert();
		   return al;
	}
       
       public void alertAccept() {
		   switchToAlert().accept();
	}
       
       public void alertDismiss() {
		  switchToAlert().dismiss();
	}
	
       //ScreenShot
       
       public void webPageScreenShot(String loc) throws IOException {
		 TakesScreenshot ss=(TakesScreenshot)driver;
		 File src = ss.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\Users\\Abiraj\\eclipse-workspace\\Employee\\Lib\\"+loc+".png");
		 FileUtils.copyFile(src, dest);
		 
	}
     
       public void WebElementScreenShot(WebElement element,String loc) throws IOException {
		 File src = element.getScreenshotAs(OutputType.FILE);
		 File dest=new File(loc);
		 FileUtils.copyFile(src, dest);
	}
       
       //Select
       
       public void selectByIndexOf(WebElement element,int i) {
    	   s=new Select(element);
    	   s.selectByIndex(i);
    
	}
       
       public void selectByValueOf(WebElement element,String i) {
		  s=new Select(element);
		  s.selectByValue(i);
	}
       
       public void selectByTextOf(WebElement element,String i) {
		  s=new Select(element);
		  s.selectByVisibleText(i);
	}
       
       public void selectIsMultiple(WebElement element) {
		  s=new Select(element);
		  s.isMultiple();
	}
       
       public String getSelectedOptions(WebElement element) {
		  s=new Select(element);
		  List<WebElement> all = s.getAllSelectedOptions();
		  for (int i = 0; i < all.size(); i++) {
		  WebElement e = all.get(i);
		  String text = e.getText();
	}
		return null; 
	}
       
       public String selectFirstSelectedOption(WebElement element) {
		 s=new Select(element);
		 WebElement first = s.getFirstSelectedOption();
		 String text = first.getText();
		return text;
		 
	}
       public void deselectByIndexOf(WebElement element,int i) {
		s=new Select(element);
		s.deselectByIndex(i);
	}
       
       public void deselectByTextOf(WebElement element,String i) {
		s=new Select(element);
		s.deselectByVisibleText(i);
	}
       
       public void deselectByValueOf(WebElement element,String i) {
		s=new Select(element);
		s.deselectByValue(i);
	}
       
       //Navigate Methods
       
       public Navigation pageNavigate() {
		Navigation navigate = driver.navigate();
		return navigate;
		
	}
       
       public void navigateToUrl(String Url) {
		pageNavigate().to(Url);
	}
       
       public void navigateToFrontPage() {
		pageNavigate().forward();
	}
       
       public void navigateToBackpage() {
    	pageNavigate().back();
    	
	}
       
      public void pageRefresh() {
		pageNavigate().refresh();
	}
      
      //JavaScriptExecutor
      
      public void jsInsert(String data,WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
	}
      
      public void jsClick(WebElement element) {
    	  js=(JavascriptExecutor)driver;
    	  js.executeScript("arguments[0].click()",element);
		
	}
      
      public void jsGetAttributeValue(WebElement element) {
		js=(JavascriptExecutor)driver;
		Object obj = js.executeScript("return arguments[0].getAttribute('value')",element);
		String s=(String)obj;
		System.out.println(s);
	}
      
      
      
     public void jsScrollDown(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	} 
     
     public void jsScrollUp(WebElement element) {
    	 js=(JavascriptExecutor)driver;
    	 js.executeScript("arguments[0].scrollIntoView(false)",element);
		
	}
     
     //Windows Handling
     
     public void windowHandle() {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
	}
     
     public Set<String> windowHandles() {
		Set<String> handles = driver.getWindowHandles();
		for (String x : handles) {
			System.out.println(x);
	}
		return handles;
	}
     
      public void switchToWindow(String s1,String s2) {
		if (!s.equals(s2)) {
			driver.switchTo().window(s2);
	}
	
	}
      
    //Frames
      
      public void frameSwitchById(String Id) {
		 switchToElement().frame(Id);
	}
      
      public void frameSwitchByName(String name) {
		 switchToElement().frame(name);
		 
	}
      
      public void frameSwitchByWebElement(String element) {
		 switchToElement().frame(element);
	}
      
      public void frameSwitchByIndex(int i) {
		 switchToElement().frame(i);
	}
      
      public String getDataFromExcel(String excelLoc,String sName,int rNo,int cNo) throws IOException {
		
    	  String value=null;
    	  File loc=new File(excelLoc);
    	  FileInputStream fIn= new FileInputStream(loc);
    	  Workbook w=new XSSFWorkbook(fIn);
    	  Sheet s=w.getSheet(sName);
    	  Row r = s.getRow(rNo);
    	  Cell c = r.getCell(cNo);
    	  int type = c.getCellType();
    	  
    	  if (type==1) 
        {
			 value = c.getStringCellValue();
			
		}
    	  else if (type==0)
        {
		       if (DateUtil.isCellDateFormatted(c)) 
		{
			Date date = c.getDateCellValue();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		    sdf.format(date);	
		}
		       else {
				double d = c.getNumericCellValue();
				long l=(long)d;
			}
		}
		
		return value;
    	  
	}
	}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
     
