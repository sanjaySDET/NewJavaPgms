package Methods;

class Sample
{
      void m1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}

public class NonStaticWithParameter {
	public static void main(String[] args) 
	{
		Sample d = new Sample();	
	    d.m1(10, 20);
	}

}
