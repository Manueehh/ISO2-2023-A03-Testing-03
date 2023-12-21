package es.uclm.esi.iso2.ga03.GravitationalEq;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	final static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        try {
            printResult(askValues());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
	public static void printResult(double gravitationalForce) {
		System.out.println("Gravitational Force: " + gravitationalForce + " Newtons");
	}
	
	public static double askValues() {
		 double mass1 = returnValues("Enter the mass of the first object: ");
         double mass2 = returnValues("Enter the mass of the second object: ");
		 double distance = returnValues("Enter the distance between the objects: ");
		 GravitationalEquation gravitationalEquation = new GravitationalEquation(mass1, mass2, distance);
         return calculateResult(gravitationalEquation);
	}
	
	public static double returnValues(String task) {
		double value = 0.0;
			try {
				System.out.print(task);
				value = scanner.nextDouble();
				checkPositiveInput(value);
			} catch (InputMismatchException e) {
				System.err.println("Error: Enter a valid number.");
				scanner.next();
			} catch (IllegalArgumentException e) {
				System.err.println("Error: " + e.getMessage());
			}
			return value;
		}
	
	public static void checkPositiveInput(double input) {
		if (isPositive(input) == false) {
			throw new IllegalArgumentException("Enter a positive number greater than zero.");
		}
	}

	public static boolean isPositive(double input) {
		if (input <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static double calculateResult(GravitationalEquation gravitationalEquation) {
		return gravitationalEquation.calculateGravitationalForce();
	}

}