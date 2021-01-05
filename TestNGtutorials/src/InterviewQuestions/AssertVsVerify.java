package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify 
{
	@Test(description="Hard Assertion",enabled=false)
	public void assertTest() 
	{
		System.out.println("Before Assertion");
		Assert.fail();//Assert.assertEquals(true, false);		
		System.out.println("After Assertion");
	}
	
	@Test(description="Soft Assertion")
	public void assertVerify() 
	{
		System.out.println("Before Assertion");
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail();//It wont fail the test case;continue to execute to following steps
		System.out.println("After Assertion");
	}
	
}
