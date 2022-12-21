package hello;

public class Java03_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int b_Max =java.lang.Byte.MAX_VALUE;
		
		int b_num;
		System.out.println("b_Max 目前數值:"+ b_Max);

		
		b_num = b_Max +1;
		
		System.out.println("b_Max +1後數值:"+ b_num);
		 //溢位
       
	
		int a = 2147483647; 
		int b = 1;
		System.out.println(a+b);   //溢位
	}

}
