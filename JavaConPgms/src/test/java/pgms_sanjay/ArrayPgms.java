package pgms_sanjay;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ArrayPgms {

	@Test
	public void swap2nosUsing3rdVariable()
	{
		int a= 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	@Test
	public void swap2nosWithoutUsing3rdVar() {
		int a = 10;
		int b = 20;
		a = a + b;// 10+20=30
		b = a - b;// 30-20=10
		a = a - b;// 30-10=20
		System.out.println("a=" + a);// 20
		System.out.println("b=" + b);// 10
	}
	@Test
	public void sortAnArrayInAscendingOrderUsingBubbleSortTechnique() {
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
	}
	@Test
	public void sortAnArrayInDescendingOrderUsingBubbleSortTechnique() {
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	@Test
	public void find1stMinNoInAnArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The 1st min no in array is="+a[0]);
	}
	@Test
	public void find2ndMinNoInAnArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The 2nd min no in array is="+a[1]);
	}
	@Test
	public void find1stMaxNoInAnArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The 1st max no in array is="+a[0]);
	}
	@Test
	public void find2ndMaxNoInAnArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("The 2nd max no in array is="+a[1]);
	}
	@Test
	public void findSumOf1st3MinNoInArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	@Test
	public void findSumOf1st3MaxNoInArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	@Test
	public void findMulOf1st3MinNoInArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	@Test
	public void findMulOf1st3MaxNoInArrayUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int mul=1;
		for(int i=0;i<3;i++)
		{
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	@Test
	public void productOf1st3MaxNosInAnArray()
	{
	    int[] arr = {2,3,1,0};
        int n = arr.length;

//        if(n < 3) {
//            System.out.println("Array size should be at least 3");
//            return;
//        }

        int max1=0,max2=0,max3=0;
//        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
//        System.out.println(max1);
//        System.out.println(max2);
//        System.out.println(max3);
        
        for(int i=0; i<n; i++) {
            if(arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if(arr[i] > max3) {
                max3 = arr[i];
            }
        }

        int product = max1 * max2 * max3;
        System.out.println("Product of first 3 maximum elements: " + product);
	}
	@Test
	public void find1stMinNoInArrayWithoutUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		int fmin=a[0];//5 3 0
		for(int i=0;i<a.length;i++)
			//  i=0 0<5t  a[i]=5
			//  i=1 1<5t  a[i]=3
			//  i=2 2<5t  a[i]=0
			//  i=3 3<5t  a[i]=1
			//  i=4 4<5t  a[i]=4
			//  i=5 5<5f terminate
		{
			if(fmin>a[i])//5>5f, 5>3t, 3>0t, 0>1f, 0>4f
			{
				fmin=a[i];//3 0
			}
		}
		System.out.println("The 1st min no in an array is="+fmin);//0
	}
	@Test
	public void find1stMaxNoInArrayWithoutUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 4 };
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				fmax=a[i];
			}
		}
		System.out.println("The 1st max no in an array is="+fmax);
	}
	@Test
	public void find1stAnd2ndMinNosInArrayWithoutUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 0 };//0 1
		int fmin=a[0];//5 3 0
		int smin=a[0];//5 5 3 1
		for(int i=0;i<a.length;i++)
			//  i=0 0<5t  a[i]=5
			//  i=1 1<5t  a[i]=3
			//  i=2 2<5t  a[i]=0
			//  i=3 3<5t  a[i]=1
			//  i=4 4<5t  a[i]=0
			//  i=5 5<5f terminate
		{
			if(a[i]<=fmin)//5<=5t, 3<=5t, 0<=3t, 1<=0f, 0<=0t
			{
				if(a[i]!=fmin)//5!=5f, 3!=5t, 0!=3t, 0!=0f
				{
					smin=fmin;//smin=5,3
				}
				fmin=a[i];//fmin=3, 0
			}else if(smin==fmin || smin>a[i])//3==0f || 3>1t
			{
				smin=a[i];//smin=1
			}
		}
		System.out.println("The 1st min no in an array is="+fmin);//0
		System.out.println("The 2nd min no in an array is="+smin);//1
	}
	@Test
	public void find1stAnd2ndMaxNosInArrayWithoutUsingBBsortTechnique()
	{
		int[] a = { 5, 3, 0, 1, 0 };
		int fmax=a[0],smax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=fmax)
			{
				if(a[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=a[i];
			}else if(smax==fmax || smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println("The 1st min no in an array is="+fmax);//5
		System.out.println("The 2nd min no in an array is="+smax);//3
	}
	@Test
	public void pgmToPrintCombinationOfNumbers()
	{
		int[] a= {8,4,3,9,2,7,5,6};//11
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==11)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	@Test
	public void additionOf2Arrays()
	{
		int[] a= {4,2,6,1,7};
		int[] b= {3,1,7,2};
		//        7 3 13 3 7
		int length=a.length;//5
		if(a.length<b.length)//5<4f
		{
			length=b.length;
		}
		for(int i=0;i<length;i++)
			//  i=0 0<5t
			//  i=1 1<5t
			//  i=2 2<5t
			//  i=3 3<5t
			//  i=4 4<5t
		{
			try {
				System.out.print(a[i]+b[i]+" ");
				//                  4 + 3 =7
				//                  2 + 1 =3
				//                  6 + 7 =13
				//                  1 + 2 =3
				//                  7 + arrayIndexOutOfBoundException
			} catch (Exception e) {
				if(a.length<b.length)//5<4f
				{
					System.out.println(b[i]);
				}else {
					System.out.println(a[i]);//7
				}
			}
		}
	}
	@Test
	public void appending0sAtLast()
	{
		int[] a= {5,0,4,0,0,9};//o/p: 5 4 9 0 0 0
		int[] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[m]=a[i];
				m++;
			}else {
				b[n]=a[i];
				n--;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	@Test
	public void removeDuplicatesInAnArrayUsingCollection()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer inte : set) 
		{
			System.out.print(inte);
		}
	}
	@Test
	public void removeDuplicatesInANArrayUsingMap()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object,Object>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		for(Entry<Object, Object> m:map.entrySet())
		{
			System.out.print(m.getKey()+" ");
		}
	}
	@Test
	public void countHowManyTimesTheNosAreRepeatingInAnArrayUsingCollection()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer in : set) 
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					count++;
				}
			}
			System.out.println(in+" is repeating "+count+" times");
		}
	}
	@Test
	public void countHowManyTimesTheNosAreRepeatingInAnArrayUsingMap()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer,Object>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		for(Entry<Integer, Object> m:map.entrySet())
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(m.getKey()==a[i])
				{
					count++;
				}
			}
			System.out.println(m.getKey()+" is repeating "+count+" times");
		}
	}
	@Test
	public void countNoOfDuplicatesInAnArrayUsingCollection()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		//2=2
		//3=2
		//1=2
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer in : set) 
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(in+" is repeating "+count+" times");
			}
		}
	}
	@Test
	public void countNoOfDuplicatesInAnArrayUsingMap()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer,Object>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		for(Entry<Integer, Object> m:map.entrySet())
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(m.getKey()==a[i])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(m.getKey()+" is repeating "+count+" times");
			}
		}
	}
	@Test
	public void positionOfEachNoInAnArrayWithoutDuplicates()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		//2 = 1
		//3 = 2
		//1 = 3
		//4 = 4
		//5 = 7
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for (Integer in : set) 
		{
			for(int i=0;i<a.length;i++)
			{
				if(in==a[i])
				{
					System.out.println(in+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}
	@Test
	public void positionOfEachNoInAnArrayWithoutDuplicatesUsingMap()
	{
		int[] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer,Object>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], i);
		}
		for(Entry<Integer, Object> m:map.entrySet())
		{
			for(int i=0;i<a.length;i++)
			{
				if(m.getKey()==a[i])
				{
					System.out.println(m.getKey()+" is present in "+(i+1)+" position");
					break;
				}
			}
		}
	}
}