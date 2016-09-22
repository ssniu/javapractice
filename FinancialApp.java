import java.util.Scanner;
 public class FinancialApp {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate:eg 24 15 ");
    int subtotal = input.nextInt();
    int gratuity = input.nextInt();
    
    double amountOfGratuity = subtotal * (gratuity / 100.0);
    double total = subtotal + amountOfGratuity;
    System.out.println("The tratuity is $ " + amountOfGratuity + " and total is $ " + total);
   }
}

