package testNG_Examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample 
{
	String Tester="Automation Tester";
	boolean value = false;
	boolean values = false;

	@Test
	public void firstTestCase() 
	{
		Assert.assertEquals(Tester, "Automation Tester");	
		Assert.assertNotEquals(Tester, "Automat Tester");
		Assert.assertTrue(values,"This value should not be false");
		Assert.assertFalse(value,"This value should not be true");
	}


}
