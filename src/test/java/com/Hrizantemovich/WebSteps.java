package com.Hrizantemovich;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step ("Открываем страницу")
    public void OpenPage() {
        open("https://github.com/");
    }

    @Step ("Ищем репозиторий {REPOSITORY}")
    public void SearchForRepository(String REPOSITORY){
        $(".header-search-input").setValue(REPOSITORY).pressEnter();
    }
    @Step ("Открываем репозиторий {REPOSITORY}")
    public void OpenRepository(String REPOSITORY){
        $(By.linkText(REPOSITORY)).click();
    }
    @Step ("Переходим в раздел Issues")
    public void GoToIssues(){
        $(byPartialLinkText("Issues")).click();
    }
    @Step ("Проверяем наличие Issue c текстом {TEXT} ")
    public void ShouldSeeIssueWithText(String TEXT){
        $("#issue_68_link").shouldHave(text(TEXT));
    }


}

