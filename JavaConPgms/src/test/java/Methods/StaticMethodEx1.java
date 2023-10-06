package Methods;

public class StaticMethodEx1 {
    static int a=10;
    static void disp()
    {
    	System.out.println("hello");
    }
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		disp();
	}
}
