package pack1;

public class Constructor {
	
	Constructor()
	{
		this(1);
		System.out.println(0);
		
	}
	 
	Constructor(int a)
	{
		this(2,2);
		System.out.println(5);
	}
	
	Constructor(int c,int b)
	{
		this("Boy");
		System.out.println(16);
	}
	
	Constructor(String def)
	{
		
		System.out.println("Prasad");
	}
	
	
	public static void main(String[] args)  
	{
		Constructor x = new Constructor();
		

	}

}
