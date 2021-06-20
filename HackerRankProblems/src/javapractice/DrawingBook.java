package javapractice;

public class DrawingBook {
	
	public static int pageCount(int n, int p) {
		
		if(p==2||p==3) {
			return 1;
		}
		else if(p<=n/2) {
			double a = ((double)(p-1)/2);
			return (int)a;
		}else if(p==n-1 || p==n-2){
			if(n%2==0) {
				return 1;
			}else {
				return 0;
			}
        }
		else {
			return (int)Math.floor((double)(n-p)/2);
		}
		
		
	}
	
	public static void main(String[] args) {

		
		System.out.println(4/3);
		System.out.println((int)Math.ceil((double)(5-4)/2));
		System.out.println(pageCount(18183,18042));

	}

}
