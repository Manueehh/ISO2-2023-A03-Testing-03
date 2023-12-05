package es.uclm.esi.iso2.ga03.Gravitational;

public class GravitationalEquationMethods {
	
	public static double calculateGravitationalForce(double gravitationalConstant, double massA, double massB, double distance) {
		if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero.");
        }
        double gravitationalForce = (gravitationalConstant * massA * massB) / Math.pow(distance, 2);
        return gravitationalForce;
	}
}
