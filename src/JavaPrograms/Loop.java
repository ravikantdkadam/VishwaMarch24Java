package JavaPrograms;

public class Loop {

	public static void main(String[] args) {
		
		// While Loop 
		// It is pretest loop 
		// Disadvantage : It will generate infinite loope if we don't use incremental/Decrmental oprator 
		
		
		int age=1;   // Initialization 
		
		
		while (age<=35)          // Condition 
		{
			
			System.out.println(age);    // Statement 
			
			age++;                        // Incremental operator=====i=i+1;
			
		}
		
		
	System.out.println("*********************************************************************************************************");
	
	
	// Do- While 
	
	//It is posttest loop 
	
		
	int i=1;   // initilization 
	
	do
	{
		System.out.println(i);   // statement 
		i++;  // incremental 
		
	}
		while (i<=10);    // condition 
	

	
	
	
System.out.println("*********************************************************************************************************");
	
	// For loop 

  for (int k=1;k<=10;k++)     // Initialization ; condition; incremental 
  {
	  
	  System.out.println(k);   // statement 
  }


	
	
	
	
	}

}
