package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	//1.WebDriver declared
	private WebDriver driver;
	
	//2.Find The WebElements
	//Addtocart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addTocartButton;
	
	//cartbutton
	@FindBy(xpath="//a[@class='shopping_cart_link']")
    private WebElement cartButton;
	
	//removeButton
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removeButton;
	
	//checkoutButton
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutButton;
	
	//cancelButton
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelButton;
	
	//continueShopping
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueShopping;
	
	//Create Constructor
	public CartPage(WebDriver driver)
	{
		//Global   Local
		this.driver = driver;
				
		//selenium class-->initElements
		PageFactory.initElements(driver, this);
	}
	
	//action perform on elements
	public void addTocartButton()
	{
		addTocartButton.click();
	}
	
	public void cartButton()
	{
		cartButton.click();
	}
	
	public void removeButton()
	{
		removeButton.click();
	}
	
	public void checkoutButton()
	{
		checkoutButton.click();
	}
	
	public void cancelButton()
	{
		cancelButton.click();
	}
	
	public void continueShopping()
	{
		continueShopping.click();
	}
	
	
	
	
	
	
	
	
}
