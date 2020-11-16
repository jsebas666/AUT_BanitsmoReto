package com.prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.prueba.userinterfaces.InicioPagina.PRESUPUESTO;
import static com.prueba.userinterfaces.InicioPagina.TRASPARENCIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class Ingresar implements Task {


    public static Ingresar alPresupuesto() {
        return instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(TRASPARENCIA),
                WaitUntil.the(PRESUPUESTO,isCurrentlyVisible()).forNoMoreThan(10).seconds(),
                Click.on(PRESUPUESTO)
        );
    }
}
