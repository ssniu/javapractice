import java.util.Scanner;
public class IsbnTen {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter the first 9 digits of an ISBN as integer: ");
   
   int nineD = input.nextInt();
   int d1,d2,d3,d4,d5,d6,d7,d8,d9;
   d1 = nineD / 100000000;
   nineD %= 100000000;
   d2 = nineD / 10000000;
   nineD %= 10000000;
   d3 = nineD / 1000000;
   nineD %= 1000000;
   d4 = nineD / 100000;
   nineD %= 100000;
   d5 = nineD / 10000;
   nineD %= 10000;
   d6 = nineD / 1000;
   nineD %= 1000;
   d7 = nineD / 100;
   nineD %= 100;
   d8 = nineD / 10;
   d9 = nineD % 10;
   int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
   if (d10 == 10){
     System.out.println(" The ISBN-10 number is " + d1 + d2 + d3 + d4 +d5 +d6 +d7+d8+d9 +"X");
   }
   else 
   System.out.println("The ISBN-10 number is " + d1 + d2 +d3 +d4 +d5+d6+d7+d8+d9+d10);
 }
}

