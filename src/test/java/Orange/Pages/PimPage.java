package Orange.Pages;

import Orange.DataBase.InsertDataBase;
import Orange.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private InsertDataBase insertDataBase;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'First Name']")
    public WebElement txtFirstName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Middle Name']")
    public WebElement txtMiddleName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Last Name']")
    public WebElement txtLastName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder= 'Last Name']")
    public WebElement txtLaspeptName;

    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void llegarAddEmployee() {
        buttonPages.btnPim();
        buttonPages.btnAddEmployee();
    }

    public void fillOutAddEmployee(String firstName, String middle, String lastName){
        txtFirstName.isDisplayed();
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middle);
        txtLastName.sendKeys(lastName);
        insertDataBase.insertEmployee(firstName,middle,lastName);
        buttonPages.btnSave();
    }
}
