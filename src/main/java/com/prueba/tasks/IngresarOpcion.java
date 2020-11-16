package com.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.userinterfaces.InfoFinancieraPagina.ESTADO_FINANCIERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarOpcion implements Task {

    public static IngresarOpcion estadoFinanciero() {

        return instrumented(IngresarOpcion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ESTADO_FINANCIERO,isVisible()).forNoMoreThan(10).seconds(), Click.on(ESTADO_FINANCIERO)
        );
    }
}
