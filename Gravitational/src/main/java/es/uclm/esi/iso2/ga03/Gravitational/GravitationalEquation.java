package es.uclm.esi.iso2.ga03.Gravitational;

import es.uclm.esi.iso2.ga03.utility.InputScanner;

public class GravitationalEquation {

	private static final double GRAVITATIONAL_CONSTANT = 6.67430e-11;

    public static double calculateGravitationalForce(double mass1, double mass2, double distance) {
        return (GRAVITATIONAL_CONSTANT * mass1 * mass2) / Math.pow(distance, 2);
    }
}
