package org.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Pojo extends BaseClass {

	
	public static void main(String[] args) {}
		
	
	    public Pojo() {
             PageFactory.initElements(driver, this);
	    
	    }
		
	
	
	 @FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	 private WebElement txtUser;
	 @FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
	 private WebElement txtPass;
	    
	 
	 @CacheLookup
	 @FindBy(name="login")
	 
	 private WebElement btnLogin;


	public WebElement getTxtUser() {
		return txtUser;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}
	} 
	 

       