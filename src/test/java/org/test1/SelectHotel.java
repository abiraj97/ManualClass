package org.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class SelectHotel extends BaseClass {
      public SelectHotel() {
    	  PageFactory.initElements(driver, this);
    	  
	}
        @FindBy(id="radiobutton_0")
        private WebElement radiobutton;
        
        @FindBy(id="continue")
        private WebElement continueBtn;

		public WebElement getRadiobutton1() {
			return radiobutton;
		}

		public WebElement getContinueBtn1() {
			return continueBtn;
		}

		
		}
      
      
      
      
      
      

