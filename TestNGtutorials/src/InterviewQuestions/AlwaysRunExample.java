package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample 
{

	@Test(enabled=true)
	public void parentsPermission() 
	{
		System.out.println("Permission Given");
		Assert.fail();
	}

	@Test(dependsOnMethods="parentsPermission",alwaysRun=true)
	public void marraige() 
	{
		System.out.println("Marriage Happend");
	}

}
