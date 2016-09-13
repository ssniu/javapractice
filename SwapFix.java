
public class SwapFix {
  public static void main(String[] args) {
     int[] list = { 1, 2, 3, 5, 4};
     reverse(list);
     for(int i = 0; i < list.length; i++) {
     System.out.println(list[i]);
   }     
 }
  public static void reverse(int[] list) {
     
     for(int i = 0, j = list.length - 1; i <= j; i++, j--) {
     int temp = list[i];
     list[i] = list[j];
     list[j] = temp;
  }
 
  }
 }

