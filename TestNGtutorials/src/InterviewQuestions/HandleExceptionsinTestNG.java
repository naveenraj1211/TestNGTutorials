package InterviewQuestions;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class HandleExceptionsinTestNG 
{

	@Test( timeOut=2000,expectedExceptions=ThreadTimeoutException.class)
	public void testCase() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Testing Multiple Times");
	}
}
