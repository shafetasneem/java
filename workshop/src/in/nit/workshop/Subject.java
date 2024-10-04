package in.nit.workshop;

public class Subject {
	
	//properties of subject
	public String SubjecName;
	public String SubjectCode;
	
	
	//constructor
	public Subject () {
		System.out.println("default constructor");
			
	}
     //instance methods
	public void getsubjectDetails() {
		System.out.println("this is getsubjectDetails method");
		
	}
		
		
		
		
		public void getsubjectDetails (String subjectName) {
			System.out.println("this is getsubjectDetails method");
			System.out.println("Subject name:"+ subjectName);
			
		}
		// to get length of the given subject
		public void getNumberOfChar(String subjectName) {
			System.out.println("finding the char count");
			System.out.println("Subject char count:"+subjectName.length());
			

			
		}
		
		
		
		
	}










