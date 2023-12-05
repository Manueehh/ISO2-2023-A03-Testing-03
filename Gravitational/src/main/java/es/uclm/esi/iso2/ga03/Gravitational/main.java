package es.uclm.esi.iso2.ga03.Gravitational;
import es.uclm.esi.iso2.ga03.utility.*;

public class main {
	public static void main(String[] args) {
        try {
            printResult(askValues());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
	private static void printResult(double gravitationalForce) {
		System.out.println("Gravitational Force: " + gravitationalForce + " Newtons");
	}
	
	private static double askValues() {
		 double mass1 = InputScanner.readPositiveDouble("Enter the mass of the first object: ");
         double mass2 = InputScanner.readPositiveDouble("Enter the mass of the second object: ");
         double distance = InputScanner.readPositiveDouble("Enter the distance between the objects: ");
         
         return calculateResult(mass1, mass2, distance);
	}
	
	private static double calculateResult(double mass1 , double mass2, double distance) {
		return GravitationalEquation.calculateGravitationalForce(mass1, mass2, distance);
	}

}
