package OOpsPrograms;

public class ConstructorConcept {


	public static void main(String[] args) {
		
		
		ConstructorConcept c1= new ConstructorConcept();
		
		ConstructorConcept c2= new ConstructorConcept(50);
		
		
		ConstructorConcept c3= new ConstructorConcept(10,20);

	}

	
	
	
	public ConstructorConcept(){
		
		
		System.out.println("This is default constructor");
		
		
		
	}
	
	
	

	public ConstructorConcept(int a){
		
		
		
		System.out.println("This is single parameter constructor");
		
		
		
	}
	
	
	
    public ConstructorConcept(int a, int b){
		
		
		System.out.println("This is double parameter constructor");
		
		
		
	}
	
}
	

