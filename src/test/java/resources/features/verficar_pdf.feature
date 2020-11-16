#language: es
#author: vallejo_1551@hotmal.com

  Característica: Validar PDF

    Escenario: Proceso para validar pdf

Característica: Proceso para valdacion de pdf sobre situacion financiera
  Como usuario
  quiero utilizar la aplicación para solicitar la situacion financiera y descargarla
  para validar que el pdf corresponda

    Dado que juanse abre el navegador en la aplicacion
    Cuando  descarga el balance de sus estados financieros
    Entonces verifica que su pdf sea el correcto
