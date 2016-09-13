import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test{
    public static void main(String[] args){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
           
        Scanner scan = new Scanner(System.in);
        int i2;
        double d2;
        String str;

        /* Read and save an integer, double, and String to your variables.*/

       
       String city1 = scan.nextLine();
       System.out.println( s + city1);
      
        System.out.println("i2");
        i2 = scan.nextInt();
        System.out.println("d2");
        d2 = scan.nextDouble();
        /*System.out.println("s2");
        str  = scan.nextLine();*/
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
       

        /* Print the sum of the double variables on a new line. */
        System.out.println( d + d2);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
      /* String city1 = scan.nextLine();
       System.out.println(s + city1);*/
    }
}
