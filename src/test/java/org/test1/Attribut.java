package org.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class Attribut extends BaseClass{
        public Attribut() {
             PageFactory.initElements(driver, this);
        }

          @FindBy(id="order_no")
          private WebElement orderNo;
          
          @FindBy(id="search_hotel")
          private WebElement search;
          
			
	
		public WebElement getOrderNo() {
			return orderNo;
		}

		public WebElement getSearch() {
			return search;
		}

          
}


