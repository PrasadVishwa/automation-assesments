package collectionProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionProgram1 
{
	public static void main(String[] args) 
	{
//		int a = 50;
//		int b = 60;
//		int c = a + b;
//		System.out.println(c);           //110  
		
		//double float short,char, String
		
		//10,20,30,40,50,60,70,80,90,10
		
		int x[]= {10,20,30,40,50,60,70,80,90,10};
//		int y[]= {10,20,30,40,50,60,70,80,90,10};
		//Collection
		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20);
//		a.add("c");           //char
//		a.add(10.78);                 //boolean
//		a.add("Rahul");            //String
//		System.out.println(a);
		
		//specific data-int
		
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		b.add(10);
//		b.add(20);
////		b.add(10.78);
//		a.add("Rahul");
//		System.out.println(b);
		
//		ArrayList<String> c = new ArrayList<String>();
////		c.add(10);
////		c.add(20);
////		c.add(10.78);
//		c.add("Rahul");
//		System.out.println(c);
		
//		ArrayList<Integer> x = new ArrayList<Integer>();
//		x.add(10);     //0
//		x.add(20);     //1 
//		x.add(30);     //2
//		x.add(40);     //3
//		x.add(50);     //4
		
		//all value print
//	    System.out.println(x);	
		
		//specific value print
//	    System.out.println(x.get(0));
//	    System.out.println(x.get(4));
	    
	    //replace-->30--->35
//	    x.set(2, 35);
//		System.out.println(x);
//		System.out.println(x.get(2));
		
		//remove
//	    x.remove(4);
//	    System.out.println(x);                   //50 is remove
	    
//	    for(int i=0; i<=3;i++)
//	    {
//	    	System.out.println(x.get(i));                 //get value as per index
//	    }
		
	    //size
//	    System.out.println(x.size());                //total value
	    
	    //list
	    List y = new ArrayList();
	    y.add(10);
	    y.add(20);
	    y.add("Rahul");
	    System.out.println(y);
	    
	    //specific String
	    
	    List<String> z = new ArrayList<String>();
	    z.add("Rahul");
	    z.add("Prasad");
	    z.add("Akshay");
	    System.out.println(z);
	    
	    //HashSet
	    HashSet h = new HashSet();
	    h.add(10);
	    h.add("Rahul");
	    System.out.println(h);
	    
	    //specific-- int
	    HashSet<Integer> m = new HashSet<Integer>();
	    m.add(10);
	    m.add(20);
//	    m.add("Prasad");
	    System.out.println(m);
	    
	    //Set
	    
	    Set s = new HashSet();
	    s.add(1000);
	    s.add("Lokesh");
	    System.out.println(s);
		
	    //double
	    
	    Set<Double> q = new HashSet<Double>();
	    q.add(10.78);
//	    q.add(100);
//	    q.add("Lokesh");
	    System.out.println(q);
	    
		//LinkedList
	    
	    LinkedList n = new LinkedList();
	    n.add(10);
	    n.add(20);
	    n.add("c");
	    n.add("Rahul");
	    n.add(10.78);
	    System.out.println(n);
		
		
		
	}

}
