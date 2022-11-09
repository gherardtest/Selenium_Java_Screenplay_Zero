package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    public static final Target TXT_FIRST_NAME = Target.the("first name").
            locatedBy("//input[@id=\"firstName\"]");

    public static final Target TXT_LAST_NAME = Target.the("last name").
            locatedBy("//input[@id=\"lastName\"]");

    public static final Target TXT_EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");

    public static final Target CBX_MONTH = Target.the("month").
            locatedBy("//select[@id=\"birthMonth\"]");

    public static final Target CBX_DAY = Target.the("day").
            locatedBy("//select[@id=\"birthDay\"]");

    public static final Target CBX_YEAR = Target.the("year").
            locatedBy("//select[@id=\"birthYear\"]");

    public static final Target BTN_NEXT = Target.the("button next").
            locatedBy("//a[@class=\"btn btn-blue\"]");

}
