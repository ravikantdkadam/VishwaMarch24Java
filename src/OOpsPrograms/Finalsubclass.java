package OOpsPrograms;

public class Finalsubclass extends  FinalkeywordConcept{      // final class can not be inherited into subclass 


	
	public void display() {                            // method can not be override for final method 
		
		System.out.println("This is subclass metthod ");
		
	}
	
	
	
public static void main(String[] args) {
		
		
	Finalsubclass f1= new Finalsubclass();
		
		f1.display();
	System.out.println(f1.age);
		
	}

}
