import java.util.Scanner;

public class ComputeTax {
  public static void main(String[] args) {
     // create input method
     Scanner input = new Scanner(System.in);
     
     // Prompt the user to enter filing status
     System.out.print("(0-single filer, 1-married jointly or " +
       "qualifying widow(er), 2-married separately, 3-head of " +
       "household) Enter the filing status: ");
     
     int status = input.nextInt();
     
    //Prompt the user to enter taxable income
    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();
    
    // initialize tax
    double tax = 0;
    
    if(status == 0) {
       if (income <= 8350)
          tax = income * 0.10;
       else if (income <= 33950)
          tax = 8350 * 0.10 + (income - 8350) * 0.15;
       else if (income <= 82250)
          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
       else 
          tax = 8350 * 0.10 + (33050 - 8350) * 0.15 + 82250 * 0.25 + (income - 33950) * 0.25;}
    else {
      System.out.println("Error: invalid status");
      System.exit(1);
  }
  //display results
  System.out.println("Tax is " + (int)(tax * 100) / 100.0);
}
}
