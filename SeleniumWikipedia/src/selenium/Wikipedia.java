package selenium;
/*
import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import org.monte.media.FormatKeys;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
*/

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.java.util.jar.pack.Package.File;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException, ATUTestRecorderException, IOException 
			//throws IOException, AWTException
	{
		/*
		GraphicsConfiguration gc = GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getDefaultScreenDevice()
				.getDefaultConfiguration();
		ScreenRecorder screenRecorder = new ScreenRecorder(
				gc,null,
				new Format(MediaTypeKey,FormatKeys.MediaTypeKey.File,MimeTypeKey,MIME_QUICKTIME),
				new Format(MediaTypeKey,FormatKeys.MediaTypeKey.VIDEO,EncodingKey,ENCONDING_QUICKTIME_JPEG
						CompressorNameKey,ENCODING_QUICKTIME_JPEG,DepthKey,24,FrameRateKey,Rational.valueOf(15),
						QualityKey,0.5f,KeyFrameIntervalKey,15*60),
				new Format(MediaTypeKey,FormatKeys.MediaType.VIDEO,
						EncodingKey,"black",FrameRateKey,Rational.valueOf(30)
						),
				null, new File("F:\\TestResults\\Javaselenium.avi")
				
				);
				
		ScreenRecorder.start();
		*/
		
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		Date date = new Date();
		//crea objeto de ATUTestRecorder
		//Proporciona la ruta para guardar videos y el formato del nombre del archivo 
		ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\VideosTest","TestVideo-"+dateFormat.format(date),false);
		//ATUTestRecorder recorder = new ATUTestRecorder("C:\\Selenium\\VideosTest","TestVideo",false);
		//inicia la grabación
		recorder.start();
		
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Yo = new ChromeDriver();
		
		Yo.get("http://www.wikipedia.org");
		//
		//Thread.sleep(1000);
		Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//
		Yo.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("automatización de pruebas");
		//
		Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//Thread.sleep(1000);
		File img = ((TakesScreenshot)Yo).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("C:\\Selenium\\ImagenTest\\imgChrome.png"));
		Yo.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		//
		//Yo.findElements(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		Yo.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
		//
		//Thread.sleep(10000);
		img = ((TakesScreenshot)Yo).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File("C:\\Selenium\\ImagenTest\\imgChrome"+dateFormat.format(date)+".png"));
		//Yo.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//
		Yo.quit();
		//Para la grabación
		recorder.stop();
	}

}
