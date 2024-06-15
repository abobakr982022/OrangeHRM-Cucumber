package StepDefination;

import TestData.Configurations;
import TestData.GeneralMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminTab;

import static org.testng.Assert.assertEquals;

public class S4AddUsers {
    pages.Login login =new pages.Login(Hooks.driver) ;
    AdminTab adminTab = new AdminTab(Hooks.driver);
    @Given("login with valid credentials")
    public void LoginWithCred() throws InterruptedException {
        new pages.Login(Hooks.driver);
        login.LoginWithCred(Configurations.userName,Configurations.password);
        GeneralMethods.WaitTOSee(2000);
    }
    @When("check home page is open successfully")
    public void WaitAndSeeHomePage() throws InterruptedException {
        GeneralMethods.WaitTOSee(2000);
    }
    @And  ("Navigate to Admin Page")
    public void NavToAdminPage() throws InterruptedException {
        adminTab.NavToAdminPage();
        GeneralMethods.WaitTOSee(2000);
    }
    @Then ("FillTheRequiredData")
    public void FillTheRequiredData() throws InterruptedException {
        adminTab.FillTheRequiredData(Configurations.newUserName,Configurations.newPassword);
    }
    @And("SaveTheData")
    public void SaveTheData() throws InterruptedException {
        adminTab.SaveTheData();
    }
    @Then("Check if the user is added")
    public void AddUser() throws InterruptedException {
        assertEquals(adminTab.GetTheNewAddedUser(Configurations.newUserName),Configurations.newUserName,"error");
    }
}
