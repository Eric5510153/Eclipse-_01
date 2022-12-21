package hello;

import java.util.Scanner;

public class Java09_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		String str;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入文字內容>>");
        str =sc.nextLine();
        c= str.charAt(1);   //輸入字元位置 
        
        System.out.println("第二個字元是:"+c);
        
        sc.close();
		
		
		
		
		
	}

}
