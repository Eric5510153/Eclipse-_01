package hello;

public class Date {
	
	private int year;
	private int month;
	private int day;
	
	private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int month) {
		this(month,1,1900);	
	}
	
	public Date(int month,int day) {
		this(month,day,1900);
	}
	
	public Date(int month,int day,int year) {
		if(year <= 0)
			throw new IllegalArgumentException("年份錯誤 (" + year +")，值必須大於 0");
		
		if(month <=0 || month >12) {
			throw new IllegalArgumentException("月份錯誤 (" + month +")，值必須在 1 ~ 12 之間");
		}
		
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day ==29))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期值不符合該月份的正常範圍");
		}
		
		if((month == 2 && day ==29) && 
		  !((((year % 4) == 0) && ((year % 100 ) != 0)) || ((year % 400) == 0))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期不符合2月閏年的正常範圍");
		}
		
		this.month= month;
		this.day = day;
		this.year = year;
		
	}

	public void setMonth(int month) {
		if(month <=0 || month >12) {
			throw new IllegalArgumentException("月份錯誤 (" + month +")，值必須在 1 ~ 12 之間");
		}
		
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setDay(int day) {
		if(day <= 0 || (day > daysPerMonth[this.month] && !(this.month == 2 && day ==29))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期值不符合該月份的正常範圍");
		}
		
		if((this.month == 2 && day ==29) && 
		  !((((this.year % 4) == 0) && ((this.year % 100 ) != 0)) || ((this.year % 400) == 0))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期不符合2月閏年的正常範圍");
		}
		
		this.day = day;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setYear(int year) {
		this.setDate(this.month, this.day, year);
//		if(year <= 0)
//			throw new IllegalArgumentException("年份錯誤 (" + year +")，值必須大於 0");
//		
//		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}

	public void setDate(int month,int day,int year) {
		if(year <= 0)
			throw new IllegalArgumentException("年份錯誤 (" + year +")，值必須大於 0");
		
		if(month <=0 || month >12) {
			throw new IllegalArgumentException("月份錯誤 (" + month +")，值必須在 1 ~ 12 之間");
		}
		
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day ==29))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期值不符合該月份的正常範圍");
		}
		
		if((month == 2 && day ==29) && 
		  !((((year % 4) == 0) && ((year % 100 ) != 0)) || ((year % 400) == 0))) {
			throw new IllegalArgumentException("日期錯誤 (" + day +")，日期不符合2月閏年的正常範圍");
		}
		
		this.month= month;
		this.day = day;
		this.year = year;
		
	}
	
//	public String printDate() {
	public String toString() {
		return String.format("%d/%d/%d", this.year,this.month,this.day);
	}  
}
