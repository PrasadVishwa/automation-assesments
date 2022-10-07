package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashierPage 
{
	private WebDriver driver;
	
	//TC03
	//amount
	
	@FindBy(xpath="//input[@id='addfunds_amount']")
	private WebElement amount;
	
	//TC03
	//UPI id
	
	@FindBy(xpath="//input[@id='addfunds_vpa']")
	private WebElement upiID;
	
	//UPi Id button
	
	@FindBy(xpath="//label[@for='pay_upi']")
	private WebElement upiRedioButton;
	
	//continueButton
	
	@FindBy(xpath="//button[@id='addfunds_submit']")
	private WebElement continueBtton;
	
	//Constructor
	public CashierPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//action perform on elements
	
	public void clickonamount()
	{
		amount.sendKeys("100");
	}
	
	public void clickonupiID()
	{
		upiID.sendKeys("prasadpatilme501@okhdfcbank");
	}
	
	public void clickupiRedioButton()
	{
		upiRedioButton.click();
	}
	
	public void clickcontinueBtton()
	{
		continueBtton.click();
	}

}
