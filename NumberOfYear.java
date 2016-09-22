import java.util.Scanner;
public class NumberOfYear{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    
     
     System.out.print("Enter the number of minutes:" );
     long numberOfMinutes = input.nextLong();
     int perDay = 24 * 60 * 365;
     int numberOfDays = (int)numberOfMinutes / (24 * 60);
     int numberOfYear = (int)numberOfDays / 365 ;
     
     int numberOfDay  = (int)numberOfDays % 365;
     System.out.println(numberOfMinutes + " minutes is approximately " + numberOfYear + " years" + numberOfDay + " days");
    }
}

