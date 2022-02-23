import java.util.HashMap;

class BoyreMooreMajorityElement{

   public static void main(String[] args) {
      
      int a[] = new int[]{5,1,4,1,1};

      int ansIndex = 0;
      int count = 1;
      int c = 0;

      for(int i = 1;i<a.length;i++){
         if(a[i] == a[ansIndex]){
            count++;
         }else{
            count--;
         }

         if(count == 0){
            ansIndex = i;
            count = 1;
         }
      }

      for(int i = 0;i<a.length;i++){
         if(a[i] == a[ansIndex]){
            c += 1;
         }
      }

      if(c>2){
         System.out.println("Majority element is "+ a[ansIndex]);
      }else{
         System.out.println("No majority element.");
      }

   }
}