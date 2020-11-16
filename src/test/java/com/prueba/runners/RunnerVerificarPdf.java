package com.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//se crea runner para referenciar feature y stepdefintions del escenario buy_cart
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/java/resources/features/verficar_pdf.feature",
        glue = "com.prueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerVerificarPdf {
}
