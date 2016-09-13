// A simple reusable way -- methods
public class SimpleMethod {
public static int sum(int n1, int n2) {
  int result = 0;
  for(int i = n1; i < n2; i++)
    result += i;
  
  return result;
}

public static void main(String[] args){
  System.out.println("Sum from 1 to 10 is " + sum(1,10));

}
}

