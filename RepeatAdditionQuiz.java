// If the user entered wrong answer, keep asking them to enter the answer until the correct answer appears
import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
   
    Scanner input = new Scanner(System.in);
    
    System.out.print(
     "What is" + number1 + " + " + number2 + "?");
    int answer = input.nextInt();
   
    while(number1 + number2 != answer) {
     System.out.print("Wrong answer. Try again. What is " + number1 + "+" + number2 + "?");
    }
   
    System.out.println("You got it!");
 }
}

