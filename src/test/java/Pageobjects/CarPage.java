package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CarPage extends BasePage{

	public CarPage(WebDriver driver) {
		super(driver);
		
	}
	
	//elements
	@FindBy(xpath="//a[text()='Used Cars']")  
	WebElement usecar;
	
	@FindBy(xpath="//div[@class='h-dd-r']//ul//li[4]//span")  
	WebElement chennaicars;
	
	@FindBy(xpath="	//ul[@class='zw-sr-secLev usedCarMakeModelList popularModels ml-20 mt-10']/li/label")
	List<WebElement> popularModels;
	

	
	
	//Actions
	public void clickUseCar() {
	Actions act1=new Actions(driver);
	act1.moveToElement(usecar).perform();
	}
	
	public void clickChennai()
	{
	chennaicars.click();
	}
	
	public void popularModelList()
	{
		for(WebElement x: popularModels)
		{
			System.out.println(x.getText());
		}
		
	}
	

	
}
