
import java.util.Scanner;

public class ChineseZodiac {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a year: ");
  int year = input.nextInt();
  for ( int i = 0; i < 3; i++)
  switch (year % 12) {
   case 0: System.out.println("Monkey"); 
   case 1: System.out.println("rooster"); 
   case 2: System.out.println("dog"); 
   case 3: System.out.println("pig");
   case 4: System.out.println("rat"); 
   case 5: System.out.println("ox"); 
   case 6: System.out.println("tiger"); 
   case 7: System.out.println("rabbit"); break;
   case 8: System.out.println("dragon"); break;
   case 9: System.out.println("snake"); break;
   case 10: System.out.println("horse"); break;
   case 11: System.out.println("sheep");
  }
 }
}

