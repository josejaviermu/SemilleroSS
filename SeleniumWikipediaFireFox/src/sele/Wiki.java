package sele;

import atu.testrecorder.ATUTestRecorder;

import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Wiki {

public static void main(String[] args) throws InterruptedException, ATUTestRecorderException {
		
		
	ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\VideosTest","TestVideoFirefox",false);
	//inicia la grabación
	recorder.start();
		//Coloca la ruta para el driver de Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		//Crea un objeto tipo Driver para Firefox
		WebDriver Yo = new FirefoxDriver();
		//
		Yo.get("http://www.wikipedia.com");
		//
		Thread.sleep(1000);
		//
		Yo.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("automatización de pruebas");
		Thread.sleep(1000);
		//
		//Yo.findElements(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		Yo.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		//
		Thread.sleep(3000);
		//
		Yo.quit();
		//Para la grabación
		recorder.stop();
	}
	
}
