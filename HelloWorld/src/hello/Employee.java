package hello;

public class Employee {

	private String  firstName;
	private String  lastName;
	private Date  birthday;
	private Date  hireday;	
	
	public  Employee(String firstName,String lastName,Date birthday,Date hireday) {
		
		if(firstName.equals("")) {
			
			new IllegalArgumentException("");
			
		}
	if(lastName.equals("")) {
			
			new IllegalArgumentException("");
			
		}
		
		this.firstName= firstName;
		this.lastName= lastName;
		this.birthday=birthday ;
		this.hireday=hireday ;
	
	
	
	
	}
	
	public void setFirstName(String firstName) {
		if(firstName.equals("")) {
			throw new IllegalArgumentException("員工資料輸入錯誤，firstName 不可空白!");
		}
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		if(lastName.equals("")) {
			throw new IllegalArgumentException("員工資料輸入錯誤，lastName 不可空白!");
		}
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setBirthDay(Date birthday) {
		this.birthday = birthday;
	}
	
	public Date getBirtday() {
		return this.birthday;
	}
	
	public void setHireDay(Date hireday) {
		this.hireday = hireday;
	}
	
	public Date getHireday() {
		return this.hireday;
	}
	
	public String toString() {
		return String.format("1. %s%s : 出生日期 = %s\n          雇用日期 = %s",
				this.lastName,this.firstName,this.birthday.toString(),this.hireday.toString());
//     	return String.format("%s%s + 出生日期: %s, 雇用日期: %s", this.lastName,this.firstName,this.birthday.toString(),this.hireday.toString());
	}
	
}
