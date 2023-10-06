package pgms_sanjay;

import org.testng.annotations.Test;

public class Patters {

	@Test
	public void pattern1()
	{
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern2()
	{
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		int n=5;//5
		for(int i=1;i<=n;i++)
			//  i=1 1<=5t
			//  i=2 2<=5t
			//  i=3 3<=5t
			//  i=4 4<=5t
			//  i=5 5<=5t
			//  i=6 6<=5f terminate
		{
			for(int j=1;j<=i;j++)
				//  j=1 1<=5t
				//  j=2 2<=5t
				//  j=3 3<=5t
				//  j=4 4<=5t
				//  i=5 5<=5t
				//  i=6 6<=5f terminate
			{
				System.out.print("* ");//*
				                       //* *
				                       //* * *
				                       //* * * *
				                       //* * * * *
			}
			System.out.println();
		}
	}
	@Test
	public void pattern3()
	{
	//* * * * *
	//* * * *
	//* * *
	//* *
	//*	
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern4()
	{
	//        *	
	//      * *	
	//    * * *	
	//  * * * *	
	//* * * * *
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern5()
	{
	//* * * * *
	//  * * * *
	//    * * *
	//      * *
	//        *
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern6()
	{
	//    *	
	//   * *	
	//  * * *	
	// * * * *
	//* * * * *
//	int n=5;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=i;j<=n;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=1;j<=i;j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern7()
	{
	//* * * * *
	// * * * *
	//  * * *
	//   * *
	//    *
//	int n=5;
//	for(int i=1;i<=n;i++)
//	{
//		for(int j=1;j<i;j++)
//		{
//			System.out.print(" ");
//		}
//		for(int j=i;j<=n;j++)
//		{
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	//**********************************Integers*******************************************
	@Test
	public void pattern8()
	{
	//1 1 1 1 1
	//1 1 1 1 1
	//1 1 1 1 1
	//1 1 1 1 1
	//1 1 1 1 1	
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print("1 ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern9()
	{
	//1 1 1 1 1
	//2 2 2 2 2
	//3 3 3 3 3
	//4 4 4 4 4
	//5 5 5 5 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern10()
	{
	//1 2 3 4 5
	//1 2 3 4 5
	//1 2 3 4 5
	//1 2 3 4 5
	//1 2 3 4 5
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}
	@Test
	public void pattern11()
	{
	//1 
	//1 2
	//1 2 3
	//1 2 3 4
	//1 2 3 4 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern12()
	{
	//1 1 1 1 1
	//2 2 2 2
	//3 3 3
	//4 4
	//5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern13()
	{
	//        1	
	//      2 2	
	//    3 3 3	
	//  4 4 4 4	
	//5 5 5 5 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern14()
	{
	//1 2 3 4 5
	//  2 3 4 5
	//    3 4 5
	//      4 5
	//        5	
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<i;j++)
		{
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern15()
	{
	//5 4 3 2 1
	//5 4 3 2
	//5 4 3
	//5 4
	//5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		int k=5;
		for(int j=i;j<=n;j++)
		{
			System.out.print(k-- +" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern16()
	{
	//1
	//2 2
	//1 1 1
	//2 2 2 2
	//1 1 1 1 1
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print("2 ");
			}else {
				System.out.print("1 ");
			}
		}
		System.out.println();
	}
	}
	@Test
	public void pattern17()
	{
	//    1	
	//   2 2	
	//  3 3 3 	
	// 4 4 4 4	
	//5 5 5 5 5
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	}
//***********************************************************
	@Test
	public void pattern18()
	{
	//A B C D E
	//F G H I J
	//K L M N O 
	//P Q R S T 
	//U V W X Y
	int n=5;
	char ch='A';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
	}
	@Test
	public void pattern19()
	{
	//A B C D E
	//A B C D E
	//A B C D E
	//A B C D E
	//A B C D E
	int n=5;
	for(int i=1;i<=n;i++)
	{
		char ch='A';
		for(int j=1;j<=n;j++)
		{
			System.out.print(ch++ +" ");
		}
		System.out.println();
	}
	}
}
