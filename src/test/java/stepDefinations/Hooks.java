package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@Before
	public void beforeScenario()
	{
		
		System.out.println("I will execute before each scenario");
	}
	
	@After
	public void afterScenario()
	{
		
		System.out.println("I will execute after each scenario");
	}

	
	  @Before("@SmokeTest") public void beforeOrder0() {
	  
	  System.out.println("before SmokeTest"); }
	 
	
	  @Before("@Regression") public void beforeOrder1() {
	  
	  System.out.println("My before Regression"); }
	  
	  @After("@SmokeTest") public void afterOrder0() {
	  
	  System.out.println("My after smoke"); }
	  
	  @After("@Regression") public void afterOrder1() {
	  
	  System.out.println("My after Regression"); }
	  
	  @BeforeStep
	  public void before_step()
	  {
		  
		  System.out.println("I will execute before each step");
	  }
	 
	  @AfterStep
	  public void afterStep() {
		  
		  System.out.println("I will execute after each step");
	  }
}
