package GradleWikipediaConClase;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static GradleWikipediaConClase.Utilidades.paginaInicial;

import static GradleWikipediaConClase.Utilidades.abrirNavegador;

import GradleWikipediaConClase.Utilidades;
//import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Wikipedia {

	Utilidades bot = new Utilidades();
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setUp() throws Exception {
	
		String ruta = "webdriver.chrome.driver";
		String rutaDriver = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		driver = abrirNavegador(ruta, rutaDriver);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		driver.manage().window().maximize();
		//paginaInicial();
	}

}
