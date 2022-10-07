package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	//elements finds-->menuButton, logout Button
	//TC-03 elements - login functionality
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutButton;
	
	
	//TC04 elements -->all Products
	
	@FindBy(xpath="//body//div//div//button")
	private List<WebElement> addToCartButton;
	
	
	//TC02 elements -->Add to cart single Elements
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;
	

	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//action on the elements
	//TC03
	public void clickmenuButton()
	{
		menuButton.click();
	}
	
	//TC03
	public void clicklogoutButton()
	{
		logoutButton.click();
	}
	
	//TC04
	public void clickaddToCartButton()
	{
		for(int i=0; i<addToCartButton.size(); i++)
		{
			addToCartButton.get(i).click();
		}
	}
	
	//TC04
	public void getaddToCartButton()
	{
		for(int i=0; i<addToCartButton.size(); i++)
		{
			if(addToCartButton.get(i).getText().contains("Remove"))
			{
				System.out.println("Add to cart test case is passed");
			}
			else
			{
				System.out.println("Add to cart test case is failed");
			}
		}
	}
	
	//TC02
	//single element
	public void clickbagButton()
	{
		bagButton.click();
	}
	
	//TC02//
	public String getbagButtonText()
	{
		String elementText = bagButton.getText();
		return elementText;
	}
	
	
	
	

}
