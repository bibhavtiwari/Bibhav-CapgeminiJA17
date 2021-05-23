package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticOperationTest {
	ArithmeticOperation ao = new ArithmeticOperation();
	@Test
	public void addtest() {
		assertEquals(11,ao.add(5, 6));
	}
	@Test
	public void subtest() {
		assertEquals(11,ao.sub(21, 10));
	}
	@Test
	public void multest() {
		assertEquals(110,ao.mul(11, 10));
	}
	@Test
	public void divtest() {
		assertEquals(10,ao.div(40, 4));
	}
}
