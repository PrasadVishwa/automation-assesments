package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	private WebDriver driver;
	
	//username
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userName;
    
	//password
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	
	//LoginButton
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement loginButton;
	
	//pin
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement pin;
	
	//continueButton
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement continueButton;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		//global      local
		this.driver = driver;
		//selenium class
		PageFactory.initElements(driver, this);
		
	}
	
	//action perform on elements
	
	public void sendUserName()
	{
		userName.sendKeys("QZP268");
	}
	
	public void sendPassWord()
	{
		passWord.sendKeys("vishwa@9229");
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	public void sendPin()
	{
		pin.sendKeys("021998");
	}

	public void clickcontinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
}
