package starter.Steps_Methods;

import starter.Pages_Object.LogoutPages;

public class LogoutSteps {
    LogoutPages logOutPages;

    public void OpenLogoutPage() {
        logOutPages.clickiconPeople();
      }

     public void DropdownLogOut() {
        logOutPages.clickdropdownLogOut();
    }

    public void goawayfromasmember() {
        logOutPages.backtohomepage();
    }
}
