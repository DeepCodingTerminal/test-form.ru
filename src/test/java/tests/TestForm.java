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
        Configuration.baseUrl = "https://www.yaplakal.com/";
        Configuration.browserSize = "2560x1440";
        Configuration.holdBrowserOpen = false;
        Configuration.pageLoadTimeout = 60000;
    }

    @Test
    void successFillTest() throws InterruptedException {
        open("https://www.yaplakal.com/act/Reg/CODE/00");

        $x("//input[@ name='UserName']").setValue("Mihail");
        $x("//input[@ name='PassWord']").setValue("12345678");
        $x("//input[@ name='PassWord_Check']").setValue("12345678");
        $x("//input[@ name='EmailAddress']").setValue("test@test.ru");
        $x("//input[@ name='EmailAddress_two']").setValue("test@test.ru");

        $x("//select[@ name='day']").click();
        $x("//*[contains(@name, 'day')]//*[@value='8']").click();
        $x("//*[contains(@name, 'month')]//*[@value='8']").click();
        $x("//*[contains(@name, 'year')]//*[@value='1998']").click();
        $x("//input[@ name='location']").setValue("Amsterdam");
        $x("//*[contains(@name, 'field_1')]//*[@value='u']").click();
        $x("//textarea[@ name='field_2']").setValue("Test text");
        switchTo().frame($(By.xpath("//iFrame[@title='reCAPTCHA']")).shouldBe(visible));
        $x("//div[@class='recaptcha-checkbox-border']").click();
        switchTo().parentFrame();


    }
}
