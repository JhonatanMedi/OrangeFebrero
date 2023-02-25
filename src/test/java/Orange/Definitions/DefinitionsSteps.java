package Orange.Definitions;

import Orange.Pages.LoginPage;
import Orange.Pages.PimPage;
import Orange.Steps.Conexion;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

import java.sql.SQLException;

public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);


    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    @When("^the user fill out user name (.*) and password (.*)$")
    public void fillOutLogin(String userName, String pass) throws SQLException {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogin(userName, pass);
    }

    @When("^the user access to the add employee$")
    public void llegarAddEmployee(){
        this.pimPage = new PimPage(driver);
        this.pimPage.llegarAddEmployee();
    }

    @When("^the user fill out field first (.*) midlle (.*) last name (.*)$")
    public void fillOutAddEmployee(String firstName, String middle, String lastName){
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployee(firstName,middle,lastName);
    }

}