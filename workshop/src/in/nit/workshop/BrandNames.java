package in.nit.workshop;

public class BrandNames {
	
	public static void main(String[] args) {
		
		//declare array
		String BrandNames[] = {"gucci","prada",};
		for(int index = 0; index <BrandNames.length; index++) {
		    System.out.println(BrandNames[index]);
		
		}
		System.out.println("reverse array elements");
		for(int index = BrandNames.length-1; index>=0;index--){
			System.out.println(BrandNames[index]);
		
			
		}
	}
}

	

           