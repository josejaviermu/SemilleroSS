package com.coppel.testing.screenplaycoppel.questions;

import static com.coppel.testing.screenplaycoppel.usersInterfaces.MiniShopCartPage.NOMBRE_PRODUCTO;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		//Todo lo que se ve por el actor 
		return  Text.of(NOMBRE_PRODUCTO).viewedBy(actor).asString();
	}

	public static LaRespuesta en() {
		// TODO Auto-generated method stub
		return new LaRespuesta();
	}

}
