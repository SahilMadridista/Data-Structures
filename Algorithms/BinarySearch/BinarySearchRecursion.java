public class BinarySearchRecursion {
   
   public static void main(String[] args) {
      int arr[] = new int[]{-4,-1,3,7,10,12};
      int k = 3;
      int n = arr.length;
      int keyPosition = binarySearch(arr,k,0,n-1);
      if(keyPosition == -1){
         System.out.println(k + " is not present in the array");
      }else{
         System.out.println(k + " is present at position " + keyPosition);
      }
      
   }

   static int binarySearch(int a[],int key,int low, int high){

      if(low>high){
         return -1;
      }
      int mid = (low+high)/2;

      if(a[mid]==key){
         return mid;
      }

      if(a[mid]>key){
         return binarySearch(a,key,low,mid-1);
      }else{
         return binarySearch(a, key, mid+1, high);
      }

   }
}
