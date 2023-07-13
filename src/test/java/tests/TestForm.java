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



    }
}
