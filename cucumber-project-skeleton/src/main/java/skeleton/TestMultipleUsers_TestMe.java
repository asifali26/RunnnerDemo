package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMultipleUsers_TestMe {
WebDriver driver;
@Given("I am launching test me application in chrome")
public void i_am_launching_test_me_application_in_chrome() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("code for launch");
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	
}

@Given("I click on the sign in link")
public void i_click_on_the_sign_in_link() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("code for signin link");
	driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
}

@When("I provide username {string}")
public void i_provide_username(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("username"+string);
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
}

@When("I provide password {string}")
public void i_provide_password(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("password"+string);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
}

@Then("I click on Login button and verify the status")
public void i_click_on_Login_button_and_verify_the_status() {
    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//input[@name='Login']")).click();
	  String LoginVal = driver.getTitle();
	  String s="Home";
	  if(LoginVal.equals(s))
		 {System.out.println("login successful");
	}
	 else {
		 System.out.println("login not successfull");
		 
	 }
	  driver.close();
	 }


}
