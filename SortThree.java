import java.util.Scanner;
public class SortThree{
 public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter 3 numbers: ");
   int a = input.nextInt();
   int b = input.nextInt();
   int c = input.nextInt();

   if (a >= b){
    int temp;
    temp = a;
    a = b;
    b = temp;
   }
  
   if(b > c){
    int temp = b;
    b = c;
    c = temp;
   }
  
   if(a > b) {
   int temp = a;
   a = b;
   b = temp;
  }
  System.out.println("The non-descresing order is: " + a + b + c);
 }
}

