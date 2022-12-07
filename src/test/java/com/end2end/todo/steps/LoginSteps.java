package com.end2end.todo.steps;

import org.junit.Assert;

import com.end2end.todo.pageobject.LoginPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private LoginPage loginPage;
	
	public LoginSteps() {
		loginPage = new LoginPage();
	}
	

	@Given("I go to the home page {string}")
	public void iGoToTheHomePage(String url) {
		loginPage.visitUrl(url);
	
	}
	@When("I write my email {string}")
	public void iWriteMyEmail(String e) {
	   loginPage.writeOnInput(loginPage.email, e);
	}
	@When("I write my password {string}")
	public void iWriteMyPassword(String p) {
		 loginPage.writeOnInput(loginPage.password, p);
	}
	@When("I click on Login button")
	public void iClickOnLoginButton() {
		 loginPage.clickOnButton(loginPage.btnPassword);
	}
	@Then("I am redirected to my home page where title is written {string}")
	public void iAmRedirectedToMyHomePageWhereNameUserIsWritten(String userName) {
	    
		Assert.assertTrue(loginPage.welcomeMessage().contains(userName));
	}



}
