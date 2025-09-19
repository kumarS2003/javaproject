package Stringsexamples;

public class Mobile {
	
	String name;
	String color;
	String brand;
	int disply;
	int weight;
	
	public static void main(String[] args) {
		
		String name = "vivo v30";
		String color = "black";
		String brand = "vivo";
		int disply = 15;
		int weight = 110;
		
		Mobile mobile = new Mobile ();
		
		mobile.name = "vivo v30";
		mobile.color = "black";
		mobile.brand = "vivo";
		mobile.disply = 15;
		mobile.weight = 110;
		
		System.out.println("mobile.name:" + name);
		System.out.println("mobile.color:" + color);
		System.out.println("mobile.brand:" + brand);
		System.out.println("mobile.disply:" + disply);
		System.out.println("mobile.weight:" + weight);
	
	}
	

}
