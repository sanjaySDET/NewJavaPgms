package Methods;

public class MethodWithReturnType {

//	static String disp()
//	{
//		return "hello";
//	}
	static int disp()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) 
	{
		//String x=disp();
		int x=disp();
		System.out.println(x);
	}

}
