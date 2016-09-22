import java.util.Scanner;

public class  ComputeFibonacci{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter an index for a Fibonacci number: ");
  
  int index = input.nextInt();
  
  // Find and display the Fibonacci number
  System.out.println("The fibonacci number at index " + index + "is" + fib(index));
 
  }
  
  // The method for finding the Fibonacci number
  public static long fib(long index) {
   if(index == 0) // Base case
  
      return 0;
   else if(index == 1) // Base case n == 1
     return 1;
   else 
      return fib(index - 1) + fib(index - 2);
  }
}

