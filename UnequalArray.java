// Unequal arrays
// Manually allocate differing size second dimensions
class UnequalArray {
   public static void main(String[] args){
      int[][] newArray = new int[4][];
      newArray[0] = new int[1];
      newArray[1] = new int[2];
      newArray[2] = new int[3];
      newArray[3] = new int[4];
      
      int i, j, k = 0;
      
      // Assign the values to array
      for( i = 0; i < 4; i++) 
        for(j = 0; j < i + 1; j++){
          newArray[i][j] = k;
          k++;
       }
    
       for(i = 0; i < 4; i++) {
          for(j = 0; j < i + 1; j++) 
             System.out.print(newArray[i][j] + " " );
          System.out.println();
       }
    }
}

    
