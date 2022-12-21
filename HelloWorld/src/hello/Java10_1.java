package hello;

import java.util.Scanner;

public class Java10_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	int i;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("請輸入0~100之間的值>>");
	i=sc.nextInt();
	if((i<0)||(i>100)) {
		
		System.out.println("數值錯誤");
		
	}else {
		
		if((i>0)&&(i<10)) {
		System.out.println("i="+i+",於0~9之間");
			
	}else if((i>10)&&(i<20)) {
		System.out.println("i="+i+",於10~19之間");
    }else if((i>20)&&(i<30)) {
		System.out.println("i="+i+",於20~29之間");
		
    }else if((i>30)&&(i<40)) {
		System.out.println("i="+i+",於30~39之間");
		
    }else if((i>40)&&(i<50)) {
		System.out.println("i="+i+",於40~49之間");
	
    }else if((i>50)&&(i<60)) {
		System.out.println("i="+i+",於50~59之間");
	
    }else if((i>60)&&(i<70)) {
		System.out.println("i="+i+",於60~69之間");
	
    }else if((i>70)&&(i<80)) {
		System.out.println("i="+i+",於70~79之間");
	
    }else if((i>80)&&(i<90)) {
		System.out.println("i="+i+",於80~89之間");
	
    }else {
		System.out.println("i="+i+",於90~100之間");
	
	}
	}
	
	sc.close();
	
		
	
	}

}
