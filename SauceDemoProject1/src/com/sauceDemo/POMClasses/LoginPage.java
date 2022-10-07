package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//1.WebDriver declared
		private WebDriver driver;
		
		//2.Find the WEbELements
		
		//username
		
		@FindBy(xpath="//input[@id='user-name']")
		private WebElement userName;
		
		//password
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		//loginButton
		
		@FindBy(xpath="//input[@id='login-button']")
		private WebElement loginButton;
		
		//create constructor
		
		public LoginPage(WebDriver driver)
		{
		    //global        //Local
			this.driver = driver;
			
			//selenium class-->initElements
			PageFactory.initElements(driver, this);
		}
		
		//action perform on elements
		
		public void senduserName()
		{
			userName.sendKeys("standard_user");
		}

		public void Sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		public void clickLoginButton()
		{
			loginButton.click();
		}
		
		
		
}
