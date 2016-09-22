// Create a two dimension array and output all elements in this array
public class TwoDimenArray {
    public static void main(String[] args) {
      int[][] newArray = new int[4][5];
      int k = 0;
      // Assign values to this array
      for(int i = 0; i < 4; i++)
        for(int j = 0; j < 5; j++){
           newArray[i][j] = k;
           k++;
        }
     
      // Output all elements inside the array
     for(int i = 0; i < 4; i++){
       for(int j = 0; j < 5; j++) 
          System.out.print(newArray[i][j] + " " );
       System.out.println();
      }
     }
  }
 
