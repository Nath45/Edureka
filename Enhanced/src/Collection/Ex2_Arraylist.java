package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex2_Arraylist {

	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList(10);            //Initial default capacity-->10
		
		ArrayList al=new ArrayList(8);           //Initial capacity-->8
		
		al.add("Navnath");
		al.add(200);
		al.add(65.6f);
		al.add('A');
		al.add(500);
		al.add(null);
		al.add(null);

		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(700));
		System.out.println(al.get(3));
		
		System.out.println(al);
		
		// Add info in between arraylist --> right shift operation
		al.add(4,500);
		System.out.println(al);
		
		// Remove info in between arraylist--> left shift operation
		al.remove(5);
		System.out.println(al);
		
		//Update or modify info
		
		al.set(2, 78.4f);
		System.out.println(al);
		
		System.out.println("-----Print arraylist data using Iterator cursor-----");
		
		Iterator itr=al.iterator();
		while(itr.hasNext())          // true
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print arraylist data using ListIterator cursor-----");
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}

		System.out.println("-----Print arraylist data using for loop-----");
		
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}


		System.out.println("-----Print arraylist data using foreach loop-----");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}


	}

}
