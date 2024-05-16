package OOpsPrograms;

public class ConstructorWiththisKeyword {

	String name;                         // Global variable 
	int age;
	
	
	
	public static void main(String[] args) {
		
		ConstructorWiththisKeyword t1= new ConstructorWiththisKeyword("Vishwatech",25);
		

	}
	
	
	public ConstructorWiththisKeyword(String name,int age ) {     // Local variable
		
		this.name=name;
		this.age=age;
		
	
		System.out.println("This is parent constructor ");
		
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	
	

}
