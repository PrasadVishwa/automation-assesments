package program;          // DAY --> 2.

public class StringProgram2 
{
 public static void main(String[] args) 
 {
//	String a ="RAHUL";
//	
//	String b ="Velocity";
	
	 //1.Equals method- Values
	
//	System.out.println(a.equals(b));               //F
	
	//2. lenght method
	
//	System.out.println(a.length());                   //5
//	System.out.println(b.length());                   //8
	
//    String a = "Rahul";
//	String b = "rahul";
	
	//3. equals--
//	System.out.println(a.equals(b));                //false
	
	//4.equalsIgnoreCase
//	System.out.println(a.equalsIgnoreCase(b));        //true
	
	//5. 
	
//	String a = "Rahul";
//	System.out.println(a.equals("ankit"));                  //false
//	
//	//6.charAt method
//	System.out.println(a.charAt(1));                      //a
//	System.out.println(a.charAt(0));                      //R
	
//	String a = "Rahul";
//	
//	System.out.println(a + "123");
//	
//	//7.concat
//	System.out.println(a.concat("Kumar"));
//	
//	int x =10;
//	System.out.println("value of var x is-"+x);
	
	
	//8.
	//uppercase -->RAHUL
	//lowercase -->rahul
//	 String a = "RaHul";
//	
//	System.out.println(a.toUpperCase());
//	System.out.println(a.toLowerCase());
//	
	//9.
//	String a = "RAHULKUMAR";
//	
//	System.out.println(a.startsWith("RA"));           //true
//	
//	System.out.println(a.endsWith("RA"));                //false
//	
//	//10.sub string creation
//	System.out.println(a.substring(5));
//	
//	System.out.println(a.substring(0));
//	
//	System.out.println(a.substring(0, 5));   //SI-0, EI-req +1
//	
//	System.out.println(a.substring(2, 6));
	
	
	//11.trim-start and end spaces --trim
	
//	String a = "   RA  HUL  ";
//	System.out.println(a);
//	System.out.println(a.trim());
	
	
	//immutable concept
	String a = "Apple";
	System.out.println(a);
	
	String b = a.concat("Kumar");
	System.out.println(b);
	
	//location
	System.out.println(a==b);
	
	
	
}
}
