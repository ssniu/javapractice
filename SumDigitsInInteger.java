import java.util.Scanner;
  public class SumDigitsInInteger{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 1000: ");
      int theInteger = input.nextInt();
      int firstDigit = theInteger / 100;
      theInteger %= 100;
      int secondDigit = theInteger / 10;
      theInteger %= 10;
      int sum = theInteger + firstDigit + secondDigit;
      System.out.println("The sum of the digits is " + sum);
   }
}

      
