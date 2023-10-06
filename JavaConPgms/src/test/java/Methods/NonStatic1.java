package Methods;

public class NonStatic1 
{
	int a=10;
	void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		NonStatic1 s = new NonStatic1();
		System.out.println(s.a);
		s.add();
	}
}