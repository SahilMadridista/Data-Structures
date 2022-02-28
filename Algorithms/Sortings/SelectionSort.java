// Pick the smallest element from the array and put it in the first place.
// Repeat the process

public class SelectionSort {
   public static void main(String[] args) {
      
      int arr[] = new int[]{4,1,9,2,3,6};
      int n = arr.length;
      for(int i = 0;i<n-1;i++){
         int min = i;
         for(int j = i+1;j<n;j++){
            if(arr[j]<arr[min]){
               min = j;
            }
         }
         if(min != i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
         }
      }

      System.out.println("Selection sort- Sorted array is: ");
      for(int i = 0;i<arr.length;i++){
         System.out.print(arr[i] + " ");
      }

   }
}
