package JavaConcepts;

import org.testng.annotations.Test;

public class Printing {

	@Test
	public void printing()
	{
	System.out.println(20+20);	//40
	System.out.println("The value is"+20+20);//The value is2020
	System.out.println(20+20+"is the value");//40 is the value
	System.out.println("The value is"+(1/2));//both are integers so = 0
	System.out.println("The value is"+(1/2.0));//one is integer and another decimal so=0.5
	}
}