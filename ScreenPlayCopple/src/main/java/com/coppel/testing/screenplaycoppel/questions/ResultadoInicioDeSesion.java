package com.coppel.testing.screenplaycoppel.questions;

import static com.coppel.testing.screenplaycoppel.usersInterfaces.LoginCoppel.TEXTO_DE_VALIDACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultadoInicioDeSesion implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return  Text.of(TEXTO_DE_VALIDACION).viewedBy(actor).asString();
	}

	public static ResultadoInicioDeSesion enCoppel() {
		// TODO Auto-generated method stub
		return new ResultadoInicioDeSesion();	}

}
