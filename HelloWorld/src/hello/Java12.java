package hello;



public class Java12 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;
//		int arrayInt[] = new int[10];
		
		int arrayInt[];
		arrayInt = new int[10];
		
		arrayInt[0] = 5;
		arrayInt[1] = 2;
		arrayInt[2] = 45;
		arrayInt[3] = 138;
		arrayInt[4] = 23;
		arrayInt[5] = 18;
		arrayInt[6] = 90;
		
		for(i = 0; i <arrayInt.length;i++) {
			System.out.println("arrayInt["+i+"] = "+arrayInt[i]);
		}
		
		System.out.println("陣列 arrayInt 的元素個數 = "+arrayInt.length);

		
		int arrayInt_1[] = {12,15,25,5,38,26,8,9,61};
		for(i=0;i<arrayInt_1.length;i++) {
			System.out.println("arrayInt_1["+i+"] = "+arrayInt_1[i]);
		}
		System.out.println("陣列 arrayInt_1 的元素個數 = "+arrayInt_1.length);
		
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
