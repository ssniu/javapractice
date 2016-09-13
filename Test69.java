// 6.9 testing method errors
public class Test69{
    public static void main(String[] args){
      System.out.print("The result is " + method1(2,3));
   }
  
    public static int method1(int n, int m){
    n += m;
   return  method2(4);
  }
  
   public static int method2(int n) {
     if(n > 0) return 1;
     else if(n == 0) return 0;
     else return -1;
   }
}

