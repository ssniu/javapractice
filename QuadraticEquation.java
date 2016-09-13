
import java.util.Scanner;

public class QuadraticEquation {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // Prompt the user to enter the values of a,b,c
  System.out.print("Enter a, b, c: ");
  double a = input.nextDouble();
  double b = input.nextDouble();
  double c = input.nextDouble();
  
  
  double  x = b * b - 4 * a * c;
  double  y = (-b + x)/ (2 * a);
  double  z = (-b - x)/ (2 * a);
  
  if (x <  0)
    System.out.println(" The equation has no real roots");
  else if (x == 0)
    System.out.println(" The equation has one root" + y);
  else
    System.out.println("The equation has two roots" + y + "and" + z);
  }
}

 
