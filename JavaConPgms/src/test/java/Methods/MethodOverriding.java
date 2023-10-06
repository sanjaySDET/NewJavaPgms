package Methods;

class Whatsapp
{
	void status()
	{
		System.out.println("status with text");
	}
}
class Instagram extends Whatsapp
{
	void status()
	{
		super.status();
		System.out.println("status with image and text");
	}
}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		Instagram i = new Instagram();
		i.status();
	}
}