package testNG_Examples;

import org.testng.annotations.Test;

public class SkipTestCaseExample
{
	// enabled=true/false is attribute to @test annotation
	@Test (priority=3, enabled=true)
	public void turnOnMusic(){
		System.out.println("Rock Music On");
	}
	
	@Test (priority=2)
	public void startEngine(){
		System.out.println("Engine started");
	}
	
	@Test (priority=4)
	public void putFirstGear(){
		System.out.println("Car is in first Gear");
	}
	
	@Test (priority=5)
	public void putSecondGear(){
		System.out.println("Car is in second Gear");
	}
	
	@Test (priority=6)
	public void putThirdGear(){
		System.out.println("Car is in third Gear");
	}
	
	
	
}
