package com.coppel.testing.screenplaycoppel.tasks;

import static com.coppel.testing.screenplaycoppel.usersInterfaces.LoginCoppel.CAMPO_CONTRASEÑA;
import static com.coppel.testing.screenplaycoppel.usersInterfaces.LoginCoppel.CAMPO_USUARIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.coppel.testing.screenplaycoppel.models.LoginDatos;
import com.coppel.testing.screenplaycoppel.usersInterfaces.ListTvPage;
import com.coppel.testing.screenplaycoppel.usersInterfaces.LoginCoppel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autenticarse implements Task{
	
	private List<LoginDatos> loginDatos;
	
	
	public Autenticarse(List<LoginDatos> loginDatos) {
		this.loginDatos = loginDatos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(loginDatos.get(0).getUser()).into(CAMPO_USUARIO),
				Enter.theValue(loginDatos.get(0).getPassword()).into(CAMPO_CONTRASEÑA),
				Click.on(LoginCoppel.BOTON_INICIAR_SESION));
	}

	public static Autenticarse enCoppel(List<LoginDatos> loginDatos) {
		// retorna el objeto instanciado
		return instrumented(Autenticarse.class,loginDatos);
		
	}

}
