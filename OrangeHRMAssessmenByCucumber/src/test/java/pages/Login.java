package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private static WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private By userName = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");

    private By logo = By.xpath("//img[@alt='client brand banner']");


    public void LoginWithCred(String username , String passkey)  {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(password).sendKeys(passkey);
        driver.findElement(loginButton).click();
    }

    public boolean LogoExistence(){
        return driver.findElement(logo).isDisplayed();
    }
}
