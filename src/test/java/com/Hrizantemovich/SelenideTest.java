package com.Hrizantemovich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test
    void testGithub() {
        open("https://github.com/");
        $(".header-search-input").setValue("eroshenkoam/allure-example").pressEnter();
        $(By.linkText("eroshenkoam/allure-example")).click();
        $(byPartialLinkText("Issues")).click();
        $("#issue_68_link").shouldHave(text("Listeners NamedBy"));


    }

}

