package com.faceBook.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//1.WebDriver declared
	private WebDriver driver;
	
	//2.find the WebElement
	//username
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName;
	
	//password
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passWord;
	
	//loginBUtton
	
	@FindBy(xpath="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement loginButton;
	
	//create constructor
	 public LoginPage(WebDriver driver)
	 {
		 //Global      local
		 this.driver = driver;
		 
		 //selenium class -->initElements
		 PageFactory.initElements(driver, this);
	 }
	
	//action perform on elements
	 public void sendUserName()
	 {
		 userName.sendKeys("9823448794");
	 }
	public void sendpassWord()
	{
		passWord.sendKeys("vishwa@9229");
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	

}
