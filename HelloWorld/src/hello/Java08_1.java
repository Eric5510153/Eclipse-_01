package hello;

public class Java08_1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		char c ;
		try {
			System.out.println("請輸入文字內容:");
	
			while((c=(char)System.in.read())>0){
				System.out.print(c);
				if(c=='\n') {
					System.out.println("\n\n以上為你所輸入的字串內容");
				}
							
			}
			
			
			
		}catch(java.io.IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
