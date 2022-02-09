package starter.Steps_Methods;

import starter.Pages_Object.LoginPagesObject;

public class LoginSteps {
  LoginPagesObject loginPages;

  public void openHomePage() {
      loginPages.open();

  }
  public void openLoginPage() {
      loginPages.clickiconLogin();

  }
  public void inputEmailcorrectly() {
      loginPages.inputEmailSuccess();
  }

  public void ClickSelanjutnya() {
      loginPages.clickButtonSelanjutnya();
  }

  public void inputPasscorrectly() {
      loginPages.inputPassSuccess();
  }

  public void clickOK() {
      loginPages.clickButtonMasuk();
  }

  public void alertBhinneka() {
     loginPages.alertImageBhinneka();
  }

    public void opennotification() {
      loginPages.OpenNotifcation();
    }
}
