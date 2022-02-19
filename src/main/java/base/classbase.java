package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classbase 
{
public  WebDriver driver;
public  Properties prop;


public WebDriver initializesetup() throws IOException
{

	String data_path="C:\\Users\\Sujay\\eclipse-workspace\\mamz\\src\\main\\resources\\propertiyfiles\\data.properties";

	prop=new Properties();
	FileInputStream fsi = new FileInputStream(data_path);
	prop.load(fsi);
	

	String edge_exe="C:\\Users\\Sujay\\Desktop\\api\\msedgedriver.exe";
	System.setProperty("webdriver.edge.driver", edge_exe);
	driver=new EdgeDriver();		
	//driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	return driver;
	
}



}
