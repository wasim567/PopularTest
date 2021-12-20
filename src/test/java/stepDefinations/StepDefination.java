package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	
	 @Given("^user is on Login page$")
	    public void user_is_on_login_page() throws Throwable {
	        
	    }

	 @When("^user enters the correct username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enters_correct_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	       System.out.println(strArg1+" "+strArg2);
	    }


	    @Then("^user is navigated to Homepage sucessfully$")
	    public void user_is_navigated_to_homepage_sucessfully() throws Throwable {
	        
	    }

	    @And("^clicks on submit$")
	    public void clicks_on_submit() throws Throwable {
	        
	    }
	    
	    @When("^user enters the following details$")
	    public void user_enters_the_following_details(DataTable tb) throws Throwable {
	     List<List<String>> ob=    tb.asLists();
	       System.out.println(ob.get(0).get(1));
	       System.out.println(ob.get(1).get(3));
	     
	    }
	    
	    @When("^user enters correct username (.+) and password (.+)$")
	    public void user_enters_correct_username_and_password(String username, String password) throws Throwable {
	        System.out.println(username+" "+password);
	    }
	    
	    @When("^user fills the form$")
	    public void user_fills_the_form() throws Throwable {
	       System.out.println("User filled the form");
	    }
	    
	    @Given("^user clears the cache$")
	    public void user_clears_the_cache() throws Throwable {
	       System.out.println("user clears the cach");
	    }

	   
}
