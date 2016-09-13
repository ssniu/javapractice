/* Calculate the gcd of two integers */
import java.util.Scanner;
  
  public class GcdTwo{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();
      int y = input.nextInt();
    
      System.out.println("The result is: " + gcdTwoIntegers(x,y));
   }
   
   private static int gcdTwoIntegers(int n, int m){
     int r = n % m;
     while (r != 0) {
       n = m;
       m = r;
       r = n % m;
     }
    return m;
}
}

