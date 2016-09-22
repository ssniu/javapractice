// Find the smallest one, 
public class RecursiveSelectionSort{
 public static void sort(doubel[] list) {
    sort(list, 0, list.length - 1); // sort the entire list
  }

private static void sort(double[] list, int low, int high){
   if(low < high) {
     // Find the smallest number and its index in list[low .. high]
   int indexOfMin = low;
   double min = list[low];
   for(int i - low + 1; i <= high; i++) {
      if(list[i] < min) {
         min = list[i];
         indexOfMin = i;
       }
    }

   list[indexOfMin] = list[low];
   list[low] = min;
   // Sort the remaining list[low+1 .. high]
   sort(list, low + 1, high);
  }
 }
}
