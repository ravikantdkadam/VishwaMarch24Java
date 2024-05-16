package JavaPrograms;

public class premitivedatatypes {

	public static void main(String[] args) {
        byte smallnum =100;          // Size 1 byte     (-128 to 127)
		
		short num =5000;          // size- 2byte (-32768 to 32767)
		
		int Rollnum=123;      // size- 4byte,int stores whole number either positive or negative
		
		long bignum = 15000000000000000L; //  size- 8byte, when int should not sufficient to store long value then use long data type -8byte 
		
		float Salary=2.50f;   //size- 4byte,float store number with decimal ,you should end value with f for float with d for double 
		
		double bigdecimal= 19.98d;   //size- 8byte,float store number with decimal ,you should end value with f for float with d for double 
				
		char letter='D';      // Size -2 byte ,Character stores single byte characters 
		
		boolean Bool =true;		// Size 1 bit ,boolean save value either true or false 
		
	
	
		
		
		System.out.println("My roll number is "+Rollnum);
		
		System.out.println("My float value is "+Salary);
		System.out.println("My bigdecimal value is "+bigdecimal);
				
		System.out.println("My charcter value is "+letter);
		
		System.out.println("My boolean value is "+Bool);
		
		

	}

}
