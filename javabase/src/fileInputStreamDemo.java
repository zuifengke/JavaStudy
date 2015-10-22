import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class fileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream("d:/text.txt");
		// 定义一个指向D:/TEXT.TXT 的字节流 

		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); 
		//字节流转换成InputStreamReader 

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
		//InputStreamReader 转换成带缓存的bufferedReader

		//可以把读出来的内容赋值给字符 
		String ss = new String(); 
		String s; 
		while((s = bufferedReader.readLine())!=null){ 
		        ss += s; 
		} 
		System.out.print(ss);
	}

}
