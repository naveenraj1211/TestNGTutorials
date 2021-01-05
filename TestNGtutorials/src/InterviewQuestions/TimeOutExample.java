package InterviewQuestions;

import org.testng.annotations.Test;

public class TimeOutExample 
{

	@Test( timeOut=2000)
	public void testCase() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Testing Multiple Times");
	}
	
	
}
