//定义一个一维的A类型数组，直接定义并赋值，然后输出其中的一个值
public class StringClass {
	
	protected void split(){
		// TODO Auto-generated method stub
		String ss="hello world";
		String[] strings= ss.split(" ");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
}