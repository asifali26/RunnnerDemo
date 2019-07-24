package DDC2_My_Step_Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyClass {

@Given("I have an account")
public void i_have_an_account() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
System.out.println("have account");
}
	@Given("I will provide the data")
	public void i_will_provide_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	System.out.println("provide data");
	}

	@Then("My Login success")
	public void my_Login_success() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("login success");
	}

	@Given("I have logged in")
	public void i_have_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("logged in");
	}

	@Then("I click on reward points")
	public void i_click_on_reward_points() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("reward points");
	}

	@Then("I will check for my rewards")
	public void i_will_check_for_my_rewards() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("check for rewards");
	}

	@Given("I am offered with referal bonus")
	public void i_am_offered_with_referal_bonus() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("offered with referal bonus");
	}

	@When("I shared the link with my friend")
	public void i_shared_the_link_with_my_friend() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("link with friend");
	}

	@Then("I will get some zeta points")
	public void i_will_get_some_zeta_points() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		System.out.println("zeta points");
	}

	@Then("I will enjoy my friday party")
	public void i_will_enjoy_my_friday_party() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("party");
	}
}
