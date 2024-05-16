package OOpsPrograms;

public class MethodOverload {
	
	
	
	// Method overloading : When the method name is same with different parameters and arguments within same class, this is called as method overloading.

	public static void main(String[] args) {
		
		MethodOverload obj =new MethodOverload();
		
		obj.sum();
		obj.sum(20);
		obj.sum(10,30);
		obj.sum(25.0);


	}
	
	
	
	public void sum() {  // 0 Parameters
		
		System.out.println("This is method with  zero parameters");
		
	}
	
	public  void sum(int i) {     // 1 parameter
		
		System.out.println(+i);
		
	}

	


	public  void sum(int a, int b) {  // 2 parameters 
		
		System.out.println("The value of a and b is "+a +" and " +b);
		
	}
	
	
	//We can create method with same name and same parameters but with different datatype. --------------VVIMP

	
	public  void sum(double k) {     // 1 parameter with different datatypes 
		
		System.out.println("The value of double parameter is "+k);
	
	}



	
}
