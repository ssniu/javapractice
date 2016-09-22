public class RecursivePalindromeUsingSubstring{
  public static boolean isPalindrome(String s) {
     if(s.length() <= 1) // Base case: the string has 0 or 1 element
        return true;
     else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case: if the beginning letter is different from the last letter
       return false;
     else
       return isPalindrome(s.substring(1,s.length() - 2));
   }

   public static void main(String[] args){
     System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
     System.out.println("Is noon a palindrome?" + isPalindrome("noon"));
     System.out.println("Is a a palindrome?" + isPalindrome("a"));
     System.out.println("Is abacddcaba a palindrome?" + isPalindrome("aba"));
     System.out.println("Is ab a palindrome?" + isPalindrome("ab"));
    }
  }

