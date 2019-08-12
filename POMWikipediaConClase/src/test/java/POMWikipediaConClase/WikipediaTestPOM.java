package POMWikipediaConClase;

//import static org.junit.Assert.*;

import static POMWikipediaConClase.Utilidades.crearRobot;
import static POMWikipediaConClase.Utilidades.abrirNavegador;
import static POMWikipediaConClase.Utilidades.paginaInicial;
import static POMWikipediaConClase.Utilidades.campoBusquedaYTextoAConsultar;
import static POMWikipediaConClase.Utilidades.presionarBotonBusqueda;
import static POMWikipediaConClase.Utilidades.seleccionarPagina;
import static POMWikipediaConClase.Utilidades.seleccionarOpcionPagina;
import static POMWikipediaConClase.Utilidades.tomarPantallazo;
import static POMWikipediaConClase.Utilidades.buscarEnLaPagina;
import static POMWikipediaConClase.Utilidades.presionarBotonParaBusqueda;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static POMWikipediaConClase.Utilidades.iniciargrabaciondeVideo;
import static POMWikipediaConClase.Utilidades.detenerGrabacionDeVideo;

import static POMWikipediaConClase.Utilidades.navegadorAUtilizar;
import static POMWikipediaConClase.Utilidades.paginaInicialACargar;
import static POMWikipediaConClase.Utilidades.rutaEjecutableNavegador;
import static POMWikipediaConClase.Utilidades.seleccionarCampoBusqueda;
import static POMWikipediaConClase.Utilidades.ingresarConsulta;
import static POMWikipediaConClase.Utilidades.presionarBotonBuscar;
import static POMWikipediaConClase.Utilidades.paginaASeleccionar;
import static POMWikipediaConClase.Utilidades.seleccionarOpcion;
import static POMWikipediaConClase.Utilidades.formatoFechaVideoEImagenes;
import static POMWikipediaConClase.Utilidades.rutaParaGuardarPantallazo;
import static POMWikipediaConClase.Utilidades.ingresarBusqueda;
import static POMWikipediaConClase.Utilidades.seleccionarCampoParaBusqueda;
import static POMWikipediaConClase.Utilidades.presionarBotonParaBuscar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class WikipediaTestPOM {

	private WebDriver robot;
	
	@Before
	public void setUp() throws Exception {
	
		abrirNavegador(navegadorAUtilizar, rutaEjecutableNavegador);
		robot = crearRobot();
	}

	@After
	public void tearDown() throws Exception {
		robot.quit();
	}

	@Test
	public void test() throws ATUTestRecorderException, IOException {
		
		iniciargrabaciondeVideo();
		robot.manage().window().maximize();
		paginaInicial(paginaInicialACargar);
		
		campoBusquedaYTextoAConsultar(seleccionarCampoBusqueda, ingresarConsulta);
		
		presionarBotonBusqueda(presionarBotonBuscar);
		seleccionarPagina(paginaASeleccionar);
		robot.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		seleccionarOpcionPagina(seleccionarOpcion);
		//robot.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		tomarPantallazo(formatoFechaVideoEImagenes, rutaParaGuardarPantallazo);
		buscarEnLaPagina(seleccionarCampoParaBusqueda, ingresarBusqueda);
		robot.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		presionarBotonParaBusqueda(presionarBotonParaBuscar);
		detenerGrabacionDeVideo();
	}

}
