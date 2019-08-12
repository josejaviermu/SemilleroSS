package seleni;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class WikipediaIE {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException, IOException {
		// TODO Auto-generated method stub

		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\VideosTest","TestVideoInternetExplorer",false);
		//inicia la grabación
		recorder.start();
			//Coloca la ruta para el driver de Firefox
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			//Crea un objeto tipo Driver para Firefox
			WebDriver Yo = new InternetExplorerDriver();
			//
			Yo.get("http://www.wikipedia.com");
			//
			//Thread.sleep(1000);
			Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			File img = ((TakesScreenshot)Yo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(img, new File("C:\\Selenium\\ImagenTest\\imgIE.png"));			
			//
			Yo.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("automatización de pruebas");
			//Thread.sleep(1000);
			//
			Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			//Yo.findElements(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
			Yo.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
			//
			Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
			//Thread.sleep(3000);
			img = ((TakesScreenshot)Yo).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(img, new File("C:\\Selenium\\ImagenTest\\imgIE"+dateFormat.format(date)+".png"));
			//
			Yo.quit();
			//Para la grabación
			recorder.stop();
		
	}

}
