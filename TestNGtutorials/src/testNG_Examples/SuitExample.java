package testNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample 
{
	WebDriver driver;
	long StartTime;
	@BeforeSuite
	public void BeforeSuite() 
	{
		StartTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void OpenGoogle() 
	{	
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void OpenBing() 
	{
		driver.get("https://www.bing.com/");	
	}
	
	@Test
	public void OpenYahoo() 
	{
		driver.get("https://in.yahoo.com/");
	}
	
	@AfterSuite
	public void AfterSuite() 
	{
		long EndTime = System.currentTimeMillis();
		long TotalTime =EndTime - StartTime;
		System.out.println("Total time taken for execution: "+TotalTime);
		driver.quit();;
	}
	
	
	
	
}
