package org.test1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class AdactinDetails extends BaseClass {
     public AdactinDetails() {
    	 PageFactory.initElements(driver, this);
	}
     @FindBy(id="location")
	 private WebElement location;
     
    @FindBy(id="hotels")
	 private WebElement hotels;
    
    @FindBy(id="room_type")
	 private WebElement room;
    
    @FindBy(id="room_nos")
	 private WebElement noOfRoom;
    
    @FindBy(id="datepick_in")
	 private WebElement inDate;
    
    @FindBy(id="datepick_out")
    private WebElement outDate;
    
    @FindBy(id="adult_room")
	 private WebElement adults;
    
    @FindBy(id="child_room")
    private WebElement child;
    
    @FindBy(id="Submit")
	 private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getInDate() {
		return inDate;
	}
	public WebElement getOutDate() {
		return outDate;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChild() {
		return child;
	}
	public WebElement getSearch() {
		return search;
	}
	 


	}

