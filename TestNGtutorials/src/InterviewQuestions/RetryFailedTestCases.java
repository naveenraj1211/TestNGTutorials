package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedTestCases
{
	/********
	 	1. We can run testng-failed.xml manually.
		2. Using IRetryAnalyzer Interface we can rerun the failed test cases automatically.
		@Test(retryAnalyzer=RetryListeners.class)
		3. Using IAnnotationTransformer also we can rerun the failed test cases automatically.*********/


	@Test
	public void testCase1()
	{
		Assert.assertEquals(true, false);
	}

	@Test
	public void testCase2()
	{
		Assert.assertEquals(true, false);
	}




}
