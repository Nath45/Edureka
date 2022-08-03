package Collection;

import java.util.ArrayList;

public class Ex1_ArrayList {

	public static void main(String[] args) 
	{
		//ArrayList al=new ArrayList();    // Initial default capacity=10
		
		ArrayList al=new ArrayList(8);         // Initial capacity=8
		
		al.add("Navnath");
		al.add(200);
		al.add(65.6f);
		al.add('A');
		al.add(700);
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

	}

}
