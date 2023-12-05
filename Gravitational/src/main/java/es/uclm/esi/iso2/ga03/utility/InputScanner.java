package es.uclm.esi.iso2.ga03.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
	private static Scanner scanner = new Scanner(System.in);

	public static double readPositiveDouble(String task) {
		while (true) {
			try {
				System.out.print(task);
				return askInput();
			} catch (InputMismatchException e) {
				System.err.println("Error: Enter a valid number.");
				scanner.next();
			} catch (IllegalArgumentException e) {
				System.err.println("Error: " + e.getMessage());
			}
		}
	}

	private static void checkPositiveInput(double input) {
		if (input <= 0) {
			throw new IllegalArgumentException("Enter a positive number greater than zero.");
		}
	}

	private static double askInput() {
		double input = scanner.nextDouble();
		checkPositiveInput(input);
		return input;
	}
}
