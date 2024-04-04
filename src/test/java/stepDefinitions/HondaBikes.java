package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Pageobjects.BikePage;
import Pageobjects.MainPage;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HondaBikes {
	
	WebDriver driver;
	MainPage mp;
	BikePage bp;
	

@Given("The user navigates to zigwheels application")
public void the_user_navigates_to_zigwheels_application() {
	
	BaseClass.getLogger().info("user is navigated to zigwheels.. ");
   
}

@When("user clicks on upcoming bikes")
public void user_clicks_on_upcoming_bikes() {
   
	BaseClass.getLogger().info("user is navigated to upcmoing bike section");
	mp=new MainPage(BaseClass.getDriver());
	mp.clickUpcoming();
}

@When("user specifies the manufacturer as Honda")
public void user_specifies_the_manufacturer_as_honda() {
	
	BaseClass.getLogger().info("Honda is selected as Manufacturer... ");
    bp=new BikePage(BaseClass.getDriver());
    bp.selectDropDown();
    bp.viewMore();
}

@Then("user recieves a list of bikes under {int} lakhs")
public void user_recieves_a_list_of_bikes_under_lakhs(Integer int1) {
	BaseClass.getLogger().info("List of honda bikes under 4 lakhs displayed.. ");
    bp.displayHondaBikes();
}

}
