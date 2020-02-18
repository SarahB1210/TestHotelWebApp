package fr.HotelWebAppTests;

import static org.junit.Assert.*;


import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class HotelWebApp_Test {
	WebDriver driver;
	
	
	@Before
	public void setUp() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://192.168.102.51:9999/HotelWebapp/");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void Test1() {


		PageAccueil page_accueil = PageFactory.initElements(driver, PageAccueil.class);
		PageIndex page_index = page_accueil.search_city(driver);

		List<String> hotel_list= new ArrayList<String>() ;
		hotel_list.add("Hotel Hilton Trafalgar Square Londres 4 étoiles"); 
		hotel_list.add("Hotel Ibis The City Londres 3 étoiles"); 
		
		String hotel_table = driver.findElement(By.xpath("//tbody")).getText();

		for (int i=1; i<= driver.findElements(By.xpath("//tbody/tr")).size(); i++)
		{
			
			for(int j = 0; j < hotel_list.size()-1; j++) {
					
				assertTrue(hotel_table.contains(hotel_list.get(j)));

			}

		}

	}

}
