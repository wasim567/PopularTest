package stepDefinations;

import io.cucumber.java.en.And;

public class StepDefination2 {

	 @And("^initiated the browser$")
	    public void initiated_the_browser() throws Throwable {
	       System.out.println("initiated the browser");
	    }
}
