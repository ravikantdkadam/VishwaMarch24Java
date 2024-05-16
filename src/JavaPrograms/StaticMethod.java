package JavaPrograms;

public class StaticMethod {

	public static void main(String[] args) {       // Main Method 
		regular1();        // call to static method in same class
		
		regular2();          // call to static method in same class
		
		
		
		
		FirstJavaProgram.regular2();   // call to static method from another class
		

	}
	
	
	public static void regular1() {                               // Static method 1 
		
		
		System.out.println("This is static method 1");
		
		
	}

	
	public static void regular2() {                                // Static Method 2 
		
		
		System.out.println("This is static method 2");
		
		
	}

	
	
	
	
	
}
