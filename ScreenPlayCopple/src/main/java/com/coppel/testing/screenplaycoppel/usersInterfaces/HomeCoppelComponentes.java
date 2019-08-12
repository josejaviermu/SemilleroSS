package com.coppel.testing.screenplaycoppel.usersInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomeCoppelComponentes {
	//target es la evoluciom de web element
	public static final Target PANTALLAS = Target.the("Link a pantallas disponibles")
			.located(By.xpath("//div[@class='col-xs-12 col-md-6 HombreMujer']//div[2]//a[1]//img[1]"));
	public static final Target INICIO_DE_SESION = Target.the("Link a inicio de sesion")
			.located(By.xpath("//div[@class='dropdown-toggle pointer']"));
	public static final Target PESTAÑA_A_INICIO_DE_SESION = Target.the("Pestaña a inicio de sesion")
			.located(By.xpath("//a[@id='signInQuickLink']"));
	
	
}
