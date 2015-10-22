//定义一个一维的A类型数组，直接定义并赋值，然后输出其中的一个值
public class A {
	public static int i;

	public static void main(String args[]) {
		A aa = new A();
		A bb = new A();
		A a[] = { aa, bb };
		a[0].i = 2;
		System.out.println(a[0].i);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("调用析构函数");
		super.finalize();
	}
	
}