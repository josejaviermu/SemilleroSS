package MyFirstGradle;

// importaciones de bibliotecas
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class Google {
/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
*/
	private WebDriver Yo;
	ATUTestRecorder recorder;
	DateFormat dateFormat;
	Date date;
	
	@Before
	public void setUp() throws Exception {
		
		dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		date = new Date();
		
		grabarVideo("C:\\Selenium\\VideosTest", "TestVideo-"+dateFormat.format(date));
		
		String driver = "webdriver.chrome.driver";
		String rutacondriver = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		
		abrirNavegador(driver, rutacondriver);
		
	}

	@After
	public void tearDown() throws Exception {
		
		cerrarNavegador();	
		terminarVideo();
		
	}

	@Test
	public void test() throws IOException, InterruptedException {
		
		Yo.get("http://www.wikipedia.org");

		String busqueda = "automatización de pruebas";
		String xpat = "//input[@id='searchInput']";

		digitar(xpat, busqueda);
		
		// da un tiempo de espera de 3 segundos
		Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		String rutadeAlmacenamiento = "C:\\Selenium\\ImagenTest\\";
		int numero = 0;
		tomarFoto(rutadeAlmacenamiento, numero+1);

		Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		xpat = "//button[@class='pure-button pure-button-primary-progressive']";
		hacerClick(xpat);
		
		// implementacion de asserNotSame
		// si el objeto busqueda no es igual al comparado, en este caso el string "kfj", sigue adelante y no da error
		assertNotSame("kfj",busqueda);
		
		tomarFoto(rutadeAlmacenamiento, numero+2);
		
		Yo.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	//             métodos
	

	public void abrirNavegador(String driver, String rutacondriver) {
		// expecifica donde está
		System.setProperty(driver, rutacondriver);
		// lo inicializa y crea los objetos
		Yo = new ChromeDriver();
	}
	
	public void buscarElemento(String xpat) {
		Yo.findElement(By.xpath(xpat));
	}
	
	public void digitar(String xpat, String busqueda) {
		Yo.findElement(By.xpath(xpat)).sendKeys(busqueda);
	}
	
	public void hacerClick(String xpat) {
		Yo.findElement(By.xpath(xpat)).click();
	}
	
	public void tomarFoto(String rutadeAlmacenamiento, int numero) throws IOException {
		File img = ((TakesScreenshot)Yo).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File(rutadeAlmacenamiento+"img"+numero+".png"));
	}
	
	public void grabarVideo(String rutaAlmacenamiento, String nombreVideo) throws ATUTestRecorderException {
		//crea objeto de ATUTestRecorder
		//Proporciona la ruta para guardar videos y el formato del nombre del archivo 
		recorder = new ATUTestRecorder(rutaAlmacenamiento,nombreVideo,false);
				
		//inicia la grabación
		recorder.start();
	}
	
	public void terminarVideo() throws ATUTestRecorderException {
		recorder.stop();
	}
	
	public void cerrarNavegador() {
		Yo.quit();
	}
}
