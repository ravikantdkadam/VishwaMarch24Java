package JavaPrograms;

public class Casting {

	public static void main(String[] args) {
		
		// Widening casting : Converting smaller data type to a larger data type 
		
		int num =9; 
		
		double bignum=num;
		
		
		System.out.println("This is int datatype "+num);
		
		System.out.println("This is double datatype "+bignum);
		
		
		
		
		// narrowing casting : Converting larger data type to a smaller data type 
		
		double mynumber=9.81d;
		
		int number = (int) mynumber;
		
		
		System.out.println(mynumber);
		System.out.println(number);
		

	}

}
