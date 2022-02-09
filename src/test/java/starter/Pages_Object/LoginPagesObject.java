package starter.Pages_Object;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagesObject extends PageObject {


    @FindBy(xpath ="//span[normalize-space()='Login']")
    WebElement iconLOGIN;
    public void clickiconLogin() {
        iconLOGIN.click();
    }


    @FindBy(id="next")
    WebElement buttonSelanjutnya;
    public void clickButtonSelanjutnya() {
        buttonSelanjutnya.click();
    }
    @FindBy(xpath ="//button[@class='ant-btn ant-btn-primary']") //button[. = 'MASUK']
    WebElement buttonMasuk;
    public void clickButtonMasuk() {
        buttonMasuk.click();
    }
    @FindBy(xpath ="//a[@href='/']//img[@alt='Bhinneka.com']")
    WebElement alertImage;
    public void alertImageBhinneka() {
        alertImage.isDisplayed();
    }

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPass;

    public void inputEmailSuccess() {
        inputEmail.sendKeys("yandradodi@gmail.com");

    }
    public void inputPassSuccess() {
        inputPass.sendKeys("t3st1ngWEB#");
    }

    @FindBy(xpath = "//button[@id='onesignal-slidedown-allow-button']")
    WebElement openNotif;
    public void OpenNotifcation() {
        openNotif.click();

    }
}
