package com.psoft.java.HashMap;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMaps {
		
		public static void main(String[] args) {
			Map<Integer, String> hashMap = new HashMap<>();
			
			hashMap.put(5, "Mango");
			hashMap.put(3, "bannana");
			hashMap.put(7, "Apple");
			hashMap.put(2, "Straberry");
			System.out.println("Map data:" + hashMap);
			
			//- Get & Contains ---
			
	     System.out.println( "get(2):" + hashMap.get(2));
	     System.out.println("Containskey(7):" + hashMap.containsKey(7));
	     System.out.println("ContainsValue('straberry'):" + hashMap.containsValue("straberry"));
			
	     //- Iteration (keySet) ---
	     System.out.println("\nIterating using keyset():");
	     for(Integer key : hashMap.keySet()) {
	    	 System.out.println("(key):"+ key +  ",Value:" + hashMap.get(key));
	    	 
	     }
	     
	  // --- Iteration (values) ---
	     System.out.println("\nIterating using Values():");
	     for (String Value : hashMap.values()) {
	    	 System.out.println(Value);
	     }
	  // --- Iteration (entrySet) ---
	     System.out.println("\nInterating using enterySet():");
	     for ( Map.Entry < Integer, String> entry : hashMap.entrySet() ) {
	    	 System.out.println(entry.getKey() + "=>" + entry.getValue());
	    	 
	     }
	  // --- Update / Replace ---
	     hashMap.replace(3, "grapes");
	     for ( Map.Entry < Integer, String> entry : hashMap.entrySet() ) {
	    	 
	    	 System.out.println(entry.getKey() + "=>" + entry.getValue());
	    	 
	     
	  // --- Remove ---
	     hashMap.remove(5);
	    System.out.println(hashMap.values());
	    
	 // --- Null handling ---
		hashMap.put(null, "NullKey"); // 1 null key allowed
		hashMap.put(5, null); // multiple null values allowed
 
	    
	 // --- Size & Clear ---
	 			System.out.println("\nSize before clear: " + hashMap.size());
	 			hashMap.clear();
	 			System.out.println("Size after clear: " + hashMap.size());
		}
		
	}

}


