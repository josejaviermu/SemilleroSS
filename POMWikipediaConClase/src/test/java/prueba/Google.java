package prueba;

//import static org.junit.Assert.*;

import static prueba.Utilidades.CrearRobot;
import static prueba.Utilidades.abrirNavegador;
//import static prueba.Utilidades.detenerGrabacionDeVideo;
//import static prueba.Utilidades.iniciarGrabacionDeVideo;
import static prueba.Utilidades.seleccionarOpcionPagina;
import static prueba.Utilidades.seleccionarPagina;
//import static prueba.Utilidades.tomarPantallazo;
import static prueba.Utilidades.presionarBotonBusqueda;
import static prueba.Utilidades.campoBusquedaYTextoConsultar;
import static prueba.Utilidades.paginaInicial;

import static prueba.Utilidades.navegadorAUtilizar;
import static prueba.Utilidades.paginaInicialACargar;
//import static prueba.Utilidades.formatoFechaVideoYImagenes;
//import static prueba.Utilidades.rutaParaGuardarPantallazo;
import static prueba.Utilidades.seleccionarCampoBusqueda;
import static prueba.Utilidades.ingresarConsulta;
import static prueba.Utilidades.presionarBotonBuscar;
import static prueba.Utilidades.paginaAseleccionar;
import static prueba.Utilidades.seleccionarOpcion;
import static prueba.Utilidades.rutaEjecutableNavegador;

import java.io.IOException;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Google {

	private WebDriver bot;
	
	
	@Before
	public void setUp() throws Exception {
		
		abrirNavegador(navegadorAUtilizar, rutaEjecutableNavegador);
		bot=CrearRobot();
	}

	@After
	public void tearDown() throws Exception {
		bot.quit();
	}

	@Test
	public void test() throws ATUTestRecorderException, IOException {
		
		//iniciarGrabacionDeVideo();
		bot.manage().window().maximize();
		paginaInicial(paginaInicialACargar);
		//tomarPantallazo(formatoFechaVideoYImagenes, rutaParaGuardarPantallazo);
		campoBusquedaYTextoConsultar(seleccionarCampoBusqueda, ingresarConsulta);
		//tomarPantallazo(formatoFechaVideoYImagenes, rutaParaGuardarPantallazo);
		presionarBotonBusqueda(presionarBotonBuscar);
		seleccionarPagina(paginaAseleccionar);
		//tomarPantallazo(formatoFechaVideoYImagenes, rutaParaGuardarPantallazo);
		seleccionarOpcionPagina(seleccionarOpcion);
		//tomarPantallazo(formatoFechaVideoYImagenes, rutaParaGuardarPantallazo);
		//detenerGrabacionDeVideo();
	}

}
