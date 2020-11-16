package com.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InfoFinancieraPagina {

    public static final Target ESTADO_FINANCIERO = Target.the("Opcion Menu")
            .locatedBy("//*[@id='ctl00_PlaceHolderMain_MenuThirdLevel']/ul/li[3]/a");

}
