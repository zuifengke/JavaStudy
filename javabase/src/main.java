import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class main  {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void helloWorld() {
		System.out.println("hello world");
	}

	public static void staticMethod() {
		System.out.println("static");
	}

	public static void plus() throws RuntimeException {
		int a = 0;
		a++;
		System.out.println(a);
		int b = 0;
		++b;
		System.out.println(b);

	}

	public static void initArray() {
		int a[] = new int[5];
		// a={1,2,3,4,5};//错误 , 只能在初始化时这样做
		a[0] = 1;
		a[1] = 2;
		System.out.println(a[0]);

	}

	public static void setMethod() {
		Set col = new HashSet();
		String oldValue = "abcd";
		String newValue = "1234";
		col.add(oldValue);
		Iterator it = col.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			if (str.equals(oldValue)) {
				col.remove(oldValue);
				col.add(newValue);
			}
		}

	}

	public static void dataInputStreamMethod() {
		try {

			String currentLine;
			DataInputStream in = new DataInputStream(new BufferedInputStream(
					new FileInputStream("A.java")));
			while ((currentLine = in.readLine()) != null) {
				System.out.println(currentLine);
			}
		} catch (IOException e) {
			System.err.println("Error: " + e);
		}

	}

	// &和&&的区别
	public static void Test1() {
		int x = 1;
		int y = 0;
		int z = 0;
		if (x == 0 & ++y > 0) {

		}
		System.out.println(y);
		if (x == 0 && ++z > 0) {
		}
		System.out.println(z);
	}

	// 跳出多重循环
	public static void Test2() {
		ok: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					if (j == 5)
						break ok;
				}
			}
		}
	}

	// 跳出多重循环
	public static void Test3() {
		short s=1;
		s=(short) (s+1);
		@SuppressWarnings("unused")
		short s1=1;
		s1+=1;
	}

	// 用最有效率的方法算出2乘以8等於几
	public static void Test4() {
		System.out.println(2<<3);
	}
}
