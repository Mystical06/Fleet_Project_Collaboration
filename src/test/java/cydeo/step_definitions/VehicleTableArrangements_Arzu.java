package cydeo.step_definitions;

import cydeo.pages.BasePage;
import cydeo.pages.DashboardPage;
import cydeo.pages.LoginPage;

import cydeo.pages.VehicleTablePage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.View;
import java.util.Arrays;
import java.util.List;

public class VehicleTableArrangements_Arzu {

    public VehicleTablePage vehiclePage = new VehicleTablePage();
    public List<String> defaultOrder1;
    public List<String> defaultOrder2;
    BasePage basePage = new BasePage();
    WebDriver driver = Driver.getDriver();
    DashboardPage dashboard = new DashboardPage();

    //Background  ----------------------------------------------
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("login.page.url");
        driver.get(url);
        Driver.getDriver().get(url);
    }


    @And("user enters with valid credentials")
    public void user_enters_valid_credentials() {
        basePage.driverLogin();
        // loginPage.usernameField.sendKeys(username);
        //loginPage.passwordField.sendKeys(password);

//        LoginPage loginPage = new LoginPage();
//        loginPage.loginAsUserType(username, password);

    }

    @And("user hover over {string} button")
    public void userHoverOverButton(String arg0) {
        // Actions actions = new Actions(Driver.getDriver());
        // action.moveToElement(dashboard.fleetbtn).perform();

//        BrowserUtils.hover(dashboard.fleetbtn);
//        dashboard.vehiclesOption.click();
//        Thread.sleep(1000);

        vehiclePage.fleetbtn.click();

    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String Vehicles) {
        vehiclePage.navigateVehicles.click();

    }

//Senaryo 1 -----------------------------------------------------

    @When("On Vehicles page, user checks the table contents")
    public void on_vehicles_page_user_checks_the_table_contents() {
        String tableTag = vehiclePage.tableTag.getText();
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Cars", tableTag);

    }

    @And("All the lines and records are full of data. There were no empty lines")
    public void all_the_lines_and_records_are_full_of_data_there_were_no_empty_lines() {

        boolean hasEmptyRecord = false;

        WebElement[] rows = new WebElement[0];
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("tbody"));

            for (WebElement cell : cells) {
                String cellText = cell.getText().trim();

                if (cellText.isEmpty()) {
                    hasEmptyRecord = true;
                    break;
                }
            }

            if (hasEmptyRecord) {
                break;
            }

        }
    }


//    for (WebElement row : dashboard.tableRows) {
//            Assert.assertNotEquals(tableRows,row.getText());
//
//        }


    //Senaryo 2 -----------------------------------------------------
    @Given("On Vehicles page, user checks if the View Per Page drop down menu value is {string}")
    public void onVehiclesPageUserChecksIfTheViewPerPageDropDownMenuValueIs(String expectedValue) throws InterruptedException {
        //String viewPerPageNumber = dashboard.viewPerPage.getText();
        // BrowserUtils.waitForVisibility(dashboard.viewPerPage, 4);
        Thread.sleep(3000);
        //Assert.assertEquals(expectedValue, dashboard.viewPerPage.getText());
        Assert.assertEquals(expectedValue, vehiclePage.viewPerPage.getText());
    }

    @Then("The options are as listed below and clickable")
    public void the_options_are_as_listed_below_and_clickable(List<String> expectedOptions) {
        vehiclePage.selectAllOptionsViewPerPage(expectedOptions);
    }

//Senaryo 3 -----------------------------------------------------

    @When("On Vehicles page, user clicks on the {string} drop down menu")
    public void onVehiclesPageUserClicksOnTheDropDownMenu(String option) {

        vehiclePage.selectSingleOptionViewPerPage(option);

        //dashboard.selectSingleOptionViewPerPage(option);
    }

//    @ParameterType(".*")
//    public String viewOption(String viewOption) {
//        return viewOption;
//    }

    @Then("the user can see {string} options")
    public void theUserCanSeeOptions(String expectedTotalRowNumber) {

        // dashboard.selectOptionViewPerPage(viewOption);
        vehiclePage.verifyNumberOfDisplayedRows(expectedTotalRowNumber);

    }


    //Senaryo 4
    @When("The user clicks on {string} column in the table")
    public void the_user_clicks_on_column_in_the_table(String columnName) {
        vehiclePage.clickColumn(columnName);
    }

    @When("The user clicks on {string} column again")
    public void the_user_clicks_on_column_again(String columnName) {
        vehiclePage.clickColumn(columnName);
    }

    @Then("The {string} column is sorted in {string} order")
    public void the_column_is_sorted_in_order(String columnName, String order) {
        vehiclePage.isColumnSorted(columnName, order);
    }

// Senaryo 5

    @And("The user saves the default order of {string}")
    public void theUserSavesTheDefaultOrderOf(String column) {
        defaultOrder1 = vehiclePage.saveColumnOrder(column);
    }

    @When("The user clicks on {string} button from the top right menu")
    public void the_user_clicks_on_button_from_the_top_right_menu(String button) {
        vehiclePage.waitUntilLoaderScreenDisappear();
        vehiclePage.clickRightTopButtons(button);
    }

    @Then("The {string} gets reset to default order")
    public void theGetsResetToDefaultOrder(String column) {
        defaultOrder2 = vehiclePage.saveColumnOrder(column);
        Assert.assertEquals(defaultOrder1, defaultOrder2);
    }


}