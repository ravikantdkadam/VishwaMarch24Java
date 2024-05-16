package ArrayandCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> ar  = new ArrayList<Object>();   // Object- Different types of data we can story in ArrayList
		
		
		// Add method 
		
		
		ar.add(25);                 //integer
		ar.add("Tom");                  // String 
		ar.add(55.26);                       // Double 
		ar.add('V');                            // Char
		
		
		System.out.println(ar);
		
		
		// Size of ArrayList
		
		System.out.println("Size of arraylist is " +ar.size());
		
		
		// remove method - To remove the element 
		
		ar.remove(1);
		
		
		System.out.println("After remove the tom element "+ar);
		
		
		ar.add(0, "Vishwatech");    // added element at begaining of list 
		
		
		System.out.println(ar);
		
		
		ar.add(2, "Solutions");   // added element in middle of list with index  
		
		
		System.out.println("This is 1st arraylist " +ar);
		
		
		ArrayList<Object> list  = new ArrayList<Object>();
		list.add(36);
		list.add(63);
		list.add("Vishwatech ");
		list.add("Pune");
		
		System.out.println("This is 2nd arraylist "+list);
		
		
		// Combine of 2 arraylist ---addAll Method 
		

		System.out.println(	ar.addAll(list));
		
	
	
		//get method -----> to retrive the element at perticular index
		

		
		System.out.println(	"Element at 2nd index postions is " +ar.get(2));
		
		// Contains method : Result true if element contains in a list 
		
		System.out.println(ar.contains(53));
			
		
		
		// Duplicate elements add in arraylist 
		
		
		System.out.println(ar);
		//[Vishwatech, 25, Solutions, 55.26, V, 36, 63, Vishwatech , Pune]
		
		
		// adding null value 
		
		ar.add(5, null);
		
		
		System.out.println(ar);
		
		
		
		// Replace element from list----set method  
		
		ar.set(8, "Oriontech");
		
		
		System.out.println(ar);
		
	System.out.println("******************************************************************");	
	
	// For Loop 
	for (int i=0 ;i<ar.size();i++)	{
		
	System.out.println(ar.get(i));	
	
	}
	
	
	System.out.println("******************************************************************");	
	
	
	// for each loop 
	
	
	for (Object b:ar) {
		
		System.out.println(b);
	}
	
	System.out.println("******************************************************************");	
	
	// Iterator 
	
	
	Iterator<Object > it = ar.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	
	
		
	}

}
