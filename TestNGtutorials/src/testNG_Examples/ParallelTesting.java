package testNG_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting
{

	@Test
	public void getGoogle(){
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

	@Test
	public void getBing(){
		System.setProperty("webdriver.chrome.driver", "C:\\MyCompetency_TestAutomation\\MyCompetency_Regression_Automation\\Servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.bing.com");
		driver.quit();
	}
	
	
}
