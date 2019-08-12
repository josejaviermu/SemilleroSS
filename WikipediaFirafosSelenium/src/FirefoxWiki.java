import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxWiki {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		
		WebDriver Yo = new FirefoxDriver();
		//
		Yo.get("http://www.wikipedia.com");
		
		Yo.quit();

	}

}
