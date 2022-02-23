class Kadane{

   public static void main(String[] args) {
      
      int arr[] = new int[]{-5,4,6,-3,7,-1};

      int maxSum = 0;
      int currSum = 0;

      for(int i = 0;i < arr.length; i++){

         currSum = currSum + arr[i];

         if(currSum > maxSum){
            maxSum = currSum;
         }

         if(currSum < 0){
            currSum = 0;
         }

      }

      System.out.println("Sum of maximum sum subarray is : " + maxSum);

   }

}