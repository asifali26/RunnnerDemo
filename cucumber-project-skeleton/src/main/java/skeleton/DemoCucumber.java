package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoCucumber {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login page");
		//throw new cucumber.api.PendingException();
	}

	@When("user provides the correct credentials")
	public void user_provides_the_correct_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("crendentials");
	    //throw new cucumber.api.PendingException();
	}

	@Then("user rendered to TestMeApp home page")
	public void user_rendered_to_TestMeApp_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page");
	    //throw new cucumber.api.PendingException();
	}

}
