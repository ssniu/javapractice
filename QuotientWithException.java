// Exception
import java.util.Scanner;
 
public class QuotientWithException {
  public static int quotient(int number1, int number2){
   if(number2 == 0)
  // Throw exception
     throw new ArithmeticException("Divisor cannot be zero.");
   return number1/ number2;
 }

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Prompt the user to enter two integers
    System.out.print("Enter two integers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
   // Try block,if arithmetic exception occurs
    try {
      int result = quotient(number1, number2);
      System.out.println(number1 + " / " + number2 + " is " + result);
    }
   // Catch block
    catch (ArithmeticException ex) {
       System.out.println("Exception: an integer" + "can not be divided by zero");
    }
  
    System.out.println("Excution continues ...");
   }
}


     
