package com.coppel.testing.screenplaycoppel.usersInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class MiniShopCartPage {
	public static final Target NOMBRE_PRODUCTO = Target.the("texto que devuelve el producto selccionado")
			.located(By.xpath("//p[@class='nombre_producto']"));
}
