package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//1.WebDriver declared
	private WebDriver driver;
	
	
	//2.find WebElement
	//Select the product WebElement
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']")
	private WebElement selectProduct;
	
	//backtoproduct
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backToProduct;

	//cornerButton
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private WebElement cornerButton;
	
	//logoutbutton
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logoutbutton;
	
	//aboutButton
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	private WebElement aboutButton;
	
	//filterButton
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement filterButton;
	
	//create constructor
	
	public HomePage(WebDriver driver)
	{
		//Global       Local
		this.driver = driver;
		
		//Selenium class-->initElements
		PageFactory.initElements(driver, this);

	}
	
	//action perform on elements
    public void clickSelectProduct()
    {
    	selectProduct.click();
    }
	
    public void clickCornerButton()
    {
    	cornerButton.click();
    }
	
	public void clickLogoutbutton()
	{
		logoutbutton.click();
	}

	public void clickAboutButton()
	{
		aboutButton.click();
	}
	
	public void clickFilterButton()
	{
		filterButton.click();
	}

	public void clickbackToProduct() 
	{
		backToProduct.click();
		
	}
	
}
