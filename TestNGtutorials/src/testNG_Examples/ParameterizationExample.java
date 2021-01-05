package testNG_Examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample 
{
	@Test
	@Parameters("Name")
	public void printName(String name) {
		System.out.println("Your name is:"+name);
	}
	
	
	@Test
	@Parameters({"Tester","Tool"}) // to pass multiple parameters use {"X","Y"} and use multiple parameter tag in XML file
	public void printTwoName(String Tester, String Tool) {
		System.out.println("Tester name is:"+Tester);
		System.out.println("Tool name is:"+Tool);
	} 
	
}
