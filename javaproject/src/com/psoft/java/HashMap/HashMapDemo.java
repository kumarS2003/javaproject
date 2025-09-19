package com.psoft.java.HashMap;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMapDemo {
		
			public static void main(String[] args) {
				Map<Integer, String> hashMap = new HashMap<>();
		 
				// --- Put & PutIfAbsent ---
		 
				hashMap.put(3, "Mango");
				hashMap.put(17, "Apple");
				hashMap.put(2, "Banana");
				hashMap.put(5, "Banana");
				hashMap.put(1, "Apple");          
				hashMap.put(6, "Banana");
				hashMap.put(20, "Banana");
				hashMap.put(20, "Apple");
				System.out.println("Map Data :" + hashMap);
				
				// --- Get & Contains ---
				System.out.println("Get(2): " + hashMap.get(2));
				System.out.println("ContainsKey(3): " + hashMap.containsKey(3));
				System.out.println("ContainsValue('Mango'): " + hashMap.containsValue("Mango"));
		 
				// --- Iteration (keySet) ---
				System.out.println("\nIterating using keySet():");
				for (Integer key : hashMap.keySet()) {
					System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
				}
		 
				// --- Iteration (values) ---
				System.out.println("\nIterating using values():");
				for (String value : hashMap.values()) {
					System.out.println(value);
				}
		 
				// --- Iteration (entrySet) ---
				System.out.println("\nIterating using entrySet():");
				for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
					System.out.println(entry.getKey() + " => " + entry.getValue());
				}
		 
				// --- Update / Replace ---
				hashMap.replace(1, "Green Apple");
		 
				// --- Remove ---
				hashMap.remove(3);
		 
		 
				// --- Null handling ---
				hashMap.put(null, "NullKey"); // 1 null key allowed
				hashMap.put(5, null); // multiple null values allowed
		 
				// --- Size & Clear ---
				System.out.println("\nSize before clear: " + hashMap.size());
				hashMap.clear();
				System.out.println("Size after clear: " + hashMap.size());
			}
			

	}


