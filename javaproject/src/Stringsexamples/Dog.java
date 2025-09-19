package Stringsexamples;

public class Dog {
	
	String name;
	String color;
	String bread;
	int height ;
	int weight ;
	
	public static void main(String[] args) {
		
		String name = "munna";
		String color = "black";
		String bread = "zermen sheperd";
		int height = 3;
		int weight = 30;
		
		Dog dog = new Dog();
		
		dog.name = "munna";
		dog.color = "black";
		dog.bread = "zermen sheperd";
		dog.height = 3;
		dog.weight = 30;
		
		
		System.out.println( "dog.name:" + name);
		System.out.println("dog.color:" + color);
		System.out.println("dog.bread:" + bread);
		System.out.println("dog.height:" + height);
		System.out.println("dog.weight:" + weight);
	}

}
