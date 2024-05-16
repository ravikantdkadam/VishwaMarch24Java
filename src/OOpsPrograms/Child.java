package OOpsPrograms;

public class Child extends Parentclass{

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.bike();
		c1.car();
		c1.home();
		c1.money();
		
		
		
	}

	public void bike() {
		System.out.println("Child----------------bike");
		
	}
	
	
	public void home() {
		
		System.out.println("Child----------------home");
	}
	
	public void money () {
		
		System.out.println("Child----------------money");
		
	}
	
	
	
}
