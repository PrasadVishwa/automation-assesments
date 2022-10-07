package stringProgram;
//count the total number of characters in a string

//public class CountTotalCharInString 
//{   
//	    public static void main(String[] args)
//	    {    
//	        String string = "The best of both worlds";    
//	        int count = 0;    
//	            
//	        //Counts each character except space    
//	        for(int i = 0; i < string.length(); i++) 
//	        {    
//	            if(string.charAt(i) != ' ')    
//	                count++;    
//	        }    
//	            
//	        //Displays the total number of characters present in the given string    
//	        System.out.println("Total number of characters in a string: " + count);    
//	    }    
//	}     
//
////ANS------->>>>Total number of characters in a string: 19

//  PROGRAM ---> 2

//to Count the Total Number of Punctuation Characters Exists in a String

//public class CountTotalCharInString 
//{
//	public static void main(String args[]) 
//	{
////Stores the count of punctuation marks    
//		int count = 0;
//		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
//		for (int i = 0; i < str.length(); i++) 
//		{
////Checks whether given character is punctuation mark    
//			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
//					|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
//					|| str.charAt(i) == ':')
//			{
//				count++;
//			}
//		}
//		System.out.println("The number of punctuations exists in the string is: " + count);
//	}
//}
//
////ANS---->The number of punctuations exists in the string is: 5

////PROGRAM ------>3
////to count the total number of vowels and consonants in a string
//
//public class CountTotalCharInString  
//{    
//    public static void main(String[] args) 
//    {    
//            
//        //Counter variable to store the count of vowels and consonant    
//        int vCount = 0, cCount = 0;    
//            
//        //Declare a string    
//        String str = "This is a really simple sentence";    
//            
//        //Converting entire string to lower case to reduce the comparisons    
//        str = str.toLowerCase();    
//            
//        for(int i = 0; i < str.length(); i++) 
//        {    
//            //Checks whether a character is a vowel    
//            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
//                //Increments the vowel counter    
//                vCount++;    
//            }    
//            //Checks whether a character is a consonant    
//            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
//                //Increments the consonant counter    
//                cCount++;    
//            }    
//        }    
//        System.out.println("Number of vowels: " + vCount);    
//        System.out.println("Number of consonants: " + cCount);    
//    }    
//}   
//
////ANS----->Number of vowels: 10
//         //Number of consonants: 17

//PROGRAM 4
//to determine whether two strings are the anagram

import java.util.Arrays;

public class CountTotalCharInString 
{
	public static void main(String[] args) 
	{
		String str1 = "Brag";
		String str2 = "Grab";

		// Converting both the string to lower case.
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Checking for the length of strings
		if (str1.length() != str2.length()) 
		{
			System.out.println("Both the strings are not anagram");
		} 
		else 
		{
			// Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();

			// Sorting the arrays using in-built function sort ()
			Arrays.sort(string1);
			Arrays.sort(string2);

			// Comparing both the arrays using in-built function equals ()
			if (Arrays.equals(string1, string2) == true) 
			{
				System.out.println("Both the strings are anagram");
			} 
			else 
			{
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}
//ANS---->Both the strings are anagram
