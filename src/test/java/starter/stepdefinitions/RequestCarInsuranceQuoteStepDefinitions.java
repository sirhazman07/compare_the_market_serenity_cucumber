package starter.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.navigation.NavigateTo;
import starter.navigation.CarInsuranceQuoteRequestPage;

import static org.assertj.core.api.Assertions.assertThat;
import static starter.matchers.TextMatcher.textOf;

public class RequestCarInsuranceQuoteStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    CarInsuranceQuoteRequestPage carInsuranceQuoteRequestPage;



    @Given("^user is on the car insurance home page$")
    public void user_opens_compare_the_market_homePage() {
        navigateTo.theCompareTheMarketHomePage();
    }

    @When("^user starts a new car quote request$")
    public void user_begins_new_car_insurance_request() {
        navigateTo.theCompareTheMarketQuoteRequestPage();
    }

    @And("^user provides driver and vehicle information$")
    public void user_enters_driver_and_vehicle_details() {
        carInsuranceQuoteRequestPage.enterVehicleRegistrationNumber();
        carInsuranceQuoteRequestPage.selectVehicleRegistrationState();
        carInsuranceQuoteRequestPage.selectVehicleMake();
        carInsuranceQuoteRequestPage.selectVehicleMakeYear();
        carInsuranceQuoteRequestPage.selectVehicleModel();
        carInsuranceQuoteRequestPage.selectVehicleModelSeries();
        //TODO: Add missing form user steps
        //TODO: Add Context/Stream injection Samples
        //TODO: Separate Page Objects into their own folder for better code structure
        //TODO: Add Context and Dependency injection Samples
        //TODO: Add Factory or Persona based testing into solution
        //TODO: Clean Project and Remove Unnecessary dependencies / Target files
    }

    @Then("^vehicle insurance quotes results page should be presented to user$")
    public void results_page_is_presented_to_user() {
//        assertThat(searchResult.titles())
//                .matches(results -> results.size() > 0)
//                .allMatch(title -> textOf(title).containsIgnoringCase(term));
    }
}
