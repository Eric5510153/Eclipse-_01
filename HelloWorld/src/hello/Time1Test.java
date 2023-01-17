package hello;

public class Time1Test {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Time1 t1 = new Time1(18,37,42);
		
		System.out.println("建立一個Time1物件，時間是 : " + t1.toUniversalString());
		
		t1.hour = 2555;
		t1.minute = 38;
//		t1.second = 27;
		t1.setSecond(39);
		
		System.out.println("第1次對Time1物件設定時間，目前時間 : " + t1.toUniversalString());
		
		t1.setTime(15, 35, 46);
		System.out.println("第2二次對Time1物件設定時間，目前時間 : " + t1.toString());
		
		try {
			t1.setTime(255, 38, 27);
			System.out.println("第3次對Time1物件設定時間，目前時間 : " + t1.toString());
		} catch (IllegalArgumentException ex) {
			System.out.println("企圖設定時間時錯誤發生，錯誤訊息 : "+ex.getMessage());
			System.out.println("目前時間 : " + t1.toString());
		}

		
	}
	
	
}
