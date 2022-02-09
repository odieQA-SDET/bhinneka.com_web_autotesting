package starter.Test_Class.TestLogOut;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps_Methods.LogoutSteps;

public class LogoutSuccess {
    @Steps
    LogoutSteps logOut;
    @When("I Clicked icon {string} button")
    public void iClickedIconAButton(String string) {
        logOut.OpenLogoutPage();

    }

    @And("I clicked {string} button in menu dropp down of icon People")
    public void i_clicked_button_in_menu_droppdown_oficon_People(String string){
        logOut.DropdownLogOut();
    }


    @Then("I Went to Homepage of The Bhinneka.com as not member")
    public void iWentToHomepageOfTheBhinnekaComAsNotMember() {
        logOut.goawayfromasmember();
    }
}
