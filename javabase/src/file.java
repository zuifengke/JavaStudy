import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class file {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileManager a = new FileManager("a.txt",new char[]{'\n'});
		FileManager b = new FileManager("b.txt",new char[]{'\n',' '});		
		FileWriter c = new FileWriter("c.txt");
		String aWord = null;
		String bWord = null;
		while((aWord = a.nextWord()) !=null ){
			c.write(aWord + "\n");
			bWord = b.nextWord();
			if(bWord != null)
				c.write(bWord + "\n");
		}
		
		while((bWord = b.nextWord()) != null){
			c.write(bWord + "\n");
		}	
		c.close();

	}
}
