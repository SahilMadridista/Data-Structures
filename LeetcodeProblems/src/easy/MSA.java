package easy;

public class MSA {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1,5,8,11,15};
		int[] arr2 = new int[] {2,4,7,9,10};
		
		MSA m = new MSA();
		m.merge(arr1,arr2);
	}

	private void merge(int[] arr1, int[] arr2) {
		
		int a = arr1.length;
		int b = arr2.length,len;
		
		len = a+b;
		
		int[] new_arr = new int[len];
		
		int i=0;
		int j=0;
		int index=0;
		
		while(i<a && j<b) {
			
			if(arr1[i]>arr2[j]) {
				new_arr[index++] = arr2[j++];
			}else {
				new_arr[index++] = arr1[i++];
			}
			
		}
		
		if(j==b) {
			for(int m=i;m<a;m++) {
				new_arr[index++] = arr1[m];
			}
		}else {
			for(int m=j;m<b;m++) {
				new_arr[index++] = arr2[m];
			}
		}
		
		for(int c=0;c<new_arr.length;c++) {
			System.out.println(new_arr[c]);
		}
		
	}
	
	
}
