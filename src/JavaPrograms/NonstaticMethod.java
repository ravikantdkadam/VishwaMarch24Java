package JavaPrograms;

public class NonstaticMethod {

	public static void main(String[] args) {
		
		
		NonstaticMethod n1= new NonstaticMethod();   // create object of same class
		
		n1.nonregular1();                             // call nonstatic method in same class
		n1.nonregular2();                             // call nonstatic method in same class
		
		
	
		//FirstJavaProgram n2=new FirstJavaProgram();    // Create object of different class
			//n2.nonregular3();                              // call nonstatic method ifrom differnt class	
		
		
	}

	
	 public void nonregular1() {
		 
		
		 System.out.println("This is nonstatic regular1 method ");
		 
	 }
	 

 public void nonregular2() {
		 
		 
		 System.out.println("This is nonstatic regular2 method ");
		 
	 }
	 
}
