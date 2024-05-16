package OOpsPrograms;

public class Finallyconcept {

	public static void main(String[] args) {
		
		finallymethod();
		
		
	}

	  public static void finallymethod(){

		  
		  
		 try {            int a=50/0;

		     System.out.println("The value of a is "+a);
		 }
		 
		 catch(Exception e){
			 
			 System.out.println("This is an arithmatic excetion");
	 
		 }
		
		  
	 finally {                                                    // This statement always executed even exception thrown 
		     
		 
		 System.out.println("This is statment after getting error");
		  
	 
	 }
	
	  
  
	  }

		}


		 

	


