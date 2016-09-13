
// Guess number games by while loop
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args){
   int number = (int)(Math.random() * 101);
  
  Scanner input = new Scanner(System.in);
  
 //Prompt the user to guess a number
  System.out.print("Please guess a number between 0 and 100: ");
  
  int guess = -1;
  while(guess != number) {
    // Prompt the user to guess the number
    System.out.print("\nEnter your guess: ");
   guess = input.nextInt();
  
  if(guess == number)
    System.out.println("Yes, the number is " + number);
  else if (guess > number)
    System.out.println("Your guess is too high.");
  else 
    System.out.println("Your guess is too low. ");
  }
}
}

