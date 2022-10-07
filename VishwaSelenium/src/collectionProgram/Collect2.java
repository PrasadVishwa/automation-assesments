package collectionProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collect2 
{
	public static void main(String[] args) 
	{
		//Duplicate value
		
//		List<Integer> a = new ArrayList<Integer>();
//		a.add(10);          //0
//		a.add(20);          //1
//		a.add(30);          //2
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(null);
//		a.add(null);
//		System.out.println(a);
//		System.out.println(a.get(1));
		
		Set<Integer> b = new HashSet<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(null);
		b.add(null);
//		System.out.println(b);
		
		//no get method avaiable for set and hence no index concept
		
		//Iterator interface
		
		Iterator x = b.iterator();
//		System.out.println(x.next());
//		System.out.println(x.next());
//		System.out.println(x.next());
//		System.out.println(x.next());
//		System.out.println(x.next());
		
		for(int i=1; i<=4; i++)
		{
//			System.out.println(x.next());
			System.out.println(x.hasNext());
		}
		
		
		
	}

}
