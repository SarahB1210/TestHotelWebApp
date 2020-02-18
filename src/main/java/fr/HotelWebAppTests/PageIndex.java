package fr.HotelWebAppTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageIndex {

	
	@FindBy (xpath="//tr[2]")
	WebElement hotel_disponibility1;
	
	@FindBy (xpath="//tr[3]")
	WebElement hotel_disponibility2;

	
}
