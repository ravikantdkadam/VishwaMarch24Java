package OOpsPrograms;

public class GlobalandLocalVariable {
	
	//	Declaring this variable outside the method -Global variable
	// Scope of this variable is through out the project and it is permanent
	//	This is also called as class variable 

     static int i=5;                			 // Global Variable 
        
	
	
	public static void main(String[] args) {
		
		
		// Declaring this variable inside the method -Local variable
		// Scope of this variable is within that method only  and it is temporary

		
		int a=20;     // Local variable
        
     substarction();
	}


  public static void substarction() {
	  
	// System.out.println(a);

	 // System.out.println(i);
	  
  }
  }
