package Testpackages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.classbase;
import pages.Homepage;

public class homepagetest extends classbase
{
public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializesetup();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	
	
	@Test
	public void validatetitletest()
	{
		Homepage hp=new Homepage(driver);
		String exptitle="GreenKart - veg and fruits kart";
		String acttitle=hp.validtitle();
		//assertEquals(acttitle, exptitle);
		Assert.assertEquals(acttitle, exptitle, "title check du");		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
