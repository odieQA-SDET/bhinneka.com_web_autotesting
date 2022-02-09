package starter.Test_Class.TestLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps_Methods.LoginSteps;

public class LoginSuccessClass {
    @Steps
    LoginSteps loginSteps;
    @Given("I was on the Login page")
    public void i_was_on_the_Login_page() {

        loginSteps.openHomePage();
        loginSteps.opennotification();
        loginSteps.openLoginPage();
    }

    @When("I filled my email correctly")
    public void i_filled_my_email_correctly() {

        loginSteps.inputEmailcorrectly();
    }

    @When("I clicked {string} button")
    public void i_clicked_button(String string) {

        loginSteps.ClickSelanjutnya();
    }

    @When("I filled my Password correctly")
    public void iFilledMyPasswordCorrectly() {
        loginSteps.inputPasscorrectly();
      //  loginSteps.ClickLogin();
    }
    
    @When("I clicked {string} button masuk")
    public void iClickedButtonMasuk(String string) {

        loginSteps.clickOK();

    }


    @Then("I have been on the homepage of bhinneka.com as member")
    public void iHaveBeenOnTheHomepageOfBhinnekaComAsMember() {
        loginSteps.alertBhinneka();
    }
}
