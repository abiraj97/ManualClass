package org.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class AdactinBook extends BaseClass{
      public AdactinBook() {
    	  PageFactory.initElements(driver, this);
	}
      
      @FindBy(id="first_name")
      private WebElement Firstname;
      
      @FindBy(id="last_name")
      private WebElement LastName;
      
      @FindBy(id="address")
      private WebElement Address;
      
      @FindBy(id="cc_num")
      private WebElement ccNo;
      
      @FindBy(id="cc_type")
      private WebElement cctype;
      
      @FindBy(id="cc_exp_month")
      private WebElement Month;
      
      @FindBy(id="cc_exp_year")
      private WebElement Year;
      
      @FindBy(id="cc_cvv")
      private WebElement Cvv;
      
      @FindBy(id="book_now")
      private WebElement Book;

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBook() {
		return Book;
	}


      



}










