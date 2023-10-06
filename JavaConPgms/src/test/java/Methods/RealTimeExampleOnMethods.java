package Methods;

public class RealTimeExampleOnMethods {

	static int account()
	{
		int sal=10000;
		int months=12;
		int total=sal*months;
		return total;
		//after return statement we can't develop any statements
	}
	public static void main(String[] args) 
	{
		int x=account();
		int bonus=20000;
		System.out.println(x+bonus);
	}

}
