public class InsertionSort {

   public static void main(String[] args) {
      int arr[] = new int[]{8,4,1,5,9,2};
      int n = arr.length;

      for(int i = 1;i<n;i++){

         int temp = arr[i];

         int j = i-1;
         while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
         }

         arr[j+1] = temp;

      }
      
      
      System.out.println("Sorted array is: ");

      for(int i = 0;i<arr.length;i++){
         System.out.println(arr[i] + " ");
      }

   }
   
}
