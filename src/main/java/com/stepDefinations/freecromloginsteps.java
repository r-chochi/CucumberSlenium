package com.stepDefinations;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.util.TestBase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
import org.junit.Assert;

public class freecromloginsteps {

	public class HomePageSteps extends TestBase {
		
		LoginPage loginpage;
		HomePage homepage;
		
		
		
		
		@Given("^user launch the browser$")
		public void user_launch_the_browser() throws Throwable {
			TestBase.initialization();
			
		}
		
		@Then("^User is on the login page$")
		public void user_is_on_the_login_page() throws Throwable {
			LoginPage loginpage = new LoginPage();
			String tittle = loginpage.validateLoginPageTitle();
			Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", tittle);
		}

		@Then("^user enters username and password$")
		public void user_enters_username_and_password() throws Throwable {
			 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		}

		@Then("^validate home page tittle$")
		public void validate_home_page_tittle() throws Throwable {
			String homeTittle = homepage.verifyHomePageTitle();
			Assert.assertEquals("CRMPRO", homeTittle);	    
 
		}
		
		@Then("^validate logged in username$")
		public void validate_logged_in_username() throws Throwable {
			boolean flag = homepage.verifyCorrectUserName();
			Assert.assertTrue(flag);
		}
	}

}
