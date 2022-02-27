// In thi algorithm, we compare the adjacent elements and in every iteration or everyphase or every circle of loop, the biggest element will take it's actual place that is at the end. In other words, in every iteration of the for loop, one element gets sorted and in the next iteration we go through the loop till j<arr.length-i-1 //


class BubbleSort{

   public static void main(String[] args) {
      
      int arr[] = new int[]{4,3,7,1,5};

      for(int i = 0;i<arr.length;i++){

         for(int j = 0;j<arr.length-i-1;j++){

            if(arr[j+1] < arr[j]){
               int temp = arr[j+1];
               arr[j+1] = arr[j];
               arr[j] = temp;
            }

         }

      }

      System.out.println("Sorted array is: ");

      for(int i = 0;i<arr.length;i++){
         System.out.println(arr[i] + " ");
      }

   }



}