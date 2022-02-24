class StockBuySell{

   public static void main(String[] args) {
      
      int arr[] = new int[]{3,1,4,12,7,2,5};

      int minSoFar = arr[0];
      int maxProfit = 0;

      for(int i = 0;i<arr.length;i++){

         minSoFar = Math.min(minSoFar, arr[i]);

         int profit = arr[i] - minSoFar;

         maxProfit = Math.max(profit, maxProfit);

      }

      System.out.println("Maximum profit is : " + maxProfit);

   }


}