package com.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class InicioPagina extends PageObject {

    public static final Target TRASPARENCIA = Target.the("Opcion Menu")
            .locatedBy("//*[@id='zz2_RootAspMenu']/li[7]/a/span/span[1]");

    public static final Target PRESUPUESTO = Target.the("Opcion Menu")
            .locatedBy("//span[contains(text(),'Presupuesto') and (@class='menu-item-text') ]  ");
}
