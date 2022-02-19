package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import base.classbase;

public class Homepage extends classbase
{	
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public  String validtitle()
	{
		String acttitle=driver.getTitle();
		return acttitle;
		
	}

	
	
	
}
