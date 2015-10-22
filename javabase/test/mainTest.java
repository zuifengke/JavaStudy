import java.util.concurrent.ThreadPoolExecutor;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class mainTest {
	@Test
	public void helloworldTest() throws Exception {
		main main = new main();
		main.helloWorld();

		Assert.assertEquals(true, true);
	}

	@Test
	public void staticMethodTest() throws Exception {
		main.staticMethod();

		Assert.assertEquals(true, true);
	}

	@Test
	public void plusTest() throws Exception {
		main.plus();

		Assert.assertEquals(true, true);
	}

	@Test
	public void initArrayTest() throws Exception {
		main.initArray();

		Assert.assertEquals(true, true);
	}

	@Test
	public void setMethodTest() throws Exception {
		main.setMethod();

		Assert.assertEquals(true, true);
	}

	@Test
	public void dataInputStreamMethodTest() throws Exception {
		main.dataInputStreamMethod();

		Assert.assertEquals(true, true);
	}

	@Test
	public void Test1Test() throws Exception {
		main.Test1();

		Assert.assertEquals(true, true);
	}

	@Test
	public void Test4Test() throws Exception {
		main.Test4();

		Assert.assertEquals(true, true);
	}

	@Test
	public void Test5Test() throws Exception {
		VariantTest test1 = new VariantTest();
		VariantTest test2 = new VariantTest();

		Assert.assertEquals(true, true);
	}

	@Test
	public void Test6Test() throws Exception {
		// round四舍五入，ceil向上取整，floor向下取整
		System.out.println(Math.round(11.6));
		System.out.println(Math.ceil(11.3));
		System.out.println(Math.floor(11.6));
		Assert.assertEquals(true, true);
	}

	@Test
	public void Test7Test() throws Exception {

		new Thread() {
			public void run() {
				System.out.println("hello world");
			}
		}.start();

		new Thread(new Runnable() {
			public void run() {
				System.out.println("hello world1");
			}
		}).start();

	}

}
