package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCar2_Abdullah extends BasePage{
    public DeleteCar2_Abdullah() {
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath = "//tr[@class='grid-row row-click-action']")
    public WebElement firstLine;

    @FindBy(xpath = "//a[@title='Delete Car']//i")
    public WebElement deleteBtnText;
    @FindBy(xpath = "//a[@title='Delete Car']")
    public WebElement deleteBtn;


@FindBy(xpath = "//h3[.='Delete Confirmation']")
public WebElement deleteConfirmationAlert;

@FindBy(xpath = "//a[@class='btn ok btn-danger']")
public WebElement yesDeleteBtn;
}
