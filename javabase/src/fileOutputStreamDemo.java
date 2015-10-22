import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class fileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fileOutputStream = new FileOutputStream("d:/text.txt");
		// 定义一个指向D:/TEXT.TXT 的字节流 
		fileOutputStream.write("kaka".getBytes());
		fileOutputStream.close();
	}

}
