package hello;

public class Time1 {
	
	public int hour; //0-23
	public int minute; //0-59
	private int second; //0-59
	
	public Time1() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public Time1(int hour,int minute,  int second) {
		setTime(hour, minute, second);
	}
	
	public void setSecond(int second) {
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 錯誤，數值超過合理範圍");
		}
		
		this.second = second;
	}
	
	public int getSecond() {
		return this.second;
	}

	public void setTime(int hour,int minute,int s1) {
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || s1 < 0 || s1 >= 60) {
			throw new IllegalArgumentException("輸入的 \"小時、分鐘、秒\" 錯誤，數值超過合理範圍");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = s1;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);  //22:15:06
	}
	
	public String toString() {
		return String.format("%d:%2d:%2d %s", ((hour == 0 || hour == 12) ? 12 : (hour % 12)), 
				minute, second ,(hour <12 ? "AM" : "PM") ); //9:6:54 AM
	}
}
