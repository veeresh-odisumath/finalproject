package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BikePage extends BasePage{

	public BikePage(WebDriver driver) {
		super(driver);
		
	}
	
	
	//elements
	@FindBy(id="makeId")
	WebElement mnfdropdown;
	
	@FindBy(xpath="//span[@class='zw-cmn-loadMore']")
	WebElement viewmore;
	
	@FindBy(xpath="//div[contains(@title,'Honda')]")
	List<WebElement> bikeprice;
	
	@FindBy(xpath="//div[contains(@title,'Honda')]/preceding-sibling::a/strong")
	List<WebElement> bikename;
	
	@FindBy(xpath="//div[contains(@title,'Honda')]/following-sibling::div[contains(text(),'Expected')]")
	List<WebElement> explaunch;
	
	

	//Actions
	public void selectDropDown()
	{
		Select s=new Select(mnfdropdown);
		s.selectByVisibleText("Honda");
		
	}
	
	public void viewMore()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",viewmore);
	}
	
	public void displayHondaBikes()
	{
		for(int i=0;i<bikeprice.size();i++)
		{
			String price=bikeprice.get(i).getText();
			
			 if(!price.contains("Lakh"))
				{
					System.out.println(  bikename.get(i).getText()+"    "+bikeprice.get(i).getText()+"   "+ explaunch.get(i).getText());
				}
			
			else if(price.contains("Lakh"))
				
			{
				
				String sub=price.substring(price.indexOf("Rs")+4, price.indexOf("Lakh")-1);
				
				double price2=Double.parseDouble(sub);
				
			  if(price2<4.00)
			  {
				 System.out.println(  bikename.get(i).getText()+"    "+bikeprice.get(i).getText()+"   "+ explaunch.get(i).getText());
				 
			  }
			  
			}
			
		
				
			
		}
	}


	
}
