package Methods;

class demo
{
	static String s="hello";
	static void disp()
	{
		System.out.println("sanjay");
	}
}
public class StaticMethodEx2 {

	public static void main(String[] args) 
	{
		System.out.println(demo.s);
		demo.disp();
	}
}