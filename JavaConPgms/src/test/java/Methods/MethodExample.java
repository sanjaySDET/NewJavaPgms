package Methods;

public class MethodExample 
{
	static void add()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		add();
		System.out.println("main ends");
	}
}
