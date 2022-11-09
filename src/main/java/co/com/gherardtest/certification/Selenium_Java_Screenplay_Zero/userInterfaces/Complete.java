package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    public static final Target TXT_PASSWORD = Target.the("password").
            locatedBy("///input[@id=\"password\"]");

    public static final Target TXT_CONFIRM_PASSWORD = Target.the("confirm password").
            locatedBy("//input[@id=\"confirmPassword\"]");

    public static final Target CHK_STAY_INFORMED = Target.the("check stay informed").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"]");

    public static final Target CHK_TERMS_USE = Target.the("uTest terms of use").
            locatedBy("//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"]");

    public static final Target CHK_SECURITY_POLICY = Target.the("check security policy").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BTN_COMPLETE = Target.the("button complete").
            locatedBy("//a[@class=\"btn btn-blue\"]");



}
