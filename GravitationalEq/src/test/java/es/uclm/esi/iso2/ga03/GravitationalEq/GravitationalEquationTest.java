package es.uclm.esi.iso2.ga03.GravitationalEq;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class GravitationalEquationTest {

    private GravitationalEquation gravitationalEquation;

    @Before
    public void setUp() {
        gravitationalEquation = new GravitationalEquation(10.0, 5.0, 2.0);
    }

    @Test
    public void testCalculateGravitationalForce() {
        double expectedForce = (6.67430e-11 * 10.0 * 5.0) / Math.pow(2.0, 2);
        assertEquals(expectedForce, gravitationalEquation.calculateGravitationalForce(), 0.000001);
    }

    @Test
    public void testSetMass1() {
        gravitationalEquation.setMass1(15.0);
        assertEquals(15.0, gravitationalEquation.getMass1(), 0.000001);
    }

    @Test
    public void testSetMass2() {
        gravitationalEquation.setMass2(7.0);
        assertEquals(7.0, gravitationalEquation.getMass2(), 0.000001);
    }

    @Test
    public void testSetDistance() {
        gravitationalEquation.setDistance(3.0);
        assertEquals(3.0, gravitationalEquation.getDistance(), 0.000001);
    }

    @Test
    public void testToString() {
        String expectedString = "GravitationalEquation [mass1=10.0, mass2=5.0, distance=2.0]";
        assertEquals(expectedString, gravitationalEquation.toString());
    }
}
