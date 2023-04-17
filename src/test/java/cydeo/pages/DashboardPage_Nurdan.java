package cydeo.pages;

import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage_Nurdan extends BasePage{

    public DashboardPage_Nurdan(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")
    public WebElement fleetTab;

    @FindBy(xpath = "/html/body/div[2]/div[2]/header/div[2]/ul/li[1]/a/span")
    public WebElement fleet;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehicles;

    @FindBy(xpath = "//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Driver']")
    public WebElement vehicleRow;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[20]/div/div/a")
    public WebElement threeDotsInCarsPage;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[21]/div/div/a")
    public WebElement threeDots;

    @FindBy(xpath = "//a[@href='/entity/view/Extend_Entity_Carreservation/item/490']")
    public WebElement eyeIcon;

    @FindBy(xpath ="//h5[@class='user-fieldset']")
    public WebElement generalInformation;

    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]" )
    public WebElement edit;

    @FindBy(xpath ="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]" )
    public WebElement delete;

    @FindBy(xpath="//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[3]" )
    public WebElement addEvent;

    @FindBy(xpath= "//a[@class='dropdown-toggle']")
    public WebElement profileName;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logout;

    @FindBy(xpath = "/html/body/ul/li/ul/li[3]")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[6]/div[1]/h3")
    public WebElement deleteConfirmationPopup;

    @FindBy(xpath = "/html/body/div[6]/div[3]/a[2]")
    public WebElement yesDeleteButton;

    @FindBy(xpath = "//*[@id=\"flash-messages\"]//div[.='Item deleted']")
    public WebElement itemDeletedMessage;

    @FindBy(xpath = "//td[@data-column-label='License Plate']")
    public List<WebElement> licencePlateColumn;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement anyLicensePlate;

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]")
    public WebElement anyLicensePlate2;





































}
