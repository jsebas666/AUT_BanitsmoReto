package com.prueba.stepdefinitions;

import com.prueba.tasks.AbrirNavegador;
import com.prueba.tasks.Ingresar;
import com.prueba.tasks.IngresarOpcion;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.prueba.utilities.Constantes.*;
import static net.serenitybdd.screenplay.actors.OnStage.drawTheCurtain;

//configuracion de steps para la prueba
public class VerificarPdfStepsDefinitions {

    //se administra el driver que se va usar
    @Managed(driver = NAVEGADOR)
    private WebDriver browser;
    public static final Actor JUANSE = Actor.named(USUARIO);

    @Before
    public void prepareScenario() {
        JUANSE.can(BrowseTheWeb.with(browser));
    }

    @Dado("^que juanse abre el navegador en la aplicacion$")
    public void queJuanseAbreElNavegadorEnLaAplicacion() throws Exception {
        JUANSE.wasAbleTo(AbrirNavegador.enLaPagina());
    }

    @Cuando("^descarga el balance de sus estados financieros$")
    public void descargaElBalanceDeSusEstadosFinancieros() throws Exception {
        JUANSE.attemptsTo(Ingresar.alPresupuesto());
        JUANSE.attemptsTo(IngresarOpcion.estadoFinanciero());
    }

    @Entonces("^verifica que su pdf sea el correcto$")
    public void verificaQueSuPdfSeaElCorrecto() throws Exception {

    }

    //libera recursos
    @After
    public void releaseStage() {
        drawTheCurtain();
    }

}
