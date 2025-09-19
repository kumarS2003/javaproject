package com.psoft.java.collections;



	public class Laptop implements Comparable<Laptop> {
		private int id;
		private String brand;
		private int ram;
		private double price;
	 
		public Laptop(int id, String brand, int ram, double price) {
			this.id = id;
			this.brand = brand;
			this.ram = ram;
			this.price = price;
		}
	 
		public int getId() {
			return id;
		}
	 
		public String getBrand() {
			return brand;
		}
	 
		public int getRam() {
			return ram;
		}
	 
		public double getPrice() {
			return price;
		}
	 
		/**
		 * Comparable interface: natural order based on price Reason: Price is the most
		 * common field used when customers compare laptops.
		 */
	 
		@Override
		public int compareTo(Laptop other) {
			return Double.compare(this.price, other.price);
		}
	 
		@Override
		public String toString() {
			return "Laptop{" + "id=" + id + ", brand='" + brand + '\'' + ", ram=" + ram + ", price=" + price + '}';
		}
	}

