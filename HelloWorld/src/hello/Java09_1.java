package hello;

import java.util.Scanner;

public class Java09_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		int i;
		double d;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("請輸入1個整數 >>");
		i = sc.nextInt();

		System.out.print("請輸入文字內容 >>");
		str = sc.nextLine();
		
		System.out.print("請輸入1個實數 >>");
		d = sc.nextDouble();
		
		System.out.println("所輸入的整數是 : " + i);
		System.out.println("所輸入的實數是 : " + d);
		System.out.println("所輸入的字串是 : " + str);
		
		sc.close();
		
		
	}

}
