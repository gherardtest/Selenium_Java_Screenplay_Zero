package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.tasks;

import co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserUTest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(Home.BTN_REGISTER),

                SendKeys.of("Gherard").into(Personal.TXT_FIRST_NAME),
                SendKeys.of("Chipana").into(Personal.TXT_LAST_NAME),
                SendKeys.of("gherardtest@gmail.com").into(Personal.TXT_EMAIL),
                SendKeys.of("May").into(Personal.CBX_MONTH),
                SendKeys.of("9").into(Personal.CBX_DAY),
                SendKeys.of("1993").into(Personal.CBX_YEAR),
                Click.on(Personal.BTN_NEXT),

                Click.on(Location.BTN_NEXT_ADDRESS),

                Click.on(Devices.CBX_OS),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.CBX_VERSION),
                Click.on(Devices.WINDOWS_XP),
                Click.on(Devices.CBX_LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BTN_NEXT_DEVICES),

                SendKeys.of("Gherard100*").into(Complete.TXT_PASSWORD),
                SendKeys.of("Gherard100*").into(Complete.TXT_CONFIRM_PASSWORD),
                Click.on(Complete.CHK_STAY_INFORMED),
                Click.on(Complete.CHK_TERMS_USE),
                Click.on(Complete.CHK_SECURITY_POLICY),
                Click.on(Complete.BTN_COMPLETE)
        );
    }
    public static RegisterUserUTest makeInformation(){
        return instrumented(RegisterUserUTest.class);
    }
}
