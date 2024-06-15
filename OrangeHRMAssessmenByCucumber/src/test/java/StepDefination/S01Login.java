package StepDefination;

import TestData.Configurations;
import TestData.GeneralMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class S01Login {

    pages.Login login =new pages.Login(Hooks.driver) ;
    //AdminTab adminTab = new AdminTab(BaseTest.driver);

    @When("Admin enter valid data")
    public void LoginWithCred() throws InterruptedException {
        new pages.Login(Hooks.driver);
        login.LoginWithCred(Configurations.userName,Configurations.password);
        GeneralMethods.WaitTOSee(2000);
    }
    @Then("Admin Check login is done")
    public void LoginIsDone(){
        new pages.Login(Hooks.driver);
        System.out.println(new pages.Login(Hooks.driver));
        assertEquals(login.LogoExistence(),true,"Login is failed");
    }

}
