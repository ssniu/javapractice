import java.util.Scanner;
  public class SubtractionQuiz02{
    public static void main(String[] args){
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
    
      // Swap the two numbers if the number 1 < number 2
      if(number1 < number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
       }
      // Prompt "what is the number1 - number2"
      System.out.print("What is " + number1 + "-" + number2 + "?");
      Scanner input = new Scanner(System.in);
      int answer = input.nextInt();
       
      if(number1 - number2 == answer)
           System.out.println("You are correct");
      else {
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }
}
}

