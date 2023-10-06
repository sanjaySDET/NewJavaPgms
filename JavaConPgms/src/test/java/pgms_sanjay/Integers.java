package pgms_sanjay;

import org.testng.annotations.Test;

public class Integers {

	@Test
	public void findFactorialOfANumber()
	{
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact);
	}
	@Test
	public void fibonacciSeries()
	{
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" ");
		System.out.print(fib2+" ");
		for(int i=1;i<=10;i++)
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");		
		}
	}
	@Test
	public void printNosInTheGivenFormat()
	{
		//1 3 7 15 31 63 127
		int n=1;
		for(int i=0;i<=6;i++)
		{
			System.out.print(n+" ");
			n=(n*2)+1;
		}
	}
	@Test
	public void checkWhetherTheGivenNoIsPrimeOrNot()
	{
		int no=7;//it is a prime
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(no+ "=prime no");
		}else {
			System.out.println(no+ "=not prime no");
		}
	}
	@Test
	public void printPrimeNosInAnArray()
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};	
		for (int i = 0; i < arr.length; i++) 
		{
			
			boolean flag = false;
			
			for (int j = 2; j < arr[i] ; j++) 
			{
				if (arr[i]%j==0) 
				{
					flag=true;
					break;
				}
				
			}
			if (arr[i]==1) 
			{
				flag = true;
			}
			if (!flag) 
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	@Test
	public void printPrimeNosFrom1to20()
	{
		for(int i=0;i<=20;i++)
		{
			int n=i;
			int j=2;
			while(j<=n)
			{
				if(n%j==0)
				{
					break;
				}else {
					j++;
				}
			}
			if(j==n)
			{
				System.out.println(n);
			}
		}	
	}
	@Test
	public void integerPalyndrome()
	{
		int num = 121;
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum)
			System.out.println("The entered number " + temp + " is a palindrome number ");
		else
			System.out.println("The entered number " + temp + " is not a palindrome");
	}
}
