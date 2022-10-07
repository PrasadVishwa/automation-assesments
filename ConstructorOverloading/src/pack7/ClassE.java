package pack7;    // Example --->2

public class ClassE 
{
    public static void addition(int a,int b)
    {
    	System.out.println(a+b);
    }
    
    public static void addition(int a,int b,int c)
    {
    	System.out.println(a+b+c);
    }
    
    public static void addition(int a,int b,int c,int d)
    {
    	System.out.println(a+b+c+d);
    }
    
    
    public static void main(String[] args) 
    {
		ClassE.addition(5, 6);
		ClassE.addition(5, 6, 7);
		ClassE.addition(5, 6, 7, 8);
		
	}
}
