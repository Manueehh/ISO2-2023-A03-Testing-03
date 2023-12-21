package es.uclm.esi.iso2.ga03.GravitationalEq;

public class GravitationalEquation {

	private static final double GRAVITATIONAL_CONSTANT = 6.67430e-11;

	private double mass1;
	private double mass2;
	private double distance;

	public GravitationalEquation(double mass1, double mass2, double distance) {
		this.setMass1(mass1);
		this.setMass2(mass2);
		this.setDistance(distance);
	}

	public double calculateGravitationalForce() {
		return (GRAVITATIONAL_CONSTANT * mass1 * mass2) / Math.pow(distance, 2);
	}

	public double getMass1() {
		return mass1;
	}

	public void setMass1(double mass1) {
		this.mass1 = mass1;
	}

	public double getMass2() {
		return mass2;
	}

	public void setMass2(double mass2) {
		this.mass2 = mass2;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String toString() {
		return "GravitationalEquation [mass1=" + this.getMass1() + ", mass2=" + this.getMass2() + ", distance="
				+ this.getDistance() + "]";
	}

}
