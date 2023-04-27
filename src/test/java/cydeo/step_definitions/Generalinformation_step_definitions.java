package cydeo.step_definitions;

import cydeo.pages.DashboardPage_Nurdan;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Generalinformation_step_definitions {

    DashboardPage_Nurdan dashboardPageNurdan=new DashboardPage_Nurdan();
    Actions actions=new Actions(Driver.getDriver());


    @Given("User logs in as a driver")
    public void userLogsInAsADriver() {
        dashboardPageNurdan.driverLogin();
    }
    @When("User clicks on Fleet module")
    public void user_clicks_on_fleet_module() {
        dashboardPageNurdan.fleetTabDriver.click();
    }
    @Then("User clicks on Vehicles under the Fleet module")
    public void user_clicks_on_vehicles_under_the_fleet_module() {
        dashboardPageNurdan.vehiclesOption.click();
    }
    @Then("User clicks on any vehicle \\(row)")
    public void user_clicks_on_any_vehicle_row() {
        dashboardPageNurdan.waitUntilLoaderScreenDisappear();
        dashboardPageNurdan.vehicleRow.click();
    }

    @Then("User sees General Information page")
    public void user_sees_general_information_page() {
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks the step back button")
    public void user_clicks_the_step_back_button() {
        Driver.getDriver().navigate().back();

    }


    @When("user clicks eye icon at the end of each row")
    public void user_clicks_eye_icon_at_the_end_of_each_row() throws InterruptedException {
        actions.moveToElement(dashboardPageNurdan.threeDotsInCarsPage).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPageNurdan.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPageNurdan.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPageNurdan.eyeIcon.click();
        Thread.sleep(2000);
    }

    @Then("user is on General Information page")
    public void user_is_on_information_page() {
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }


    @Given("User logs in as a sales manager")
    public void userLogsInAsASalesManager() {
        dashboardPageNurdan.salesManagerLogin();
    }

    @When("User clicks Fleet module")
    public void user_clicks_fleet_module() {
        dashboardPageNurdan.waitUntilLoaderScreenDisappear();
        dashboardPageNurdan.fleet.click();
    }

    @Then("User clicks on Vehicles under the Fleet")
    public void user_clicks_on_vehicles_under_the_fleet() {
        dashboardPageNurdan.vehicles.click();
    }

    @Then("User clicks on vehicle row")
    public void user_clicks_on_vehicle_row() throws InterruptedException {
        Thread.sleep(3000);
        dashboardPageNurdan.vehicleRow.click();
    }

    @Then("User goes to General Information page")
    public void user_goes_to_general_information_page() {
        dashboardPageNurdan.waitUntilLoaderScreenDisappear();
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks the step back")
    public void user_clicks_the_step_back() {
        Driver.getDriver().navigate().back();
    }

    @When("User clicks eye icon at the end of the row")
    public void user_clicks_eye_icon_at_the_end_of_the_row() throws InterruptedException {
        actions.moveToElement(dashboardPageNurdan.threeDots).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPageNurdan.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPageNurdan.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPageNurdan.eyeIcon.click();
        Thread.sleep(2000);
    }


    @Then("User is on General Information page")
    public void user_is_on_general_information_page() {
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees the {string}, {string} and {string} buttons")
    public void user_sees_the_and_buttons() {
        Assert.assertTrue(dashboardPageNurdan.edit.isDisplayed());
        Assert.assertTrue(dashboardPageNurdan.delete.isDisplayed());
        Assert.assertTrue(dashboardPageNurdan.addEvent.isDisplayed());

    }

    @Given("User logs in as a store manager")
    public void userLogsInAsAStoreManager() {
        dashboardPageNurdan.storeManagerLogin();
    }

    @When("User clicks on Fleet")
    public void user_clicks_on_fleet() {
        dashboardPageNurdan.fleet.click();
    }

    @Then("User clicks on Vehicles")
    public void user_clicks_on_vehicles() {
        dashboardPageNurdan.vehicles.click();
    }

    @Then("User clicks on any vehicle")
    public void user_clicks_on_any_vehicle() {
        dashboardPageNurdan.waitUntilLoaderScreenDisappear();
        dashboardPageNurdan.vehicleRow.click();
    }

    @Then("user goes to General Information pg")
    public void user_goes_to_general_information_pg() {
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks step-back button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @When("User clicks eye icon at the end")
    public void user_clicks_eye_icon_at_the_end() throws InterruptedException {
        actions.moveToElement(dashboardPageNurdan.threeDots).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPageNurdan.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPageNurdan.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPageNurdan.eyeIcon.click();
        Thread.sleep(2000);
    }

    @Then("user is on General Information page again")
    public void user_is_on_general_information_page_again() {
        String actualHeader = dashboardPageNurdan.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees the {string}, {string} and {string} buttons on the page")
    public void user_sees_the_and_buttons_on_the_page() {
        Assert.assertTrue(dashboardPageNurdan.edit.isDisplayed());
        Assert.assertTrue(dashboardPageNurdan.delete.isDisplayed());
        Assert.assertTrue(dashboardPageNurdan.addEvent.isDisplayed());

    }


}
