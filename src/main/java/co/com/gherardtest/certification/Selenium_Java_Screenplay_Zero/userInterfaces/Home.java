package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BTN_REGISTER = Target.the("button register").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");
}
