package hello;

public class Time2 {

	private int hour; //0-23
	private int minute; //0-59
	private int second; //0-59
	private int millisecond; //0-999
	
	public Time2() {
		this(0, 0, 0, 0);
	}
	
	public Time2(int hour) {
		this(hour, 0, 0, 0);
//		if(hour < 0 || hour >= 24) {
//			throw new IllegalArgumentException("輸入的 \"小時\" 錯誤，合理範圍必須在 0 ~ 23");
//		}
//		      
//		this.hour = hour;
//		this.minute = 0;
//		this.second = 0;
//		this.millisecond = 0;
	}
	
	public Time2(int hour,int minute) {
		this(hour, minute, 0, 0);
	}
	
	public Time2(int hour,int minute,int second){
	    this(hour, minute, second,0);	
	}
	
	public Time2(int hour,int minute,int second,int millisecond) {
//	    this(hour, minute, second,millisecond);	
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("輸入的 \"小時\" 錯誤，合理範圍必須在 0 ~ 23");
		}
		
		if(minute < 0 || minute >= 60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 錯誤，合理範圍必須在 0 ~ 59");
		}
		
		if(second < 0 || second >= 60) {
			throw new IllegalArgumentException("輸入的 \"秒\" 錯誤，合理範圍必須在 0 ~ 59");
		}

        if(millisecond < 0 || millisecond >= 1000) {
        	throw new IllegalArgumentException("輸入的 \"微秒\" 錯誤，合理範圍必須在 0 ~ 999");
		}
        
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour >= 24) {
			throw new IllegalArgumentException("輸入的 \"小時\" 錯誤，數值超過合理範圍");
		}
		
		this.hour = hour;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setM(int m) {
		if(m < 0 || m >= 60) {
			throw new IllegalArgumentException("輸入的 \"分鐘\" 錯誤，數值超過合理範圍");
		}
		
		this.minute = m;
	}
	
	public int getM() {
		return this.minute;
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
	
	public void setMmillisecond(int millisecond) {
		if(millisecond < 0 || millisecond >=1000) {
			throw new IllegalArgumentException("輸入的 \"微秒\" 錯誤，合理範圍是 0 ~ 999");
		}
		
		this.millisecond = millisecond;
	}
	
	public int getMmillisecond() {
		return this.millisecond;
	}

	public void setTime(int hour,int minute,int second,int millisecond) {
		if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60 || 
				millisecond < 0 || millisecond >= 1000) {
			throw new IllegalArgumentException("輸入的 \"小時、分鐘、秒、微秒\" 錯誤，數值超過合理範圍");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.millisecond = millisecond;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d.%03d", hour, minute, second, millisecond); //22:15:06.015
	}
	
	public String toString() {
		return String.format("%d:%2d:%2d.%03d %s", ((hour == 0 || hour == 12) ? 12 : (hour % 12)), 
				minute, second, millisecond,(hour <12 ? "AM" : "PM") ); //9:6:54.009 AM
	}
}
