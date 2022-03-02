package BinarySearch;

class BinarySearchIterative{

   public static void main(String[] args) {
      int arr[] = new int[]{-4,-1,3,7,10,12};
      int k = 17;
      int keyPosition = binarySearch(arr,k);
      if(keyPosition == -1){
         System.out.println(k + " is not present in the array");
      }else{
         System.out.println(k + " is present at position " + keyPosition);
      }
      
   }


   static int binarySearch(int a[], int key){

      int low = 0;
      int high = a.length -1;

      while(low<=high){

         int mid = (low+high)/2;
         if(a[mid] == key){
            return mid;
         }else if(a[mid]<key){
            low = mid+1;
         }else{
            high = mid-1;
         }
      }
      return -1;
   }

}
