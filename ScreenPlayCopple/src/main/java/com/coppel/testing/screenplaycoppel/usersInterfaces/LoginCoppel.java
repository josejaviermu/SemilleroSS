package com.coppel.testing.screenplaycoppel.usersInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginCoppel {
	public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar usuario")
			.located(By.xpath("//input[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
	public static final Target CAMPO_CONTRASEÑA= Target.the("Campo para ingresar contraseña")
			.located(By.xpath("//input[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
	public static final Target BOTON_INICIAR_SESION= Target.the("boton iniciar sesion")
			.located(By.xpath("//div[@id='btn-login']"));
	
	public static final Target TEXTO_DE_VALIDACION= Target.the("mensaje de validacion de inicio de sesion")
			.located(By.xpath("//b[contains(text(),'La contraseña es incorrecta.')]"));
}
