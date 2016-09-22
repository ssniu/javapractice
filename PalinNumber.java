import java.util.Scanner;
public class PalinNumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a three-digits number: ");
    int n = input.nextInt();
    int a, b, c, temp;
    a = n / 100;
    temp = n % 100;
    b = temp / 10;
    c = temp % 10;
   
    if(a == c) 
      System.out.println(n + " is a palindrome");
    else
     System.out.println(n + " is not a palindrome");
   }
}

