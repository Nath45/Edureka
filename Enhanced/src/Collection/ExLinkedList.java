package Collection;

import java.util.LinkedList;

public class ExLinkedList {

	public static void main(String[] args) 
	{

		LinkedList a=new LinkedList();           	
		a.add("Navnath");
		a.add(200);
		a.add(65.6f);
		a.add('A');
		a.add(500);
		a.add(null);
		a.add(null);

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(700));
		System.out.println(a.get(3));
		
		System.out.println(a);
		
		a.set(0, "Shilpa");
		System.out.println(a);
	}

}
