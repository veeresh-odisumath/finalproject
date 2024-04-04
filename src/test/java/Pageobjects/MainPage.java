package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

	public MainPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//Elements
	@FindBy(xpath="//a[normalize-space()='New Bikes']")
	WebElement newbike;
	
	@FindBy(xpath="//li[@data-track-label='upcoming-tab']")
	WebElement upcoming;
	
	@FindBy(xpath="//a[@title='All Upcoming Bikes']")
	WebElement Allupcoming;
	
	
	
	//actions
	
	public void clickUpcoming()
	{
		Actions act=new Actions(driver);
		act.moveToElement(newbike).click().perform();
		upcoming.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		try {
		wait.until(ExpectedConditions.visibilityOf(Allupcoming)).click();
		}
		
		catch(Exception e)
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",Allupcoming);
		}
		
	}
	
	

}
