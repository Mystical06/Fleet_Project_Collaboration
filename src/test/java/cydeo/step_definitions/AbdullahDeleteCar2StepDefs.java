package cydeo.step_definitions;

import cydeo.pages.DashboardPage;
import cydeo.pages.DeleteCar2_Abdullah;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class AbdullahDeleteCar2StepDefs {


     DashboardPage dashboardPage = new DashboardPage();
     DeleteCar2_Abdullah deleteCar2= new DeleteCar2_Abdullah();

    @Then("User clicks 1st line")
    public void user_clicks_1st_line() throws InterruptedException {
        Thread.sleep(2000);
        deleteCar2.firstLine.click();

    }
    @Then("User sees delete button on tha general information page")
    public void user_sees_delete_button_on_tha_general_information_page() throws InterruptedException {
        String deleteButtonExpected="Delete";
        Thread.sleep(2000);
        //String deleteButtonActual= deleteCar2.deleteBtn.getText();
        Assert.assertEquals(deleteButtonExpected,deleteCar2.deleteBtnText.getText());


    }
    @Then("User clicks delete button on tha general information page")
    public void user_clicks_delete_button_on_tha_general_information_page() throws InterruptedException {
        Thread.sleep(5000);
        deleteCar2.deleteBtn.click();



    }
    @Then("User sees Delete Confirmation Alert")
    public void user_sees_delete_confirmation_alert() throws InterruptedException {
        String deleteButtonExpected="Delete Confirmation";
        Thread.sleep(2000);
        Assert.assertEquals(deleteButtonExpected,deleteCar2.deleteConfirmationAlert.getText());

    }


    @Then("User clicks on Yes,Delete btn")
    public void user_clicks_on_yes_delete_btn() throws InterruptedException {
        deleteCar2.yesDeleteBtn.click();
        Thread.sleep(2000);

    }
    @Then("User sees item deleted message on the page")
    public void user_sees_item_deleted_message_on_the_page()  {


    }







}































