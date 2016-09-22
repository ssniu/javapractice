import java.util.Scanner;
  public class Test38{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      
    System.out.print("Enter x and y: ");
    int x = input.nextInt();
    int y = input.nextInt();
   
    if(x > 2) 
        if( y > 2) {
          int z;
          z = x + y;
          System.out.println(" z is " + z );
        }
      
    else 
       System.out.println("x is " + x);
  }
}

