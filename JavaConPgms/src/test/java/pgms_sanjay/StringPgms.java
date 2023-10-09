package pgms_sanjay;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;

public class StringPgms {

	@Test
	public void stringFunctions()
	{
//		String s="kannada";	
//		System.out.println(s.length());

//		String s="kannada";	
//		char[] str = s.toCharArray();
//		System.out.println(str.length);
			
//		String s="kannada";
//		System.out.println(s.charAt(1));
			
//		String s="kannada";	
//		System.out.println(s.indexOf('a'));
		
//		String s="hi";
//		String s1="hello";
//		String s2="bye"; //hihelloBye
//		System.out.println(s.concat(s1).concat(s2));
			
//		String s="hi";
//		String s1="hello";
//		String s2="bye";
//		String joined = String.join(" ",s,s1,s2);
//		System.out.println(joined);
			
//		String s="hi hello welcome";
//		System.out.println(s.contains("welcome"));
			
//		String s="hi hello welcome";	
//		System.out.println(s.startsWith("hi"));
		
//		String s="hi hello welcome";
//		System.out.println(s.endsWith("welcome"));
			
//		String s="hi";
//		String s1="";
//		System.out.println(s1.isEmpty());
			
//		String s="hi";
//		String s1="";
//		System.out.println(s1.isBlank());
		
//		String s="kannada";
//		System.out.println(s.replace('a', 'A'));
			
//		String s=" hi hello welcome ";
//		System.out.println(s.trim());
			
//		String s="kannada";	
//		System.out.println(s.substring(0, 3));
			
//		String s="hi hello welcome";
//		System.out.println(s.replace(" ", ""));
			
//		String s="hi";
//		String s1="hi";
//		System.out.println(s.equals(s1));	
	}

	@Test
	public static void vowel_or_consonant(char y) {
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u' || y == 'A' || y == 'E' || y == 'I' || y == 'O'
				|| y == 'U')
			System.out.println("it is a vowel");
		else
			System.out.println("it is a consonant");
	}

	public static void main(String[] args) {
		vowel_or_consonant('w');
	}
	
	@Test
	public void reverseAString()
	{
		//1
//		String s="Bangalore";//erolagnaB
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}
		
		//2
//		String s="Bangalore";//erolagnaB
//		char[] str = s.toCharArray();
//		for(int i=str.length-1;i>=0;i--)
//		{
//			System.out.print(str[i]);
//		}
		
		//3
//		String s="Bangalore";//erolagnaB
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		//4
//		String s="Bangalore";//erolagnaB
//		char[] str = s.toCharArray();
//		int count=0;
//		for (char c : str) 
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.print(str[i]);
//		}
		
		//5
		StringBuffer s = new StringBuffer("Bangalore");
		System.out.println(s.reverse());
	}
	@Test
	public void carBusTrain()
	{
		String s="carbuscartraincarcar";
		int count=0;
		for(int i=0;i<s.length()-2;i++)
		{
			if(s.substring(i, i+3).equalsIgnoreCase("bus"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void countNoOfUpperAndLowerCaseChars()
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int lowercase=0;
		int uppercase=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
			}
		}
		System.out.println("no of lowercase character="+lowercase);
		System.out.println("no of uppercase character="+uppercase);	
	}
	@Test
	public void stringPalyndrome()
	{
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("its a palyndrome");
		}else {
			System.out.println("not a palyndrome");
		}
	}
	@Test
	public void findLengthOfTheStringWoutUsingLength()
	{
		String s="tester";
		int i=0;
		while(true)
		{
			try {
				s.charAt(i);//t e s t
				i++;//1 2 3 4
			} catch (Exception e) {
				System.out.println(i);//4
				break;
			}
		}
	}
	@Test
	public void occuranceOfEachCharacterInAStringUsingCollection()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count+" times");
		}
	}
	@Test
	public void occuranceOfEachCharacterInAStringUsingMap()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character,Object>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m:map.entrySet()) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(m.getKey()+" is repeating "+count+" times");
		}
	}
	@Test
	public void countNoOfDuplicateCharactersInAStringUsingCollection()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(ch+" is repeating "+count+" times");
			}
		}	
	}
	@Test
	public void countNoOfDuplicateCharactersInAStringUsingMap()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character,Object>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m:map.entrySet()) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
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
	public void positionOfEachCharInAStringWoutDuplicates()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
		}	
	}
	@Test
	public void positionOfEachCharInAStringWoutDuplicatesUsingMap()
	{
		String st="TestYantra";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character,Object>();
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m:map.entrySet()) 
		{
			for(int i=0;i<s.length();i++)
			{
				if(m.getKey()==s.charAt(i))
				{
					System.out.println(m.getKey()+" is in "+(i+1)+" position");
					break;
				}
			}
		}
	}
	@Test
	public void printPositionOfEachCharInReverse()
	{
		String st="Tester";//r=6 e=5 t=4 s=3
		String s = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch : set) 
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
		}	
	}
	@Test
	public void reverseAGivenString()
	{
		String st="I am from TestYantra";//TestYantra from am I
	    String[] s = st.split(" ");
	    for(int i=s.length-1;i>=0;i--)
	    {
	    	System.out.print(s[i]+" ");
	    }
	}
	@Test
	public void reverseTheWordsInAString()
	{
		String st="I am from TestYantra";//I ma morf artnaYtesT
		String[] s=st.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	@Test
	public void swap1stAndLastWordsInAString()
	{
		String st="I am from TestYantra";//TestYantra am from I
		String[] s=st.split(" ");
		//s[0]=I s[1]=am s[2]=from s[3]=TestYantra
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	@Test
	public void printWordsInReversedFormat()
	{
		String s="i am selenium";//m ui nelesmai
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				rev=rev.substring(0,i)+" "+rev.substring(i, rev.length());
			}
		}
		System.out.println(rev);
	}
	@Test
	public void findOccuranceOfEachWordsInAString()
	{
		String str="I am from am i  TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for (String ch : set) 
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(ch.equals(st[i]))
				{
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count+" times");
		}	
	}
	@Test
	public void findOccuranceOfEachWordsInAStringUsingMap()
	{
		String str="I am from am i TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		for(int i=0;i<st.length;i++)
		{
			map.put(st[i], i);
		}
		for (Entry<String, Object> m:map.entrySet()) 
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(m.getKey().equals(st[i]))
				{
					count++;
				}
			}
			System.out.println(m.getKey()+" is repeating "+count+" times");
		}
	}
	@Test
	public void countNoOfDuplicateWordsInAString()
	{
		String str="I am from am i TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for (String ch : set) 
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(ch.equals(st[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(ch+" is repeating "+count+" times");
			}
		}	
	}
	@Test
	public void countNoOfDuplicateWordsInAStringUsingMap()
	{
		String str="I am from am i TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		for(int i=0;i<st.length;i++)
		{
			map.put(st[i], i);
		}
		for (Entry<String, Object> m:map.entrySet()) 
		{
			int count=0;
			for(int i=0;i<st.length;i++)
			{
				if(m.getKey().equals(st[i]))
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
	public void printPositionOfEachWordInAString()
	{
		String str="I am from am i TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++)
		{
			set.add(st[i]);
		}
		for (String ch : set) 
		{
			for(int i=0;i<st.length;i++)
			{
				if(ch.equals(st[i]))
				{
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
		}	
	}
	@Test
	public void printPositionOfEachWordInAStringUsingMap()
	{
		String str="I am from am i TestYantra";
		String s = str.toLowerCase();
		String[] st = s.split("\\s+");
		LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		for(int i=0;i<st.length;i++)
		{
			map.put(st[i], i);
		}
		for (Entry<String, Object> m:map.entrySet()) 
		{
			for(int i=0;i<st.length;i++)
			{
				if(m.getKey().equals(st[i]))
				{
					System.out.println(m.getKey()+" is in "+(i+1)+" position");
					break;
				}
			}
		}	
	}
	@Test
	public void printCountOfCharacters()
	{
		//String s="wwwpreethi";//w3p1r1e2t1h1i1
		String s="aAbbacCd";
		LinkedHashSet<Character> list = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			list.add(s.charAt(i));
		}
		for (Character ch : list) 
		{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			//	System.out.print(ch);
			}
		}
		System.out.print(ch+""+count);
		}
	}
	@Test
	public void countNoOfVowelsInAStringWithDuplicates()
	{
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		char[] s = st.toCharArray();
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
			{
				count++;
				System.out.print(s[i]);
			}
		}
		System.out.println(count);
	}
	@Test
	public void countNoOfVowelsInAStringWithoutDuplicates()
	{
		String st="India";
		String str = st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));			
		}
		int count=0;
		for (Character ch : set) 
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
				System.out.print(ch);
			}
		}
		System.out.println(count);
	}
	@Test
	public void segregateAlphabetsNumbersAndSpcCharactersFromAGivenString()
	{
		String s="a1b2%c@3";//abc 123 %@
		String alpha="";
		String num=" ";
		String spc=" ";
		for(int i=0;i<s.length();i++)
		{
			char st = s.charAt(i);
			if(st>='a' && st<='z' || st>='A' && st<='Z')
			{
				alpha=alpha+st;
			}else if(st>='0' && st<='9')
			{
				num=num+st;
			}else {
				spc=spc+st;
			}
		}
		System.out.print(alpha+num+spc);
	}
	@Test
	public void sumOfDigitsInAString()
	{
		String s="1he2m4";//7
		int sum=0;//0 1 3 7
		for(int i=0;i<s.length();i++)
			//  i=0 0<6t
			//  i=1 1<6t
			//  i=2 2<6t
			//  i=3 3<6t
			//  i=4 4<6t
			//  i=5 5<6t
			//  i=6 6<6f terminate
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				//
			{
				int n=s.charAt(i)-48;//n= 49-48=1, 50-48=2,52-48=4
				sum=sum+n;//sum=0+1=1, 1+2=3, 3+4=7
			}
		}
		System.out.println(sum);//7
	}
	@Test
	public void sumOf2DigitsInAString()
	{
		String s="12a11b3";//12+11+3=26
		int sum=0;// 0 12 23
		int tsum=0;//0 1 12 0 1 11 0 3
		for(int i=0;i<s.length();i++)
			//  i=0 0<7t
			//  i=1 1<7t
			//  i=2 2<7t
			//  i=3 3<7t
			//  i=4 4<7t
			//  i=5 5<7t
			//  i=6 6<7t
			//  i=7 7<7f terminate
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')//1t 2t af 1t 1t bf 3t
			{
				int n=s.charAt(i)-48;//n=49-48=1,50-48=2,49-48=1,49-48=1,51-48=3
				tsum=tsum*10+n;//tsum=0*10+1=1,1*10+2=12,0*10+1=1,1*10+1=11,0*10+3=3
			}else {
				sum=sum+tsum;//sum=0+12=12,12+11=23
				tsum=0;//0 0
			}
		}
		sum=sum+tsum;//23+3=26
		System.out.println(sum);//26
	}
	@Test
	public void printMinLengthValuesInAStringArray()
	{
		String[] s= {"12","1234","12345","45","1434234"};//12 45
		String min_length=s[0];//12 45
		for(int i=0;i<s.length;i++)
			//  i=0 0<5t
			//  i=1 1<5t
			//  i=2 2<5t
			//  i=3 3<5t
			//  i=4 4<5t
			//  i=5 5<5f terminate
		{
			if(s[i].length()<min_length.length())//2<2f,4<2f,5<2f,2<2f,7<2f
			{
				min_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
			//  i=0 0<5t
			//  i=1 1<5t
			//  i=2 2<5t
			//  i=3 3<5t
			//  i=4 4<5t
			//  i=5 5<5f terminate
		{
			if(s[i].length()==min_length.length())//2==2t,4==2f,5==2f,2==2t,7==2f
			{
				System.out.print(s[i]+" ");//12 45
			}
		}
	}
	@Test
	public void printMaxLengthValuesInAStringArray()
	{
		String[] s= {"12","1234","12345","45","1434234"};//12 45
		String max_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max_length.length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
	@Test
	public void printMinimumLengthValuesInAStringArray()
	{
		String[] s= {"ab","qbcd","myfvb","bv","jhvjhvjv"};//12 45
		String min_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()<min_length.length())
			{
				min_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min_length.length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
	@Test
	public void printMaximumLengthValuesInAStringArray()
	{
		String[] s= {"ab","qbcd","myfvb","bv","jhvjhvjv"};//12 45
		String max_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==max_length.length())
			{
				System.out.print(s[i]+" ");
			}
		}
	}
	@Test
	public void balancedOrUnbalanced()
	{
		String s= "[{()}]";	
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(list.size()!=0 && ((s.charAt(i)=='}' && list.get(list.size()-1)=='{') 
			|| (s.charAt(i)==']' && list.get(list.size()-1)=='[')
			|| (s.charAt(i)==')' && list.get(list.size()-1)=='(')))
			{
				list.remove(list.size()-1);
			}
			else 
			{
				list.add(s.charAt(i));
			}
		}
		if(list.size()==0)
		{
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
	}
}