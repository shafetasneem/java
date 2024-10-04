package in.nit.workshop;

public class person {

	// static variables
	public static String country;
	public static String state;
	
	//instance variable or non-static variables
	public String personName;
	
	// static methods
	
	public static void displayInfo() {
		System.out.println("display method is invoked");
		
	}
	
	//non static methods
	public void getInformation() {
		System.out.println("invoking non-static method");
	}
	
	
	


}