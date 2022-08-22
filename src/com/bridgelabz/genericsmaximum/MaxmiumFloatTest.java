package com.bridgelabz.genericsmaximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxmiumFloatTest {

	@Test
	public void givenThreeFloatNumbers_whenFirstIsMax_shouldReturnFirstNumber() {
		float result=MaxmiumFloat.getMax(3.3f,2.1f,2.2f);
		assertEquals(3.3f,result,3.3f);
	}
	@Test
	public void givenThreeFloatNumbers_whenSecondIsMax_shouldReturnSecondNumber() {
		float result=MaxmiumFloat.getMax(3.3f,4.1f,2.2f);
		assertEquals(4.1f,result,4.1f);
	}
	@Test
	public void givenThreeFloatNumbers_whenThirdIsMax_shouldReturnThirdNumber() {
		float result=MaxmiumFloat.getMax(3.3f,2.1f,5.2f);
		assertEquals(5.2,result,5.2f);
	}{
		
	}

}
