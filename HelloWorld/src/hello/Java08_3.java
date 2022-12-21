package hello;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Java08_3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

		
		
		System.out.println("請輸入文字內容:");
         try {
        	 
        	 InputStreamReader inputReader = new InputStreamReader(System.in);
        	 BufferedReader bufferedReader = new BufferedReader(inputReader);
        	 
        	 
        	 String strLine;
        	 while((strLine=bufferedReader.readLine())!=null) {
        	 
        	 System.out.println(strLine);
        	 
        	 
        			 
        	
         }
         }catch(java.io.IOException ex) {
 			ex.printStackTrace();
 		}
 		
         }
		
		
		
	}


