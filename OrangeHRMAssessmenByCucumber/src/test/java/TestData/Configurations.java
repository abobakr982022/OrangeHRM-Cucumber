package TestData;

import com.github.javafaker.Faker;

public class Configurations {
    static Faker faker = new Faker();
    public static final String BrowserName = "chrome";
    public static final String Portal = "https://opensource-demo.orangehrmlive.com/";

    public static final String userName = "Admin";
    public static final String password = "admin123";


    public static final String newUserName = faker.name().firstName()+faker.name().lastName();

    public static final String newPassword = "Abubakr1";









}
