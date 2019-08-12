package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {

		public void main() throws InterruptedException{
			
			//
			System.setProperty("webdriver.firefox.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			WebDriver Yo = new ChromeDriver();
			//
			Yo.get("http://www.wikipedia.com");
			//
			Yo.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("lo que sea");
			//
			//Yo.findElements(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
			Yo.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();
			//
			Thread.sleep(3000);
			//
			Yo.quit();
			
		}
	
}
