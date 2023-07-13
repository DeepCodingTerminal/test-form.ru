package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TestForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://mail.ru/";
        Configuration.browserSize = "2560x1440";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadTimeout = 60000;
    }

    @Test
    void successFillTest() throws InterruptedException {
        open("https://account.mail.ru/signup?from=main&rf=auth.mail.ru&app_id_mytracker=58519");

        $x("//input[@name='fname']").setValue("Mihail");
        $x("//input[@name='lname']").setValue("Krylov");

        $x("//div[@data-test-id='birth-date__day']").click();
        $x("//span[@data-test-id='birth-date__day-value:11']").setValue("10").pressEnter();
        $x("//div[@data-test-id='birth-date__month']").click();
        $x("//span[@data-test-id='birth-date__month-value:11']").selectOptionByValue("10");
        $x("//div[@data-test-id='birth-date__year']").click();
        $x("//span[@data-test-id='birth-date__year-value:11']").selectOptionByValue("1990");
        $x("//input[@value='male']").click();


    }
}
