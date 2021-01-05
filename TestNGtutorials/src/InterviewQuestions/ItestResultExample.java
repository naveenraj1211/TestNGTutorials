package InterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ItestResultExample 
{
	WebDriver driver;

	@BeforeTest
	public void setUp() 
	{
		driver = new ChromeDriver();
		driver.get("");
	}

}
