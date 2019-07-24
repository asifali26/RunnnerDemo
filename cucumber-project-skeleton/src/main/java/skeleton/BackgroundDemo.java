package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackgroundDemo {

@Given("user in the TestMe App home page")
public void user_in_the_TestMe_App_home_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Before login home page");
}

@Given("user is in login page")
public void user_is_in_login_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("user in login  page");
}

@When("user provides correct credentials")
public void user_provides_correct_credentials() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Enters correct credentials");
}

@Then("user render to TestMeApp home page")
public void user_render_to_TestMeApp_home_page() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("After login home page");}

@Given("user is on the register page")
public void user_is_on_the_register_page() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user in register page");
}

@Then("user rendered to TestMeApp login page")
public void user_rendered_to_TestMeApp_login_page() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("user in login page after registration");
}

}
