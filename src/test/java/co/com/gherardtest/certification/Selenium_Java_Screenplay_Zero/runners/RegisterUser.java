package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterUser {
}

