package loginStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationClass 
{
	@Given("user should be at login page")
	public void preCondition()
	{
		System.out.println("User is at login page");
	}
	
	@When("user need to enter the username")
	public void enterUserName()
	{
		System.out.println("User Entered the User name");
	}
	
	@When("user need to enter the password")
	public void enterPassword()
	{
		System.out.println("User Entered the Password");
	}
	
	@When("user need to click on login button")
	public void clickOnButton()
	{
		System.out.println("User click on Login Button");
	}
	
	@Then("user should be logged into application")
	public void loginPage()
	{
		System.out.println("User Successfully logged in");
	}
	
	@Given("user is at insurance portal")
	public void user_is_at_insurance_portal() 
	{
	   System.out.println("User is at insurance login portal");
	}

	@Given("user logged into application")
	public void user_logged_into_application() 
	{
	   System.out.println("user logged in to portal");
	}

	@When("user clicked on insurance button")
	public void user_clicked_on_insurance_button() 
	{
	   System.out.println("user clicked on insurance button");
	}

	@When("user clicked on the Car insurance button")
	public void user_clicked_on_the_car_insurance_button() 
	{
	   System.out.println("user clicked on insurance button"); 
	}

	@Then("user is at Car insurance page")
	public void user_is_at_car_insurance_page() 
	{
	   System.out.println("Final Output");
	}


}
