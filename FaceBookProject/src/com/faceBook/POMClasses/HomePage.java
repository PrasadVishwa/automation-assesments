package com.faceBook.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	//Find Elements --> accountButton, Logout Button
	
	//accountButton
	
	@FindBy(xpath="//div[@class='j83agx80 l9j0dhe7']")
	private WebElement accountButton;
	
	//logout
	@FindBy(xpath="(//div[@class='qzhwtbm6 knvmm38d'])[8]")
	private WebElement logoutButton;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//action on the elements
	public void clickaccountButton()
	{
		accountButton.click();
	}
	
	public void clicklogoutButton()
	{
		logoutButton.click();
	}
	
	
	
	

}
