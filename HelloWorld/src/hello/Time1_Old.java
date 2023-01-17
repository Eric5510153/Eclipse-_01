package hello;

public class Time1_Old {

	public  int H;
	public int M;
	public int S;
	
	
	public void SetTime(int h,int m,int s) {
		if(h<0||h>=24||m<0||m>=60||s<0||s>=60) {
			
			throw new IllegalArgumentException("輸入的\"小時,分鐘,秒\"錯誤,數值超過合理範圍");
			
			
		}
		
		this.H=h;
		this.M=m;
		this.S=s;
		
	}
	
    public String toUniversalString() {
    	
    	return String.format("%02d:%02d:%02d",H,M,S);
    	
    }
	public String toString() {
		return String.format("%d:%2d:%2d %s",((H==0||H==12)?12:(H%12)),
				M,S,(H<12?"AM":"PM"));
		
	}
	
	
}
