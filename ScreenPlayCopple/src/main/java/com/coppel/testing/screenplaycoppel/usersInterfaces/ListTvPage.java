package com.coppel.testing.screenplaycoppel.usersInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ListTvPage {
	public static final Target BOTON_COMPRAR = Target.the("Boton para comprar el televisor")
			.located(By.xpath("//a[@id='add2CartBtn_518282']"));
	public static final Target BOTON_COMPRAR_EMERGENTE = Target
			.the("Boton para comprar el televisor en la pantalla emergente")
			.located(By.xpath("//a[@id=\"WC_QuickInfo_Link_addtocart\"]"));
	public static final Target BOTON_CARRITO_DE_COMPRAS = Target.the("Boton para ingresar al carrito de compras")
			.located(By.xpath("//div[@id='MiniShoppingCart']"));
}
