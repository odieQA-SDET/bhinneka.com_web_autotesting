package starter.Pages_Object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPages extends PageObject {

    @FindBy(xpath="//div[@class='css-h1vntm']//i[@name='user']//*[local-name()='svg']")
    WebElement iconPeople;
    public void  clickiconPeople() {
        iconPeople.click();}

    @FindBy(xpath="//div[contains(text(),'Keluar')]")
    WebElement clickIconLogOut;
    public void clickdropdownLogOut() {
        clickIconLogOut.click();
    }

    @FindBy(className= "menu-dekstop css-1avegbk")
    WebElement Backtohomepage;
    public void backtohomepage() {
        Backtohomepage.getText();

    }
}
