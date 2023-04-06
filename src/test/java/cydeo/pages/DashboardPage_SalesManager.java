package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage_SalesManager extends BasePage{

    public DashboardPage_SalesManager(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    public WebElement fleetTab;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[21]/div/div/a")
    public WebElement threeDotsInCarsPage;

    @FindBy(xpath = "/html/body/ul/li/ul/li[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/h3")
    public WebElement deleteConfirmationPopup;

    @FindBy(xpath = "/html/body/div[6]/div[3]/a[2]")
    public WebElement yesDeleteButton;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]//div[.='Item deleted']")
    public WebElement itemDeletedMessage;

    @FindBy(xpath = "//td[.='594.827']")
    public WebElement deletedChassisNo;




























}
