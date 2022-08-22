package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.genericsmaximum.Maximum;

class MaximumTest {

	@Test
	public void firstMaxTestValidator() {
	    	assertEquals(30,Maximum.findMaxInThree(30,20,10));
	}
}
