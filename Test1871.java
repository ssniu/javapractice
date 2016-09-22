public class Test1871 {
  public static void main(String[] args) {
   // xMethod(5);
    xMethods(5);
  }

/** public static void xMethod(int n) {
   if(n > 0) {
      System.out.print(n + " " );
      xMethod(n - 1);
    }
  }
 */
 public static void xMethods(int n){
   if(n > 0) {
   xMethods(n - 1);
   System.out.print(n + " " );
  }
}

}

