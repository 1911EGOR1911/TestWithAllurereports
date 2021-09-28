package com.Hrizantemovich;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SelenideTestAnotattedStep {

private static final String REPOSITORY = "eroshenkoam/allure-example";
private static final String TEXT = "Listeners NamedBy";

    @Test
    void testGithub() {
        WebSteps step =new WebSteps();
        step.OpenPage();
        step.SearchForRepository(REPOSITORY);
        step.OpenRepository(REPOSITORY);
        step.GoToIssues();
        step.ShouldSeeIssueWithText(TEXT);
    }
}

