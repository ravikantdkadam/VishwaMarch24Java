package ArrayandCollection;

public class ArrayConcept {
	
	//Array used to Store similar types values in array variable:
	// int array variable, Boolean array variable, double array variable, character array variable , Object array variable 
	//Array size fixed – Static array 


	public static void main(String[] args) {
		//int array variable
		// Size of array -4
		// Highest/upper index = Size(n)-1 =4-1=3

		
		int a[] =new int [4];                  // int array variable- bacuse we stored similar type of integer values
		
		 a[0]=15;
		 a[1]=20;
		 a[2]=25;
		 a[3]=30;
		 
//		 System.out.println(a[0]);
//		 System.out.println(a[1]);
//		 System.out.println(a[2]);
//		 System.out.println(a[3]);
		 
		 
		 //length of this array 
		 
		 System.out.println("The lenth of array is"+a.length);
		 
		 for (int i=0;i<a.length; i++) {
			 
			 System.out.println(a[i]);
			 
		 } 
			System.out.println("===================================================================================================="); 
			 
			
			
			//Char array variable 
			
			char b []= new char[3];
			 
			 b[0]='M';
			 b[1]='$';
			 b[2]='A';
					 
					 
			 System.out.println(b[1]);
					 
					 
					 
			 System.out.println("===================================================================================================="); 
			 
		 // Boolean array variable 
					 
					 
			 boolean c[] = new boolean[2];
				
			 System.out.println(c[1]);
	 
					
					 
			 System.out.println("===================================================================================================="); 
					 		 
					 
			 //double array variable 
									 

										double d [] = new double[5];    
										 
										  d[0]=10.25;
										  d[1]=20.00;
										  d[2]=30.25;
										  d[3]=40.58;
										  d[4]=21.22;
									  
										  System.out.println(d[1]);
 
		  System.out.println("===================================================================================================="); 
									 		 
										  
										  
			  //String array varaible 
										  
										  String s[]= new String[3];
										  
										  s[0]="Tom";
									      s[1]="Jeery";
									      s[2]="ABC@gmail.com";
									 		 
									      
									      System.out.println(s[2]);

									      
		  System.out.println("===================================================================================================="); 
									 		 
										  
			// Object array variable- we can store different type values in object array variable
									  	
									  	 
									  	      Object ob[] =new Object[5];  //    Object is a class so we can use initial in capital letter
									  	      
									  	
									  	      ob[0]=10;
									  		  ob[1]="TOM";
									  		  ob[2]='@';
									  		  ob[3]=40.26;
									  		  ob[4]="ABC12";
									  		  
									  		  
									  		  System.out.println(ob[2]);
									  		  
						      
									      
									  		  System.out.println("===================================================================================================="); 
										 		 								      
									      
	// Two Dimensional Array 			
									  		  
									  		  
									  		  
				int v[] [] = new int[2][2];	
				
				v[0][0] =25;
				v[0][1] =50;
									  		  
				v[1][0] =75;					  		  
									  		  
				v[1][1] =85;					      
								
				
				System.out.println(v[1][0]);
									      
									      
					 
		 }
			 
			 
		 
	}


