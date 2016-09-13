// Print message multiple times
public class TestPrint {
  public static void main(String[] args){
    nPrintln("Welcome to java", 5);
  }
  public static void nPrintln(String message, int n){
     for(int i = 0; i < n; i++) 
        System.out.println(message);
  }
}

