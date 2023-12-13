package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public void openPage() {
        open("https://www.yaplakal.com/act/Reg/CODE/00");
    }

    public void setUserName(String value) {
        $x("//input[@ name='UserName']").setValue(value);
    }

    public void setPassWord(String value) {
        $x("//input[@ name='PassWord']").setValue(value);
    }

    public void setPassWord_Check(String value) {
        $x("//input[@ name='PassWord_Check']").setValue(value);
    }

    public void setEmailAddress(String value) {
        $x("//input[@ name='EmailAddress']").setValue(value);
    }

    public void setEmailAddress_two(String value) {
        $x("//input[@ name='EmailAddress_two']").setValue(value);
    }

    public void selectDate() {
        $x("//select[@ name='day']").click();
    }

    public void inputDay() {
        $x("//*[contains(@name, 'day')]//*[@value='8']").click();
    }

    public void inputMonth() {
        $x("//*[contains(@name, 'month')]//*[@value='8']").click();
    }

    public void inputYear() {
        $x("//*[contains(@name, 'year')]//*[@value='1998']").click();
    }

    public void selectLocation(String value) {
        $x("//input[@ name='location']").setValue(value);
    }

    public void inputField_1() {
        $x("//*[contains(@name, 'field_1')]//*[@value='u']").click();
    }

    public void inputField_2() {
        $x("//textarea[@ name='field_2']").setValue("Test text");
    }

    public void openReCAPTCHA() {
        switchTo().frame($(By.xpath("//iFrame[@title='reCAPTCHA']")).shouldBe(visible));
    }

    public void clickReCAPTCHA() {
        $x("//div[@class='recaptcha-checkbox-border']").click();
    }






}
