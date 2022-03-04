class Intro{
   
   public static void main(String[] args) {
      

      int arr[] = new int[]{ 12, 10, 9, 45, 2, 10, 10, 45 };
      int n = arr.length;
      int res = 1;
 
      for (int i = 1; i < n; i++){
         int j = 0;
         for (j = 0; j < i; j++){
            if (arr[i] == arr[j]){
                break;
            }
         }
         if (i == j)
            res++;
      }
      
      System.out.println(res);

   }
}

