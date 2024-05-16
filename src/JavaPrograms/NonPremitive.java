package JavaPrograms;

public class NonPremitive {

	public static void main(String[] args) {
		
		String className= "Vishwatech Solutions@1234";
		
		String city ="Pune";
			
		
		String batchname ="March2024";
		
		System.out.println("The batchname is "+batchname);
		
		System.out.println("The class name is "+className);
		

		System.out.println("The lenth of classname is "+className.length());   //length
		
		
		System.out.println("The classname is in uppercase "+className.toUpperCase());  //toUpperCase
		
		
		System.out.println("The classname is in lowercase "+className.toLowerCase());  //toLowerCase
		
		System.out.println("The index of u is "+className.indexOf('@'));  //indexOf
		
		
	   System.out.println("The concat of two string varaible "+className.concat(city));  //concat
   
	   System.out.println("The result of contains method is "+className.contains("Sol"));  //contains
	   
	   
	   System.out.println(className.isBlank());     //false
	   
	   System.out.println(city.isEmpty());      //false
	   
	   
	   System.out.println(className.equals(city));     //false
	   
	   

	}

}
