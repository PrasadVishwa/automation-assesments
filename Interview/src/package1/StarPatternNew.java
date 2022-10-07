package package1;

public class StarPatternNew 
{
	public static void main(String[] args) 
	{
		//Star Pattern-1
         System.out.println("Star Pattern-1");
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	

          //Answer-------------->
//		*****
//		*****
//		*****
//		*****
//		*****
             //Star Pattern-2
		 System.out.println("Star Pattern-2");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
       //Answer-------------->
//         *
//         **
//         ***
//         ****
//         *****
            //Star Pattern-3
         System.out.println("Star Pattern-3");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=5; j>=i; j--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
       //Answer-------------->
//         *****
//         ****
//         ***
//         **
//         *
         
         //Star Pattern-4
         System.out.println("Star Pattern-4");
        //combination of 2&3
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
         for(int i=1; i<=4; i++)
         {
        	 for(int j=4; j>=i; j--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         
       //Answer-------------->
//         *
//         **
//         ***
//         ****
//         *****
//         ****
//         ***
//         **
//         *
         
         //Star Pattern-5
         System.out.println("Star Pattern-5");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=4; j>=i; j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=1; k<=i; k++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
       //Answer-------------->
//          *
//         **
//        ***
//       ****
//      *****
             //Star Pattern-6
         System.out.println("Star Pattern-6");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=2; j<=i; j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=5; k>=i; k--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
       //Answer-------------->
         //if j=1 in 2nd for loop then space start to  1st line 
         //if j=2 in 2nd for loop then space start to 2nd line
//        *****
//         ****
//          ***
//           **
//            *
              
         //Star Pattern-7
         System.out.println("Star Pattern-7");
         //combination of 5 & 6
         for(int i=1; i<=5; i++)
         {
        	 for(int j=4; j>=i; j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=1; k<=i; k++)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=4; k>=i; k--)
        	 {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
       //Answer-------------->
//          *
//         **
//        ***
//       ****
//      *****
//       ****
//        ***
//         **
//          *
         
         //Star Pattern-8
         System.out.println("Star Pattern-8");
         //pyramid
         
         for(int i=1; i<=5; i++)
         {
        	 for(int j=5; j>=i; j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=1; k<=i; k++)
        	 {
        		 System.out.print(" *");
        	 }
        	 System.out.println();
         }
         //Answer-------------->
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
         
       //Star Pattern-8-A    --->>>>>>> if else loop
         System.out.println("Star Pattern-8(A)");
         //pyramid
         for(int i=1; i<=5; i++)
         {
        	 for(int j=5; j>=1; j--)
        	 {
        		 if(j>i)
        		 {
        			 System.out.print(" ");
        		 }
        		 else
        		 {
        			 System.out.print(" *");
        		 }
        	 }	 
        	 System.out.println();
         }
         
       //Answer-------------->
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
         
         //Star Pattern-9
           System.out.println("Star Pattern-9");
         
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=5; k>=i; k--)
        	 {
        		 System.out.print(" *");
        	 }
             System.out.println();
         }
       //Answer--------------> 
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
         
         //Star Pattern-9(A)
         System.out.println("Star Pattern-9(A)");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=5; j++)
        	 {
        		 if(j<i)
        		 {
        			 System.out.print(" ");
        		 }
        		 else
        		 {
        			 System.out.print(" *");
        		 }
        	 }
        	 System.out.println();
         }
       //Answer-------------->
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
         //Star Pattern-10
         //combination of 8 & 9
         System.out.println("Star Pattern-10");
         
         for(int i=1; i<=5; i++)
         {
        	 for(int j=5; j>=i; j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=1; k<=i; k++)
        	 {
        		 System.out.print(" *");
        	 }
        	 System.out.println();
         }
         for(int i=1; i<=5; i++)
         {
        	 for(int j=0; j<=i; j++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int k=4; k>=i; k--)
        	 {
        		 System.out.print(" *");
        	 }
             System.out.println();
         }
         
       //Answer-------------->
         
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
         
         //Star Pattern -11
         System.out.println("Star Pattern-11");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=1; j<=i; j++)
        	 {
        		if(i>=2 && j<=i-1)
        		{
        			System.out.print(" ");
        		}
        		else
        		{
        			System.out.print("*");
        		}
         
        	 }
             System.out.println();
         }
         
         //Answer-------------->
//        *
//         *
//          *
//           *
//            *
         

         //Star Pattern -12
         System.out.println("Star Pattern-12");
         for(int i=1; i<=5; i++)
         {
        	 for(int j=5; j>=i; j--)
        	 {
        		System.out.print(" ");
        	 }
        	 for(int k=1; k<=i; k++)
        	 {
        		 if(i>=2 && k>1)
        		 {
        			 System.out.print(" ");
        		 }
        		 else
        		 {
        			 System.out.print("*");
        		 }
        	 }
        	 System.out.println();
         }
         
       //Answer-------------->
        
//          *
//         * 
//        *  
//       *   
//      *  
         
         
         
         
         
	}

}







