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
       
     //-------------------------------------
		
		int i_Max=java.lang.Integer.MAX_VALUE;
		int i_num;
		System.out.println("i_Max 目前數值:"+ i_Max);
		i_num=i_Max+1;
		System.out.println("i_Max 加1後:"+ i_num);
		i_num=i_Max+2;
		System.out.println("i_Max 加2後:"+ i_num);
		long l_num;
		
		l_num=(long)i_Max+1;
		
		System.out.println("i_Max +1 正確的值:"+ l_num);
		
      l_num=(long)i_Max+2;
		
		System.out.println("i_Max +2 正確的值:"+ l_num);
	//-------------------------------------
		int a = 2147483647; 
		int b = 1;
		System.out.println(a+b);   //溢位
	}

}
