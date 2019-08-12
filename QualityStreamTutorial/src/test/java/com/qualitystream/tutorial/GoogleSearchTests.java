package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTests {

	private WebDriver driver;
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("htttps://www.google.com/");
	}
	
	@Test
	public void testGooglePage() {
/*		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		WebElement searchbox = driver.findElement(By.linkText("google"));
		searchbox.clear();
		searchbox.sendKeys("quality-stream Introducción a la Automatización de Pruebas de Software");
		searchbox.submit();  */
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("quality-stream Introducción a la Automatización de Pruebas de Software");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("quality-stream Introducción a la Automatización de Pruebas de Software - Google Search", driver.getTitle());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
