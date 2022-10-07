package pack8;

public class MethodOverloading // compile time polymorphism 
{
    public void method1()
    {
    	System.out.println("Hii");
    }                                            
    
    public void method1(int a)                        // heap memory area
    {
    	System.out.println("Hello");
    }
    
    public void method1(int a,int b)
    {
    	System.out.println("Bye");
    }
    
    public static void main(String[] args) 
    {
    	MethodOverloading x = new MethodOverloading();
    	x.method1();
    	x.method1(5);
    	x.method1(5, 4);
    	
    	
    	
	}
    
    
    
}
