import java.util.HashMap;

class FindSubArrayWithGivenSum{

   public static void main(String[] args) {
      
      int a[] = new int[]{10,15,-5,15,-10,5};
      int sum = 5;
      int currSum = 0;
      int start = 0;
      int end  = -1;

      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i = 0;i<a.length;i++){

         currSum += a[i];

         if(currSum - sum == 0){
            start = 0;
            end = i;
            break;
         }

         if(map.containsKey(currSum - sum)){
            start = map.get(currSum - sum) + 1;
            end = i;
            break;
         }

         map.put(currSum,i);


      }

      if(end == -1){
         System.out.println("Sub array not found with sum " + sum);
      }else{
         System.out.println("Starting index is " + start + " and ending index is " + end);
      }

   }


}