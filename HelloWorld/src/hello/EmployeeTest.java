package hello;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Date birth = new Date(1,18,2000);
		Date hire = new Date(6,30,2022);
		
		Employee employee_01 = new Employee("真倉", "輸", birth, hire);
		System.out.println(employee_01.toString());

		Employee employee_02=null;
		try {
			employee_02 = new Employee("志兼","淋",birth,new Date(11,30,1999));
		}catch (IllegalArgumentException ex) {
			System.out.println("新增員工基本資料時發生錯誤，錯誤訊息:"+ex.getMessage());
		}
		
		try {
			employee_02.setLastName(""); 
		}catch (IllegalArgumentException ex) {
			System.out.println("修改 employee_02 員工基本資料時發生錯誤，錯誤訊息:"+ex.getMessage());
			System.out.println("employee_02 員工資料:\n"+employee_02.toString());
		}
		
	}

}
