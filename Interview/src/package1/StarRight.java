package package1;

public class StarRight 
{
public static void main(String[] args) 
{    // Q.no-->1
	for(int i=1; i<=4;i++)
	{
		for( int j = 1; j<=i;j++) 
		{
			System.out.print("*");
		}
		System.out.println();	
    }
	
	//Q.no -->2
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 4; j>=i;j--) 
		{
			System.out.print("*");
		}
		System.out.println();	
    }
	
	//Q.no-->3 
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 1; j<=i;j++) 
		{
			System.out.print("*");
		}
		System.out.println();	
    }
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 3; j>=i;j--) 
		{
			System.out.print("*");
		}
		System.out.println();	
    }
	
	//Q.no.-->4
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 3; j>=i;j--) 
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
    }
	
	//Q.no-->5
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 2; j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=4; k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
    }
	
	//Q.no-->6
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 3; j>=i;j--) 
		{
			System.out.print(" ");
		}
		for(int k=1; k<=i;k++)
		{
			System.out.print("*");
		}
		System.out.println();
    }
	
	for(int i=1; i<=4;i++)
	{
		for( int j = 1; j<=i;j++) 
		{
			System.out.print(" ");
		}
		for(int k=3; k>=i;k--)
		{
			System.out.print("*");
		}
		System.out.println();
    }
		
}
}








