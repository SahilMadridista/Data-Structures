package javapractice;

public class ElectronicShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		int maxMoney = -1;
    
        
        for(int i=0;i<keyboards.length;i++) {
            for(int j = 0;j<drives.length;j++) {
                if(keyboards[i]+drives[j] > maxMoney && keyboards[i]+drives[j] <= b) {
                    maxMoney = keyboards[i]+drives[j];
                }
            }
        }
        
        if(b>=maxMoney) {
            return maxMoney;
        }else {
            return -1;
        }

    }
	
	public static void main(String[] args) {
		// Comment
	}
	
}
