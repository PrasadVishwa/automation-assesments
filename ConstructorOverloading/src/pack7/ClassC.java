package pack7;     // non- static

public class ClassC 
{
    public void method2()
    {
    	System.out.println("nonstastic- method2");
    }
    
    public void method2(int a)
    {
    	System.out.println("nonstatic-method2-with-argument");
    }
    
    public static void main(String[] args) 
    {
	
      ClassC x = new ClassC();
      
      x.method2();
      x.method2(5);
    	
	}
    
    
    
}
