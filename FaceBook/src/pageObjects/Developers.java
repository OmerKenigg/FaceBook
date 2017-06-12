package pageObjects;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.utils;

public class Developers

{
	final WebDriver driver;
	//find all the fields of registration.
	@FindBy (how = How.CSS, using = "a[href='/products/login']")
	public WebElement login ;
	
	@FindBy (how = How.CSS, using = "a[href='/products/sharing/overview']")
	public WebElement Sharing ;
	
	@FindBy (how = How.CSS, using = "a[href='/products/analytics']")
	public WebElement analytics ;
	
	@FindBy (how = How.CSS, using = "a[href='/products/app-monetization/audience-network/']")
	public WebElement monetization ;
	
	@FindBy (how = How.CSS, using = "a[href='/products/messenger/']")
	public WebElement messenger ;
	
	public Developers(WebDriver driver)
	{
		this.driver = driver;
	}
	
}
