package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    public static final Target CBX_OS = Target.the("operating system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");
    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target LINUX = Target.the("linux").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");


    public static final Target CBX_VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target WINDOWS_XP = Target.the("windows xp").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");
    public static final Target WINDOWS_7 = Target.the("windows 7").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[5]");


    public static final Target CBX_LANGUAGE = Target.the("language").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target SPANISH = Target.the("spanish").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[38]");
    public static final Target ENGLISH = Target.the("spanish").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");


    public static final Target BTN_NEXT_DEVICES = Target.the("button next devices").
            locatedBy("//a[@aria-label=\"Next - final step\"]");

}
