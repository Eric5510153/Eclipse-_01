package hello;



public class Java12_2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
    int i,j,k;
	int arrayInt[][][] = {
			
			{
	           			
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
			
			},
			{
			    {41,42,43,44},
			    {51,52,53,54},
			    {61,62,63,64}
			}
	};
	
      System.out.println("三圍陣列,2x3x4陣列的內容為:");
		for(i=0;i<arrayInt.length;i++) {
			
			System.out.println("第"+(i+1)+"組:");
			for(j=0;j<arrayInt[i].length;j++) {
				
				System.out.println("第"+(j+1)+"列:");
				for(k=0;k<arrayInt[i][j].length;k++) {
					System.out.println(arrayInt[i][j][k]+",");
					
				
					
				}
				System.out.println();
				
			}
		}
		System.out.println("陣列 arrayInt 第一維的元素個數:"+arrayInt.length);
		System.out.println("陣列 arrayInt 第二維的元素個數:"+arrayInt[0].length);
		System.out.println("陣列 arrayInt 第三維的元素個數:"+arrayInt[0][0].length);
		
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
