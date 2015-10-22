
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//定义一个一维的A类型数组，直接定义并赋值，然后输出其中的一个值
public class ListClass {

	public static void main(String args[]) {
		List col = new ArrayList();
		String oldValue = "abcd";
		String newValue = "1234";
		col.add(oldValue);
		Iterator it = col.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			if(str.equals(oldValue)){
				col.remove(oldValue);
				col.add(newValue);
			}
		}
		
	}
}