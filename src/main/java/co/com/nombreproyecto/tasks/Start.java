package co.com.nombreproyecto.tasks;

import co.com.nombreproyecto.ui.ApplicationHomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Start implements Performable {
    private ApplicationHomePage applicationHomePage;

    public static Performable withAnEmptyList() {
        return Instrumented.instanceOf(Start.class).newInstance();
    }

    public static Performable onMainPage() {
        return Instrumented.instanceOf(Start.class).newInstance();
    }
    @Override
    @Step("{0} starts with an empty list")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn(applicationHomePage)
//                Open.url("http://todomvc.com/examples/react/")
        );
    }
}
