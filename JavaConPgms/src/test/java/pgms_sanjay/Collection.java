package pgms_sanjay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Collection {
@Test	
public void arrayList()
{
	ArrayList<Object> list = new ArrayList<>();	
	list.add('a');
	list.add(10);
	list.add(20);
	list.add(10);
	list.add("hi");
	list.add(null);
	list.add(null);
	System.out.println(list);
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(20);
	list1.add(5);
	list1.add(12);
	list1.add(1);
	list1.add(6);
    Collections.sort(list1);//sort elements in ascending order
    System.out.println(list1);
	list.addAll(list1);//add all the elements of list1 to list
	for (Object obj : list)//fetch all the elements 1 by 1 
	{
	System.out.println(obj);	
	}
	if(list.contains("hi"))//checks the element present in the list
	{
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	System.out.println(list.get(1));//fetch the first index
	System.out.println(list.indexOf('a'));//fetch the index of element 'a'
	list.remove(3);//removes the element present in index 3
	System.out.println(list.set(3, "hello"));//replace index 3 with hello
	System.out.println(list.size());//returns the size of arraylist
	Iterator<Object> li = list.iterator();//used to fetch elements
	while(li.hasNext())
	{
		Object data = li.next();
		System.out.println(data);
	}
}
@Test
public void stackClass()
{
	Stack<Object> s = new Stack<>();
	s.push(20);
	s.push(10);
	System.out.println(s.pop());//10
	System.out.println(s.pop());//20
}
@Test
public void linkedList()
{
	LinkedList<Object> list = new LinkedList<>();	
	list.add('a');
	list.add(10);
	list.add(20);
	list.add(10);
	list.add("hi");
	list.add(null);
	list.add(null);
	System.out.println(list);
	for (Object obj : list)//fetch all the elements 1 by 1 
	{
	System.out.println(obj);	
	}
	if(list.contains("hi"))//checks the element present in the list
	{
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	System.out.println(list.get(1));//fetch the first index
	System.out.println(list.indexOf('a'));//fetch the index of element 'a'
	list.remove(3);//removes the element present in index 3
	list.set(3, "hello");//replace index 3 with hello
	System.out.println(list.size());//returns the size of list
	System.out.println(list.getFirst());//fetch the first element
	System.out.println(list.getLast());//fetch the last element
	list.addFirst("hello");//add the element at first
	list.addLast("bye");//add the element at last
	list.remove(2);//removes the element present in index 2
	list.removeFirst();//removes the first element
	list.removeLast();//removes the last element	
}
@Test
public void priorityQueue()
{
	PriorityQueue<Character> q = new PriorityQueue<>();
	q.add('A');
	q.add('B');
	q.add('C');
	q.add('D');
	System.out.println(q.peek());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
}
@Test
public void hashSet()
{
	HashSet<Object> set = new HashSet<>();
	set.add("hi");
	set.add('A');
	set.add(10);
	set.add(40);
	set.add(10);
	set.add(null);
	set.add(null);
	set.add(10);
	set.add(20);
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.contains(40));
	System.out.println(set.isEmpty());
	System.out.println(set.remove('A'));
	ArrayList<Object> list = new ArrayList<>(set);//adding elements of set to list
	list.get(2);
	list.indexOf(null);
	Iterator<Object> it = list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}	
}
@Test
public void linkedHashSet()
{
	LinkedHashSet<Object> set = new LinkedHashSet<>();
	set.add("hi");
	set.add('A');
	set.add(10);
	set.add(40);
	set.add(10);
	set.add(null);
	set.add(null);
	set.add(10);
	set.add(20);
	System.out.println(set);
	System.out.println(set.size());
	System.out.println(set.contains(40));
	System.out.println(set.isEmpty());
	System.out.println(set.remove('A'));
	ArrayList<Object> list = new ArrayList<>(set);//adding elements of set to list
	list.get(2);
	list.indexOf(null);
	Iterator<Object> it = list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
@Test
public void sortedSet()
{
	SortedSet<Character> set=new TreeSet<>();
	set.add('B');
	set.add('Z');
	set.add('A');
	set.add('M');
	System.out.println(set);
}
@Test
public void treeSet()
{
	TreeSet<Object> set = new TreeSet<>();
	set.add(6);
	set.add(4);
	set.add(0);
	set.add(2);
	set.add(1);
	System.out.println(set);//print values the ascending order
	System.out.println(set.descendingSet());//print values in descending order
	if(set.contains(0))
	{
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.isEmpty());
	System.out.println(set.pollFirst());
	System.out.println(set.pollLast());
	System.out.println(set);	
}

@Test
public void usageOfCollectionInSelenium()
{
//	set<String> set=driver.getWindowHandle();
//	for(String tite:set)
//	{
//	   driver.switchTo.window(tite);
//	   String title=driver.getTitle();
//	   if(title.contains("xyz"))
//	   {
//		 break;   
//	   }
//	}	
//	
//	Set<String> set=driver.getWindowHandle();
//	Iterator<String> it = set.iterator();
//	while(it.hasNext())
//	{
//		String set1=it.next();
//		driver.switchTo.window(set1);
//		String title=driver.getTitle();
//		if(title.contains("xyz"))
//		{
//			break;
//		}
//	}	
}
//**************************MAP****************************
@Test
public void hashTable()
{
	Hashtable<Integer,Object> map = new Hashtable<>();
	map.put(10, "hi");
//	map.put(null, 20);//not allowed
//	map.put(20, null);//not allowed
	map.put(30, "hello");
	map.put(50, "hello");//duplicate values are allowed
	map.put(10, 'A');//duplicate keys are not allowed
	System.out.println(map);
	System.out.println(map.get(50));//value of key 50
	System.out.println(map.containsKey(30));
	System.out.println(map.containsValue("hello"));
	System.out.println(map.putIfAbsent(40, "hello"));
	System.out.println(map.remove(30, "hello"));
	System.out.println(map.replace(50, "bye"));
	System.out.println(map.size());
	for(Entry<Integer, Object> data:map.entrySet())//usage of for-each loop in map
	{
		System.out.println(data.getKey()+","+data.getValue());
	}	
}
@Test
public void hashMap()
{
	HashMap<Integer,Object> map = new HashMap<>();
	map.put(10, "hi");
	map.put(null, 20);//allowed
	map.put(null, 100);//multiple null keys not allowed
	map.put(20, null);//allowed
	map.put(60, null);//multiple null values are allowed
	map.put(30, "hello");
	map.put(50, "hello");//duplicate values are allowed
	map.put(10, 'A');//duplicate keys are not allowed
	System.out.println(map);
	System.out.println(map.get(50));//value of key 50
	System.out.println(map.containsKey(30));
	System.out.println(map.containsValue("hello"));
	System.out.println(map.putIfAbsent(40, "hihi"));
	System.out.println(map.remove(30, "hello"));
	System.out.println(map.replace(50, "bye"));
	System.out.println(map.size());
	for(Entry<Integer, Object> data:map.entrySet())//usage of for-each loop in map
	{
		System.out.println(data.getKey()+","+data.getValue());
	}	
}
@Test
public void linkedHashMap()
{
	LinkedHashMap<Integer,Object> map = new LinkedHashMap<>();
	map.put(10, "hi");
	map.put(null, 20);//allowed
	map.put(null, 100);//multiple null keys not allowed
	map.put(20, null);//allowed
	map.put(60, null);//multiple null values are allowed
	map.put(30, "hello");
	map.put(50, "hello");//duplicate values are allowed
	map.put(10, 'A');//duplicate keys are not allowed
	System.out.println(map);
	System.out.println(map.get(50));//value of key 50
	System.out.println(map.containsKey(30));
	System.out.println(map.containsValue("hello"));
	System.out.println(map.putIfAbsent(40, "hihi"));
	System.out.println(map.remove(30, "hello"));
	System.out.println(map.replace(50, "bye"));
	System.out.println(map.size());
	for(Entry<Integer, Object> data:map.entrySet())//usage of for-each loop in map
	{
		System.out.println(data.getKey()+","+data.getValue());
	}	
}
@Test
public void treeMap()
{
	TreeMap<Integer,String> map = new TreeMap<>();
	map.put(107, "nike");
	map.put(104, "puma");
	map.put(102, "addidas");
	map.put(103, "rebook");
	map.put(100, "wildcraft");
	//map.put(null, "hi");//not allowed
	map.put(101, null);
	map.put(107, "hello");
	map.put(108, "nike");
	for(Entry<Integer, String> data:map.entrySet())//usage of for-each loop in map
	{
		System.out.println(data.getKey()+","+data.getValue());
	}	
}
}
