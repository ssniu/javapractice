public class ProductOfArrayExcept{
    public static void main(String[] args) {
     int[] newArray = {1,2,3,4};
     int[] array2 = productExceptSelf(newArray);
     for( int i = 0; i < array2.length; i++) {
     System.out.print(array2[i] + " ");
     }
    }
    public static int[] productExceptSelf(int[] nums){
      int[] result = new int[nums.length];
     
      int[] t1 = new int[nums.length];
      int[] t2 = new int[nums.length];
    
      t1[0] = 1;
      t2[nums.length-1] = 1;
    
      //scan from left to right
      for(int i = 0; i < nums.length - 1; i++) {
         t1[i+1] = nums[i] * t1[i];
      }
    
      //Scan from right to left
     for(int i = nums.length - 1; i > 0; i--) {
      t2[i-1] = t2[i] * nums[i];
     }
     
     //Multiply
     for(int i = 0; i < nums.length; i++) {
      result[i] = t1[i] * t2[i];
     }
     
     return result;
 }
}
