package com.end2end.todo.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.end2end.todo.utils.ConfigFileReader;
import com.end2end.todo.utils.Setup;

import io.cucumber.java.en.Given;



public class LoginPage {
     static final String EMAILID = "login";
     static final String PASSWORDID = "[data-testid='password']";
     static final String LOGIN = "[data-testid='submit']";
     static final String WELCOME ="//h2[data-testid='welcome']";
     private ConfigFileReader configFileReader;
	/* Definition of Webelments */
	@FindBy(how = How.ID,using = EMAILID)
	public static WebElement email;
	@FindBy(how = How.CSS, using = PASSWORDID)
	public static WebElement password;
	@FindBy(how = How.CSS, using = LOGIN)
	public static WebElement btnPassword;
	@FindBy(how = How.XPATH, using = WELCOME)
	public static WebElement msgWelcome;
	
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	public void visitUrl(String url) {
		Setup.getDriver().get(configFileReader.getProperties("baseUrl"));;
	}
	/* write on an input webelement */
	public void writeOnInput(WebElement e,String value) {
		e.clear();
		e.sendKeys(value);
	}
	
	/* click on a button */
	public void clickOnButton(WebElement e) {
		e.click();		
	}
	
	public String welcomeMessage() {
		return msgWelcome.getText();
		
	}
	
	

}
