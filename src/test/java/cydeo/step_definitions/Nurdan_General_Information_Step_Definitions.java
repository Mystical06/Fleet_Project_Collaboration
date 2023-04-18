package cydeo.step_definitions;

import cydeo.pages.DashboardPage_Nurdan;
import cydeo.pages.LoginPage;
import cydeo.pages.QuickLaunchpadPage;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nurdan_General_Information_Step_Definitions {
    DashboardPage_Nurdan dashboardPage = new DashboardPage_Nurdan();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();

    LoginPage loginPage=new LoginPage();

    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("User logs in as a driver")
    public void userLogsInAsADriver() {
        dashboardPage.driverLogin();
    }
    @When("User clicks on Fleet module")
    public void user_clicks_on_fleet_module() {
        dashboardPage.fleet.click();
    }
    @Then("User clicks on Vehicles under the Fleet module")
    public void user_clicks_on_vehicles_under_the_fleet_module() {
        dashboardPage.vehiclesOption.click();
    }
    @Then("User clicks on any vehicle \\(row)")
    public void user_clicks_on_any_vehicle_row() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.vehicleRow.click();
    }

    @Then("User sees General Information page")
    public void user_sees_general_information_page() {
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks the step back button")
    public void user_clicks_the_step_back_button() throws InterruptedException {
        Driver.getDriver().navigate().back();

    }


    @When("user clicks eye icon at the end of each row")
    public void user_clicks_eye_icon_at_the_end_of_each_row() throws InterruptedException {
        dashboardPage.waitUntilLoaderScreenDisappear();
        actions.moveToElement(dashboardPage.threeDotsInCarsPage).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPage.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPage.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPage.eyeIcon.click();
        Thread.sleep(2000);
    }

    @Then("user is on General Information page")
    public void user_is_on_information_page() {
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);

    }


    @Given("User logs in as a sales manager")
    public void userLogsInAsASalesManager() {
        dashboardPage.salesManagerLogin();
    }

    @When("User clicks Fleet module")
    public void user_clicks_fleet_module() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.fleetTab.click();
    }

    @Then("User clicks on Vehicles under the Fleet")
    public void user_clicks_on_vehicles_under_the_fleet() {
        dashboardPage.vehicles.click();
    }

    @Then("User clicks on vehicle row")
    public void user_clicks_on_vehicle_row() {
       dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.vehicleRow.click();
    }

    @Then("User goes to General Information page")
    public void user_goes_to_general_information_page() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks the step back")
    public void user_clicks_the_step_back() {
        Driver.getDriver().navigate().back();
    }

    @When("User clicks eye icon at the end of the row")
    public void user_clicks_eye_icon_at_the_end_of_the_row() throws InterruptedException {
        actions.moveToElement(dashboardPage.threeDots).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPage.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPage.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPage.eyeIcon.click();
        Thread.sleep(2000);
    }


    @Then("User is on General Information page")
    public void user_is_on_general_information_page() {
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees the {string}, {string} and {string} buttons")
    public void user_sees_the_and_buttons(String string, String string2, String string3) {
        Assert.assertTrue(dashboardPage.edit.isDisplayed());
        Assert.assertTrue(dashboardPage.delete.isDisplayed());
        Assert.assertTrue(dashboardPage.addEvent.isDisplayed());

    }

    @Given("User logs in as a store manager")
    public void userLogsInAsAStoreManager() {
        dashboardPage.storeManagerLogin();
    }

    @When("User clicks on Fleet")
    public void user_clicks_on_fleet() {
        dashboardPage.fleetTab.click();
    }

    @Then("User clicks on Vehicles")
    public void user_clicks_on_vehicles() {
        dashboardPage.vehicles.click();
    }

    @Then("User clicks on any vehicle")
    public void user_clicks_on_any_vehicle() {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.vehicleRow.click();
    }

    @Then("user goes to General Information pg")
    public void user_goes_to_general_information_pg() {
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User clicks step-back button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @When("User clicks eye icon at the end")
    public void user_clicks_eye_icon_at_the_end() throws InterruptedException {
        actions.moveToElement(dashboardPage.threeDots).perform();
        Thread.sleep(3000);
        actions.moveToElement(dashboardPage.eyeIcon).perform();
        Thread.sleep(2000);
        dashboardPage.eyeIcon.isDisplayed();
        Thread.sleep(3000);
        dashboardPage.eyeIcon.click();
        Thread.sleep(2000);
    }

    @Then("user is on General Information page again")
    public void user_is_on_general_information_page_again() {
        String actualHeader = dashboardPage.generalInformation.getText();
        String expectedHeader = "General Information";
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Then("User sees the {string}, {string} and {string} buttons on the page")
    public void user_sees_the_and_buttons_on_the_page(String string, String string2, String string3) {
        Assert.assertTrue(dashboardPage.edit.isDisplayed());
        Assert.assertTrue(dashboardPage.delete.isDisplayed());
        Assert.assertTrue(dashboardPage.addEvent.isDisplayed());

    }



}
