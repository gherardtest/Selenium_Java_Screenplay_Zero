package co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.tasks;

import co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces.Address;
import co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces.Home;
import co.com.gherardtest.certification.Selenium_Java_Screenplay_Zero.userInterfaces.Personal;
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

                SendKeys.of("Lima").into(Address.TXT_CITY),
                SendKeys.of("15112").into(Address.TXT_ZIP),
                SendKeys.of("Peru").into(Address.CBX_COUNTRY),
                Click.on(Address.BTN_NEXT),

        );
    }
    public static RegisterUserUTest maeInformation(){
        return instrumented(RegisterUserUTest.class);
    }
}
