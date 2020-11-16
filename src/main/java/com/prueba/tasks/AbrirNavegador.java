package com.prueba.tasks;

import com.prueba.userinterfaces.InicioPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.userinterfaces.InicioPagina.TRASPARENCIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirNavegador implements Task {

    private InicioPagina inicioPagina;

    public static AbrirNavegador enLaPagina() {
        return instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(inicioPagina),
                WaitUntil.the(TRASPARENCIA,isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
