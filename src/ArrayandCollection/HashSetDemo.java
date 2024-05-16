package ArrayandCollection;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {


		 HashSet<String> set1= new HashSet<String>();
		 
		 set1.add("Ravikant");
		 
		 set1.add("Sachin");
		 
		 set1.add("Virat");
		 
		 set1.add("Ravikant");
		
		 set1.add(null);
		 
		 set1.add("gajanan");
		 
		 set1.add(null);
		 
		 
		 System.out.println("Set1 : "+set1);
		 
		 
		 
		 HashSet<String> set2= new HashSet<String>(Arrays.asList("vishwatech","Solutions","Pimri","412105")); 
		 
		 // asList method can use to add the element in set 
		 
		 System.out.println("Set2 :" +set2);
		 
		 
		 
		 boolean set3 = set1.addAll(set2);
		 
		 
		 System.out.println("set3 :" +set3);
		 
		 
	// RetainsAll -- for intersection of sets 
		 
		 
		 System.out.println(set1.retainAll(set2));
		 
		 
		 // clear()
		 
		 set1.clear();
		
		 
		 System.out.println("after clear the set : " +set1);
		 
		 // is empty ()
		 
		 
		System.out.println("is empty method "+set1.isEmpty()); 
		
	
	 

	}

}
