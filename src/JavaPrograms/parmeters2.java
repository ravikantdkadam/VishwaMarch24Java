package JavaPrograms;

public class parmeters2 {

	public static void main(String[] args) {
		
		
		para2("Vishwatech","Solutions",55000);           // static method call in same class
		
		Parameters.para1("Akshta", 25);             // static method call from another class
		
		
		parmeters2 p3=new parmeters2();                  // nonstatic method in same class
		 p3.para3("ravi@123", "kadam@123");
		

	}
	
	public static void para2(String fname,String lname,int salary) {
			
			
			System.out.println("The fname is "+fname +" and lname is "+lname + " and salary is "+salary);
			
			
		}
		
	public void para3(String id, String pwd) {
			
			
			System.out.println("The is is "+id + " and pwd is "+pwd);
	
		}
		
	}


