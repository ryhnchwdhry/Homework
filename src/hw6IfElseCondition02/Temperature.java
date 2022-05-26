package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		
		if (temp < 32) {
			System.out.println("Freezing");

		} else if (temp < 55) {
			System.out.println(" Pleasant");

		} else if (temp < 73) {
			System.out.println("Getting Warmer");

		} else if (temp < 101) {
			System.out.println("Hot");

		} else {
			System.out.println("Ice on my Head Please");
		}
		scanner.close();
	}
}
