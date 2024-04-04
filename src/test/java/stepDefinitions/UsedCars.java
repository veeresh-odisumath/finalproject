package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Pageobjects.BikePage;
import Pageobjects.CarPage;
import Pageobjects.MainPage;
import factory.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsedCars {


	WebDriver driver;
	MainPage mp;
	CarPage cp;

@When("user clicks on used cars")
public void user_clicks_on_used_cars() {
	
	cp=new CarPage(BaseClass.getDriver());
	cp.clickUseCar();
	BaseClass.getLogger().info("user is navigated to used cars section");
}

@When("user specifies the city as chennai")
public void user_specifies_the_city_as_chennai() {
	cp.clickChennai();
	BaseClass.getLogger().info("user selects chennai city for used cars location");
  
}

@Then("user recieves a list of popular used car models in chennai")
public void user_recieves_a_list_of_popular_used_car_models_in_chennai() {
  
	BaseClass.getLogger().info("user recives list of popular car models inchennai ");
	cp.popularModelList();
}



}
