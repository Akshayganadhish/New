import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataP {
	@DataProvider(name="inputs")
	public Object[][] Data() {
		return new Object[][] { { "Hey", "Bye" }, { "Hi", "Hey1" } };
	}
	
	@Test(dataProvider = "inputs")
	void test(String msg1, String msg2) {
		System.out.println("First mesg"+msg1);
		System.out.println("Reply mesg"+msg2);
	}
}
