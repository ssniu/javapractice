import java.util.Scanner;
public class ConvertCtoF {
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Please Enter the Celsius, e.g. 56: ");
     int celsius = input.nextInt();
     double fahrenheit = (9/5.0) * celsius + 32;
     System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
     }
}

