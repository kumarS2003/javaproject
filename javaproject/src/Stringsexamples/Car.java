package Stringsexamples;

public class Car {
	
	String name ;
	String color ;
	String company ;
	int height ;
	int weight;
	

	public static void main(String[] args) {
		
		String name = "fartuner";
		String color = "wight";
		String company = "toyoto";
		int height = 6;
		int weight = 500;
		
		Car car = new Car();
		
		car.name = "fartuner";
		car.color = "wight";
		car.company = "toyoto";
		car.height = 6;
		car.weight = 500;
		
		System.out.println("car name:" + name);
		System.out.println("car color:" + color);
		System.out.println(" car company:" + company);
		System.out.println("car height:" + height );
		System.out.println("car weight:" + weight);
	}

}
