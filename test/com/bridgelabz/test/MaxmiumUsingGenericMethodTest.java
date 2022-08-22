package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.genericsmaximum.MaxmiumUsingGenericMethod;

class MaxmiumUsingGenericMethodTest {
	@Test
	public void givenThreeStringNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		String result = MaxmiumUsingGenericMethod.getMax("xyz", "pqr", "real");
		assertEquals("xyz", result);
	}

	@Test
	public void givenThreeStringNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		String result = MaxmiumUsingGenericMethod.getMax("pqr", "xyz", "abc");
		assertEquals("xyz", result);
	}

	@Test
	public void givenThreeStringNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		String result = MaxmiumUsingGenericMethod.getMax("abc", "pwr", "xyz");
		assertEquals("xyz", result);
	}

	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		float result = MaxmiumUsingGenericMethod.getMax(3.3f, 2.1f, 2.2f);
		assertEquals(3.3f, result, 3.3f);
	}

	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		float result = MaxmiumUsingGenericMethod.getMax(3.3f, 4.1f, 2.2f);
		assertEquals(4.1f, result, 4.1f);
	}

	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		float result = MaxmiumUsingGenericMethod.getMax(3.3f, 2.1f, 5.2f);
		assertEquals(5.2, result, 5.2f);
	}

	@Test
	public void givenThreeNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		int result = MaxmiumUsingGenericMethod.getMax(30, 20, 10);
		assertEquals(30, result);
	}

	@Test
	public void givenThreeNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		int result = MaxmiumUsingGenericMethod.getMax(3, 20, 5);
		assertEquals(20, result);
	}

	@Test
	public void givenThreeNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		int result = MaxmiumUsingGenericMethod.getMax(3, 2, 5);
		assertEquals(5, result);
	}

}
