package ArrayandCollection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<String, String> capital= new HashMap<String, String>();
		
		
		 // To add the information in HashMap we use PUT Method 
        // To print the value of ky parameter we use get Method 
        
        
		
	
          capital.put("INDIA", "New Delhi");
          capital.put("USA", "Washington");
          capital.put("UK", "London");
          capital.put("NEPAL", "Kathmandu");
          capital.put("NEPAL", "Bhutan");
          capital.put("Afgan", "Kathmandu");
          
          capital.put(null, "Berlin");
           
          
          capital.put(null, "SanFransisco");
          
          
          capital.put("Russia", null);
           
          
          capital.put("France", null);
          
   
          
          System.out.println(capital.get("USA"));
          
          
          System.out.println(capital.get("UK"));
          
          
          
         
                System.out.println(capital.get("NEPAL"));// Not allow duplicate Key 
                System.out.println(capital.get("Afgan"));
                
                
                
                
         
         System.out.println(capital.get("Afgan"));  // allows duplicate value
         
         
         
         
        
         System.out.println(capital.get(null));  // single null key allowed 
         
                   
          System.out.println(capital.get("Russia"));  // Allows duplicate Null Value  
          
          System.out.println(capital.get("France"));
          

          
          
          // Iterator 
          
         Iterator<String> it =capital.keySet().iterator();
                    while(it.hasNext()) {
       	  
        	String key=  it.next();
      	String value=capital.get(key);
        	System.out.println("key: "+key  + " value:" +value);
       	
        	  
          }
          
	}
	}


