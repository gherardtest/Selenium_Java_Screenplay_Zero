package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Address {

    public static final Target TXT_CITY = Target.the("city").
            locatedBy("//input[@id=\"city\"]");

    public static final Target TXT_ZIP = Target.the("zip or postal code").
            locatedBy("//input[@id=\"zip\"]");

    public static final Target CBX_COUNTRY = Target.the("country").
            locatedBy("//span[@class=\"btn btn-default form-control ui-select-toggle\"]");

    public static final Target BTN_NEXT = Target.the("button next").
            locatedBy("//a[@aria-label=\"Next step - select your devices\"]");
}
