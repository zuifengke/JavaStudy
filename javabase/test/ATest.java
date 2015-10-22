import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ATest {
	@Test
	public void finalizeTest() throws Exception {
		A a=new A();
		a=null;
		System.gc();
	}
	
	
}
