package Collection;

import java.util.Vector;

public class ExVector {

			public static void main(String[] args) 
			{
				//ArrayList v=new ArrayList(10);            //Initiv default capacity-->10
				
				 Vector v=new Vector();           //Initiv capacity-->8
				
				v.add("Navnath");
				v.add(200);
				v.add(65.6f);
				v.add('A');
				v.add(700);
				
				System.out.println(v);
				System.out.println(v.size());
				System.out.println(v.isEmpty());
				System.out.println(v.contains(700));
				System.out.println(v.get(3));

	}

}
