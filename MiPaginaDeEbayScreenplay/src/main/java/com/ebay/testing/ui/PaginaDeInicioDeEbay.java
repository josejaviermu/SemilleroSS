package com.ebay.testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.ebay.com")
public class PaginaDeInicioDeEbay extends PageObject{
	public static final Target CAMPO_DE_BUSQUEDA = Target.the("Campo de busqueda de Google").located(By.xpath("//input[@id='gh-ac']"));
	public static final Target SELECCIONAR_CAMARA = Target.the("selecciona la camara en el sitio ebay").located(By.xpath("//a[@class='s-item__link'][1]"));
	public static final Target BOTON_ANADIR_AL_CARRITO = Target.the("agregar producto al carrito").located(By.xpath("//a[@id='isCartBtn_btn']"));
}
