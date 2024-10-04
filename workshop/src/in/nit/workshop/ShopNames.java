package in.nit.workshop;

public class ShopNames {
	
	public static void main(String[] args) {
		
		//declare array
		String ShopNames[] = {"coffeeshop","icecreamshop"};
		for(int index = 0; index <ShopNames.length; index++) {
		    System.out.println(ShopNames[index]);
	}
	System.out.println("reverse array elements");
	for(int index = ShopNames.length-1; index>=0;index--){
		System.out.println(ShopNames[index]);
	}
	//local variables
	boolean isGood = true;
	if(isGood == true) {
		System.err.println("is good is:"+isGood);
		
}
	}
}


