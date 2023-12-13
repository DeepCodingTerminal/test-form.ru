package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.RegistrationPage;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TestForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.yaplakal.com/";
        Configuration.browserSize = "2560x1440";
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void successFillTest() throws InterruptedException {

        new RegistrationPage().openPage();
        new RegistrationPage().setUserName("Mihail");
        new RegistrationPage().setPassWord("12345678");
        new RegistrationPage().setPassWord_Check("12345678");
        new RegistrationPage().setEmailAddress("test@test.ru");
        new RegistrationPage().setEmailAddress_two("test@test.ru");
        new RegistrationPage().selectDate();
        new RegistrationPage().inputDay();
        new RegistrationPage().inputMonth();
        new RegistrationPage().inputYear();
        new RegistrationPage().selectLocation("Amsterdam");
        new RegistrationPage().openReCAPTCHA();
        new RegistrationPage().clickReCAPTCHA();

        switchTo().parentFrame();


    }
}
