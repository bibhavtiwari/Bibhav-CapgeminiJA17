package com.capgemini.samplemavenproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionTest {
	Addition ad =new Addition();
	@Test
	public void addTest() {
		assertEquals(11,ad.add(5, 6));
	}
	@Test
	public void addTest1() {
		int expectedResult = 13;;
		int actualResult = ad.add(7, 6);
		assertEquals(expectedResult,actualResult);
	}

}
