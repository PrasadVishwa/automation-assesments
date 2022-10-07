package package1;

import java.util.Scanner;

public class ScannerClass 
{
     public static void main(String[] args) 
     {
		Scanner x = new Scanner(System.in);
		
		System.out.println("enter first number");
		
		int a = x.nextInt();
		
		System.out.println("enter second number");
		int b =x.nextInt();
		
		System.out.println(a + b);
		
		
		
		
	}
}
