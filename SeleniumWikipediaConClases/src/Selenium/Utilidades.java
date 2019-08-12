package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Utilidades {

	private WebDriver Yo;
	ATUTestRecorder recorder;
	DateFormat dateFormat;
	Date date;
	
	public void abrirNavegador(String driver, String rutacondriver, WebDriver yo) {
		// expecifica donde está
		System.setProperty(driver, rutacondriver);
		// lo inicializa y crea los objetos
		yo = new ChromeDriver();
	}
	
	public void buscarElemento(String xpat, WebDriver yo) {
		yo.findElement(By.xpath(xpat));
	}
	
	public void digitar(String xpat, String busqueda, WebDriver yo) {
		yo.findElement(By.xpath(xpat)).sendKeys(busqueda);
	}
	
	public void hacerClick(String xpat, WebDriver yo) {
		yo.findElement(By.xpath(xpat)).click();
	}
	
	public void tomarFoto(String rutadeAlmacenamiento, int numero, WebDriver yo) throws IOException {
		File img = ((TakesScreenshot)yo).getScreenshotAs(OutputType.FILE);
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
	
	public void cerrarNavegador(WebDriver yo) {
		yo.quit();
	}
	
}
