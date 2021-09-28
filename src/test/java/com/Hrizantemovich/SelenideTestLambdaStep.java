package com.Hrizantemovich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SelenideTestLambdaStep {

private static final String REPOSITORY = "eroshenkoam/allure-example";
private static final String TEXT = "Listeners NamedBy";

    @Test
    void testGithub() {
        step("Открываем главную страницу",() -> {
            open("https://github.com/");
        });

        step("Ищем репозиторий" + REPOSITORY,() ->{
            $(".header-search-input").setValue(REPOSITORY).pressEnter();
        });

        step("Переходим в репозиторий",() ->{
            $(By.linkText(REPOSITORY)).click();
        });

        step("Переходим в раздел Issues",() ->{
            $(byPartialLinkText("Issues")).click();
        });

        step("Проверяем наличие Issue c текстом Listeners NamedBy ",() ->{
            $("#issue_68_link").shouldHave(text(TEXT));
        });
    }
}

