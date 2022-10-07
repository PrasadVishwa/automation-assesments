package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	//menuButton
	//TC02
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement menuButton;
	
	//logoutButton
	//TC02
	@FindBy(xpath="//a[@target='_self']")
	private WebElement logoutButton;
	
	//TC03
	//fundButton
	
	@FindBy(xpath="//a[@href='/funds']")
	private WebElement fundButton;
	
	//TC03
	//addfundButton
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement addFundButton;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver ;
		
		PageFactory.initElements(driver, this);
	}
	
	//actions perform on elements
	//TC02
	public void clickmenuButton()
	{
		menuButton.click();
	}
	//TC02
	public void clicklogoutButton()
	{
		logoutButton.click();
	}
	
	//TC03
	public void clickfundButton()
	{
		fundButton.click();
	}
	
	//TC03
	public void clickaddFundButton()
	{
		addFundButton.click();
	}
	
	
	

}
