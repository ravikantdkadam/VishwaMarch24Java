package OOpsPrograms;

public class MainMethodoverload {

	public static void main(String[] args) {
		
		System.out.println("This is main method ");
		
		main(20);
		main(10,30);
		

	}
	
	
	public static void main(int a) {
		
		System.out.println("This is main method with single int parameter "+a);

	}
	
	
	public static void main(int k, int j) {
		
		System.out.println("This is main method with two int parameter "+(k+j));

	}
	

}
