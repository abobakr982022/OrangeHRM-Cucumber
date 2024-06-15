package StepDefination;

import TestData.Configurations;
import TestData.GeneralMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminTab;

import static org.testng.Assert.assertEquals;

public class S3GetTheNumberOfRecords {

    pages.Login login =new pages.Login(Hooks.driver) ;
    AdminTab adminTab = new AdminTab(Hooks.driver);

    @Given("Admin login with credentials")
    public void LoginWithCred() throws InterruptedException {
        new pages.Login(Hooks.driver);
        login.LoginWithCred(Configurations.userName,Configurations.password);
        GeneralMethods.WaitTOSee(2000);
    }
    @When ("Admin check home page is open successfully")
    public void WaitAndSeeHomePage() throws InterruptedException {
        GeneralMethods.WaitTOSee(2000);
    }
    @And ("Admin Navigates to Admin Page")
    public void NavToAdminPage() throws InterruptedException {
        adminTab.NavToAdminPage();
        GeneralMethods.WaitTOSee(2000);
    }
    @Then ("check if the Number of records equal to the number of users")
    public void GetTheNumberOfRecords() throws InterruptedException {
        System.out.println(adminTab.GetTheNumberOfRecords());
        System.out.println(adminTab.GetTheNumberOfUsers());
        assertEquals(adminTab.IsTheNumberOfRecordsEqualToTheNumberOfUsers(),true,"users lists != number of records");
    }
}
