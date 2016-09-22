//A three-dimensional array
class ThreeDArray{
  public static void main(String[] args){
    int[][][] newArray = new int[3][4][5];
    int i, j, k;
   
    for(i = 0; i < 3; i++) 
      for(j = 0; j < 4; j++)
         for(k = 0; k < 5; k++){
            newArray[i][j][k] = i * j * k;
   }      
     for(i = 0; i < 3; i++){
       for(j = 0; j < 4; j++){
         for(k = 0; k < 5; k++)
            System.out.print(newArray[i][j][k] + " " );
       System.out.println();
    }
   }
   int n = 1;
   int result = n++ * 2;
    System.out.println("n is " + n + " result is " + result);
   
 }
}
