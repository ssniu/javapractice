// The hexadecimal number system has 16 digits : 0-9, A-F; enter a hex digit and display its corresponding devimal// value

import java.util.Scanner;

public class HexDigit2Dec{
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a hex digit: ");
   String hexString = input.nextLine();

  // Check if the hex string has only one character, cause this program will convert only one hexedecimal to 
// decimal number

  if(hexString.length() != 1) {
    System.out.println("You must enter exactly one character");
    System.exit(1);
  }
   
   //Display decimal value for the hex digit;
  char ch = hexString.charAt(0);
  if (ch <= 'F' && ch >= 'A') {
    int value = ch - 'A' + 10;// if ch is between A to F, use the substraction to get the results
    System.out.println("The decimal value for hex digit " + ch + " is" + value);
  }

  else if (Character.isDigit(ch)) {
   System.out.println("The decimal value for hex digit " + ch + "is" + ch);

  }
  else {
   System.out.println(ch + " is an invalid input");
  }
}
}

