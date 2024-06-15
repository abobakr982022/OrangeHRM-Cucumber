package StepDefination;

import TestData.Configurations;
import TestData.GeneralMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminTab;

import static org.testng.Assert.assertEquals;

public class S02NavToAdminPage {

    pages.Login login =new pages.Login(Hooks.driver) ;
    AdminTab adminTab = new AdminTab(Hooks.driver);

    @Given ("Admin login with valid credentials")
    public void LoginWithValidCred() throws InterruptedException {
        //new pages.Login(Hooks.driver);
        login.LoginWithCred(Configurations.userName,Configurations.password);
        GeneralMethods.WaitTOSee(2000);
    }
    @When ("Admin check home page is opened successfully")
    public void Wait_AndSeeHomePage() throws InterruptedException {
        GeneralMethods.WaitTOSee(2000);
    }

    @Then ("Admin click on Admin Tab and Admin Page open Successfully")
    public void Nav_ToAdminPage() throws InterruptedException {
        adminTab.NavToAdminPage();
        GeneralMethods.WaitTOSee(2000);
    }

}
