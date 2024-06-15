package StepDefination;

import TestData.Configurations;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;


    public Hooks() {
    }


    @Before
    public void setUp() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Navigate to Examiner Portal
        driver.get(Configurations.Portal);
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}
