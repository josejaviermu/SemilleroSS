package TestNGHolaMundo.TestNGHolaMundo;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestNGHolaMundo.TestNGHolaMundo.RamdomEmailGenerator;

public class TestHelloWorld {

	@Test()
	public void testEmailGenerator() {

		RamdomEmailGenerator obj = new RamdomEmailGenerator();
		String email = obj.generate();

		Assert.assertNotNull(email);
		Assert.assertEquals(email, "feedback@yoursite.com");

	}
}
