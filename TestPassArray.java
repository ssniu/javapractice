
public class TestPassArray {
  public static void main(String[] args)
    {
   int[] a = {1 ,2};
   
   //swap the elements using the swap method
  System.out.println("Let us swap the two elements.");
  a[0] = swap(a[0],a[1]);
  System.out.println("array is {" + a[0] + ", " + a[1] + "}");
  
   swapFirstTwoInArray(a);
   System.out.println("array is {" + a[0] + ", " + a[1] + "}");
  }
 
  public static int swap(int n1, int n2) {
  int temp = n1;
    n1 = n2;
   n2 = temp;
   return n1;
}
  
  public static void swapFirstTwoInArray(int[] array) {
   int temp = array[0];
   array[0] = array[1];
   array[1] = temp;
}
}
   
