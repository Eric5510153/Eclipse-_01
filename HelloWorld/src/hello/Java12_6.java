package hello;



public class Java12_6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		
	String s1 = new String("I Love Learning Java!!");
	String s2 = s1.substring(7,8);
	String s3 ="我愛學習Java程式設計";
	String s4 =s3.substring(3, 9);
	
	
	System.out.println("s2="+s2);
	System.out.println("s4="+s4);
	System.out.println("s1="+s1);
	System.out.println("s3="+s3);
	
	
	s1=new String("我正在學習");
	s2=new String("APP");
	s3=s1+s2+"程式設計!!";
	s4=s1.concat(s2).concat(",").concat("但是學了很久");
	s4=s4.concat("發現 APP 並不容易...");
	
	
	System.out.println("s3="+s3);
	System.out.println("s4="+s4);
			
	
	
	}

}
