import java.util.*;   
class Palindrome 
{  
   public static void main(String args[])  
   {  
      String str, reverse = ""; 
	  int i, length;	  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      str = in.nextLine();   
      length = str.length();   
      for (i = length - 1; i >= 0; i-- )  
         reverse = reverse + str.charAt(i);  
      if (str.equals(reverse))  
         System.out.println("True");  
      else  
         System.out.println("False");   
   }  
}  