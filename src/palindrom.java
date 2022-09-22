import java.util.*;
public class palindrom {
	// main method
	public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string to check whether it is palindrome or not");
     // Input string
        String input= a.nextLine();
       // passing boolean 
        if(isPalindrome(input))
        {
        	 //  for true case
            System.out.println(input+" is a palindrome string");
        }
        else
        {
        	 // for false case
            System.out.println(input+" is not a palindrome string");
        }
    }
 
    public static boolean isPalindrome(String str) {
        //variable declaration and initialization
    	int left = 0, right = str.length() - 1;
        
        while(left < right)
        {
        	// Checking if both the strings are equal or
            if(str.charAt(left) != str.charAt(right))
            {
            	// If there is a mismatch
                return false;
            }
         // Increment first pointer and
         // decrement the other
            left++;
            right--;
        }
     // Given string is a palindrom if there is no mismatch
        return true;
    }
}
