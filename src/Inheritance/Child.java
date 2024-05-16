package Inheritance;

public class Child extends Father  {
	
	

	public void bike() {
		System.out.println("Child-----------bike");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Father f1= new Child();
		
	  f1.car();
	  f1.home();
	  f1.money();
	 
		
		
	}
	
	
	
	
	
	
	

}
