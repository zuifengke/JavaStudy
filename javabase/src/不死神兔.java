
public class 不死神兔{

	
	    public static void main(String[] args)
	    {
	        //鏂瑰紡1:鏁扮粍瀹炵幇
	        int[] arr = new int[20];
	        arr[0] = 1;
	        arr[1] = 1;
	        for(int i = 2 ; i < arr.length; i++)
	        {
	            arr[i] = arr[i - 2] + arr[i - 1];
	        }
	        System.out.println(arr[19]);
	        System.out.println("------");
	        //鏂瑰紡2:鍙橀噺鐨勫彉鍖栧疄鐜�
	        int a = 1;
	        int b = 1;
	        for (int i = 0; i < 18; i++) 
	        {
	            int temp = a;
	            a = b;
	            b = temp + b;
	        }
	        System.out.println(b);
	        System.out.println("------");
	        //鏂瑰紡3
	        System.out.println(sum(20));
	    }
	    //鏂瑰紡3:閫掑綊瀹炵幇
	    public static int sum(int i)
	    {
	        if(i == 1 || i == 2)
	            return 1;
	        else
	            return sum(i - 1) + sum(i - 2);
	    }
	
}
