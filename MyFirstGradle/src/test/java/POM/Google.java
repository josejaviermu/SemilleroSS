package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Google {

	static WebDriver Driver;
	static By campoDeBusqueda = By.name("q");
	static By botonBuscar = By.xpath("//input[@name='q']");
	
	static void escribirEnElCampoDePrueba(String cadenaBuscar) {
		Driver.findElement(campoDeBusqueda).sendKeys(cadenaBuscar);
	}
	
	static void clickEnBotonBuscar() {
		Driver.findElement(botonBuscar).click();
	}
	
	static void abrirNavegador() {
		
	}
}
