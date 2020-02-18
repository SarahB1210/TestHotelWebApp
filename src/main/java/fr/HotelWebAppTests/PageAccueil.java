package fr.HotelWebAppTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil {

	
	@FindBy (xpath="//select[@name=\"ville\"]")
	WebElement list_city;
	
	@FindBy (xpath="//option[@value=\"Londres\"]")
	WebElement city;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	WebElement btn_search;
	
	public PageIndex search_city(WebDriver driver) {
		
		list_city.click();
		city.click();
		btn_search.click();
		
		return PageFactory.initElements(driver, PageIndex.class);
	}
}
