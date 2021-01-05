package InterviewQuestions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListeners implements IRetryAnalyzer
{

	int failedcount= 0;
	int retrylimit=4;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(failedcount<retrylimit) 
		{
			failedcount++;
			return true;
		}		
		return false; //false means no retry; true means retry
	}

	
	
	
}
