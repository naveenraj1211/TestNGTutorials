/**
 * 
 */
package testNG_Examples;

import org.testng.annotations.Test;

/**
 * @author naveenraj.durairaj
 *
 *A Scenario: Shop is having three types of mobile phones; We want run only only one type of mobile phones 
 */
public class GroupingExample 
{

	@Test (groups = {"Apple"})
	public void apple1() 
	{
		System.out.println("Test Apple device 1");
	}

	@Test (groups = {"Apple"})
	public void apple2() 
	{
		System.out.println("Test Apple device 2");
	}
	
	
	@Test (groups = {"Nokia"})
	public void Nokia1() 
	{
		System.out.println("Test Nokia device 1");
	}

	@Test (groups = {"Nokia"})
	public void Nokia2() 
	{
		System.out.println("Test Nokia device 2");
	}
	
	@Test (groups = {"OnePlus"})
	public void OnePlus1() 
	{
		System.out.println("Test OnePlus device 1");
	}

	@Test (groups = {"OnePlus"})
	public void OnePlus2() 
	{
		System.out.println("Test OnePlus device 2");
	}
	
	
	@Test (groups = {"Redmi"})
	public void Redmi1() 
	{
		System.out.println("Test Redmi device 1");
	}

	@Test (groups = {"Redmi"})
	public void Redmi2() 
	{
		System.out.println("Test Redmi device 2");
	}
}
