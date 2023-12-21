package es.uclm.esi.iso2.ga03.GravitationalEq;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	private ByteArrayInputStream testIn;
	@Before
	public void setUp() {
		String input = "10.0\n20.0\n19600.0\n";
		testIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(testIn);
	}
	
	@Test
	public void testAskValues() {
		Main.askValues();
		assertTrue(true);
	}

	@Test
	public void testPrintResult() {	
		Main.printResult(0.0000000000000000000007777160373373976);
		assertTrue(true);
	}
	
	@Test
	public void testIsPositive() {
		Main.isPositive(60.0);
		assertTrue(true);
	}
	
	@Test
	public void testIsPositiveFalse() {
		Main.isPositive(-60.0);
		assertFalse(false);
	}
	
	@Test
	public void testCheckPositiveInput() {
		Main.checkPositiveInput(60.0);
		assertTrue(true);
	}
	
	@Test
	public void testCheckPositiveInputFalse() {
		Main.checkPositiveInput(-60.0);
	}
}