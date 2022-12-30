package hello;



public class Java12_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i,j;
		int arrayInt[][] = {
				{12,1,15,38,43,21,9},
				{2,13,17,21,33,5,18},
				{31,40,13,11,8,27,15},
				{41,48,30,10,20,33,23},
				{13,14,25,22,35,33,7}
		};
		
		System.out.println("5組陣列的內容分別為 :");
		
		for(i=0;i<arrayInt.length;i++) {
			System.out.println("第 "+(i+1)+" 組:");
			for(j=0;j<arrayInt[i].length;j++) {
				System.out.print(arrayInt[i][j]+", ");
			}
			System.out.println("");
		}
		
		System.out.println("陣列 arrayInt 第一維元素個數 = "+arrayInt.length);
    	
    
		
	}

}
