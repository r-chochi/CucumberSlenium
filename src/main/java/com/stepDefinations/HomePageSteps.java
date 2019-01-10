package com.stepDefinations;
//package StepDefinations;
//
//import com.pages.HomePage;
//import com.pages.LoginPage;
//import com.util.TestBase;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
////import junit.framework.Assert;
//import org.junit.Assert;
//
//public class HomePageSteps extends TestBase {
//	
//	LoginPage loginpage;
//	HomePage homepage;
//	
//
//	
//	@Given("^Given user launch the browser$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		TestBase.initialization();
//	   
//	}
//
//	@When("^Then User is on the login page$")
//	public void title_of_login_page_is_Free_CRM() throws Throwable {
//		LoginPage loginpage = new LoginPage();
//		String tittle = loginpage.validateLoginPageTitle();
//		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", tittle);
//		
//	   
//	}
//
//	//@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	@Then("^Then user enters username and password$")
//	public void user_enters_and(String arg1, String arg2) throws Throwable {
//	   homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
//	  
//	}
//
//	@Then("^Then validate home page tittle$")
//	public void user_clicks_on_login_button() throws Throwable {
//		String homeTittle = homepage.verifyHomePageTitle();
//		Assert.assertEquals("CRMPRO", homeTittle);	    
//	}
//
//	@Then("^Then validate logged in username $")
//	public void user_is_on_home_page() throws Throwable {
//		boolean flag = homepage.verifyCorrectUserName();
//		Assert.assertTrue(flag);
//		
//	}
//
//
//}
