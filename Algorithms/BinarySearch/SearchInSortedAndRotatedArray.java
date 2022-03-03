public class SearchInSortedAndRotatedArray{

   public static void main(String[] args) {
      int arr[] = new int[]{40,50,60,70,10,20,30};
      int k = 30;
      int n = arr.length;
      int keyPosition = binarySearch(arr,k);
      if(keyPosition == -1){
         System.out.println(k + " is not present in the array");
      }else{
         System.out.println(k + " is present at position " + keyPosition);
      }
      
   }

   static int binarySearch(int a[], int key){

      int low = 0;
      int high = a.length-1;

      while(low<=high){

         int mid = (low+high)/2;

         if(a[mid] == key){
            return mid;
         }
         
         if(a[low] < a[mid]){

            if(key>=a[low] && key<a[mid]){
               high = mid - 1;
            }else{
               low = mid + 1;
            }

         }else{
            
            if(key>a[mid] && key<=a[high]){
               low = mid + 1;
            }else{
               high = mid - 1;
            }
         }


      }


      return -1;
   }
   
}
