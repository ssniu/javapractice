// Using String to modify the lottery program
import java.util.Scanner;

public class LotteryUsingStrings {
 public static void main(String[] args) {
  //Generate a lottery numbers with 2 digits
 String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
 // Math.random() can generate a random numbe in (0.0 - 1.0), so *10 to be a number in (1 - 10)
 Scanner input = new Scanner(System.in);
 System.out.print("Enter your lottery pick (two digits): ");
 String guess = input.nextLine();

 //Get digits from lottery
 char lotteryDigit1 = lottery.charAt(0);
 char lotteryDigit2 = lottery.charAt(1);
 
 // Get digits from guess
 char guessDigit1 = guess.charAt(0);
 char guessDigit2 = guess.charAt(1);

 System.out.println("The lottery number is " + lottery);
 
 if (guess.equals(lottery))
   System.out.println("Exact match: you win $10,000");

 else if (guessDigit1 == lotteryDigit2 && guessDigit1 == lotteryDigit1)
   System.out.println("Match all digits: you win $3,000");
 else if (guessDigit1 == lotteryDigit1 ||
          guessDigit1 == lotteryDigit2 ||
          guessDigit2 == lotteryDigit1 ||
          guessDigit2 == lotteryDigit2)
  System.out.println("Match one digit: you win $1,000");
  else
   System.out.println("Sorry, no match");
 }
}

