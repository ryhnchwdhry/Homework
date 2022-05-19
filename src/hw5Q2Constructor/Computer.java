package hw5Q2Constructor;

public class Computer {

	public String brandName;
	public String model;
	public String operatinSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}

	public Computer(String brandName, String model, String operatinSystem, int price, char grade, boolean madeInUSA) {
		this.brandName = brandName;
		this.model = model;
		this.operatinSystem = operatinSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("This brand Name is: " + brandName + " Model: " + model + " operatinSystem: " + operatinSystem
				+ " Price: $" + price + ", Grade: " + grade + ", Made in Usa: " + madeInUSA);
	}

	public Computer(String brandName, String model, int price, boolean madeInUSA, char grade, String operatinSystem) {
		this.brandName = brandName;
		this.model = model;
		this.operatinSystem = operatinSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("This brand Name is: " + brandName + "Model: " + model + " operatinSystem: " + operatinSystem
				+ " Price: $" + price + ", Grade: " + grade + ", Made in Usa: " + madeInUSA);
	}
}
