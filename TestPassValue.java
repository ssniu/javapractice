// Add return type as int
public class TestPassValue {
   public static void main(String[] args){
    int num1 = 1;
    int num2 = 2;
    
    System.out.println("Before calling the swap method, num1 is " + num1 +
     " num2 is " + num2);
    
    int u = swap(num1, num2);
   
    System.out.println("After invoking the swap method, num1 is " + "num2 is " + u);
  }
  
  public static int  swap(int n1, int n2){
    
    int temp = n1;
    n1 = n2;
    n2 = temp;
    
    return n1;
   

 }
}
   
