package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prasad {

	  
	 public static int assemblyLine( int N , int A[] )
	    {
		 
		
	       int[] sort= new int [N];
	      
	      //copy array A into Sort
	       for(int i=0; i<N; i++) {
	        	 sort[i]=A[i];
	        }
	       
	       Arrays.sort(sort);//sort Assending
	      
	  
	   
		for(int i=0;i<A.length;i++) {
			
			int x = A[i];
			int y = sort[i];
			if(x!=y) {
				System.out.print(+i + " ");
				
			}
			
			
			
			
		}
		System.out.println();
		return 0;
			
	    }
	    public static void main(String[] args)  {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.print("size of array");
	        int N = sc.nextInt();
	        System.out.print("enter " + N + " no as hight");
	        int A [] = new int[N];
	        for(int i=0; i<N; i++) {
	            A[i] = sc.nextInt();
	            
	        }
	        System.out.print(assemblyLine(N,A));
	        sc.close();
	        
	        
	    }
}


