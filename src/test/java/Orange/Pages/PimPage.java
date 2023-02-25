package Orange.Pages;

import Orange.DataBase.InsertDataBase;
import Orange.Steps.ButtonPages;
import Orange.Steps.ListsPage;
import Orange.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private InsertDataBase insertDataBase;
    private ListsPage listsPage;
    private Questions questions;

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
        this.listsPage = new ListsPage(driver);
        this.questions = new Questions(driver);
    }

    public void llegarAddEmployee() {
        buttonPages.btnPim();
        buttonPages.btnAddEmployee();
    }

    public void llegarListEmployee() {
        buttonPages.btnPim();
        buttonPages.btnListEmployee();
    }

    public void fillOutAddEmployee(String firstName, String middle, String lastName) {
        txtFirstName.isDisplayed();
        txtFirstName.sendKeys(firstName);
        txtMiddleName.sendKeys(middle);
        txtLastName.sendKeys(lastName);
        insertDataBase.insertEmployee(firstName, middle, lastName);
        buttonPages.btnSave();
    }

    public void searchJob(String jobTitle) {
        listsPage.listJobTitle(jobTitle);
        buttonPages.btnSearch();
        questions.scrollTable();
    }

    public void searchEmployee(String employee) {
        questions.scrollSearchEmployee(employee);
    }
}
