package Lab07;

/*
 * Write a program of checking the Palindrome by recursion.
 */
public class Lab07 {
	static boolean recursionPallindrome(String string) 
    { 
        if(string.length() == 0 || string.length() == 1)
            return true; 
        System.out.println(string.charAt(string.length()));
        System.out.println(string.charAt(0));
        
        if(string.charAt(0) == string.charAt(string.length()-1))
            return recursionPallindrome(string.substring(1, string.length()-1));
        return false;
    }   

    public static void main(String args[]) 
    { 	
    	String str = "naan";
        //String str = "sjmazamjs"   ;
        if (recursionPallindrome(str)) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    } 

}
