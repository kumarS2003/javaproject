package com.psoft.java.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DisplayDetails {
	
	
		public void addStudents1() {
	    Map<Integer,Students> map = new TreeMap<>();
		Students s= new Students("Kumar",18,"manubol");
		Students s1= new Students("jayasai",15,"kovvur");
		map.put(1, s);
		map.put(2, s1);
		for(Students k : map.values())
		System.out.println(k);
		
		System.out.println("-------------");
	
    Map<Integer,Employes> emp = new TreeMap<>();
	Employes e = new Employes("mahesh",10,"manubol" );
	Employes e1 = new Employes ("Sravani", 11, "Gvp");
	Employes e2 = new Employes("malli", 12, "mbl");
    emp.put(1, e);
    emp.put(2, e1);
    emp.put(3, e2);
    for(Employes k1 : emp.values())
		System.out.println(k1);
    
    System.out.println("-------------------");
    
     Map<Integer,Cities> citi = new TreeMap<>();
     Cities r = new Cities("AP" , "nellore");
     Cities r1 = new Cities("AP" , "chitur");
     Cities r2 = new Cities ("AP" , "ongole");
     Cities r3 = new Cities ("AP" , "tirupathi");
     citi.put(1, r);
     citi.put(2, r1);
     citi.put(3, r2);
     citi.put(4, r3);
     for(Cities c : citi.values()) 
     System.out.println(c);
		}
		
    public static void main(String[] args) {
	DisplayDetails d = new DisplayDetails();
	d.addStudents1();
	
}

	
	
 
	
  }


   