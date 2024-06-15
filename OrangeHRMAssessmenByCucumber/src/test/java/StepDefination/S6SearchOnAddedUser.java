package StepDefination;

import TestData.Configurations;
import TestData.GeneralMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminTab;

import static org.testng.Assert.assertEquals;

public class S6SearchOnAddedUser {
    pages.Login login =new pages.Login(Hooks.driver) ;
    AdminTab adminTab = new AdminTab(Hooks.driver);
    @Given("login with valid credentials..")
    public void LoginWithCred() throws InterruptedException {
        new pages.Login(Hooks.driver);
        login.LoginWithCred(Configurations.userName,Configurations.password);
        GeneralMethods.WaitTOSee(2000);
    }
    @When("check home page is open successfully..")
    public void WaitAndSeeHomePage() throws InterruptedException {
        GeneralMethods.WaitTOSee(2000);
    }
    @And  ("Navigate to Admin Page..")
    public void NavToAdminPage() throws InterruptedException {
        adminTab.NavToAdminPage();
        GeneralMethods.WaitTOSee(2000);
    }
    @Then ("add user , save it , check increasing number of users by one..")
    public void FillTheRequiredDataThenSaveTheUser() throws InterruptedException {
        int theNumberOfUserBeforeAdding = adminTab.CheckIncreasingOrDecreasingNumberOfUsersByOne();
        System.out.println("the number of user before adding : "+theNumberOfUserBeforeAdding);
        adminTab.FillTheRequiredData(Configurations.newUserName,Configurations.newPassword);
        adminTab.SaveTheData();
        GeneralMethods.WaitTOSee(2000);
        System.out.println(adminTab.GetTheNewAddedUser(Configurations.newUserName));
        GeneralMethods.WaitTOSee(2000);
        System.out.println("the number of user after adding : "+adminTab.CheckIncreasingOrDecreasingNumberOfUsersByOne());
        assertEquals(adminTab.CheckIncreasingOrDecreasingNumberOfUsersByOne(),theNumberOfUserBeforeAdding+1,"failed to add new user");
    }

    @And("Search on added user")
    public void SearchOnAddedUser() throws InterruptedException {
        adminTab.SearchOnNewUser(Configurations.newUserName);
    }
    @Then("validate the result on search reflected at user list")
    public void ValidatingONTheResultOfSearchReflectedAtUserList() throws InterruptedException {
        assertEquals(adminTab.GetTheNewAddedUser(Configurations.newUserName),Configurations.newUserName,"result is wrong");    }
}
