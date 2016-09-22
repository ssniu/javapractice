public class Test1881 {
  public static void main(String[] args) {
    xMethod(1234567);
   }
 
  public static void xMethod(double n){
   if(n != 0) {
     System.out.print(n);
     xMethod(n / 10);
    }
  }
}

