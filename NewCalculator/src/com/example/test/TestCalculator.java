package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.classes.Calculator;

public class TestCalculator {
	Calculator cal = new Calculator();
	@Test
	public void testadd() {
		assertEquals("the output of addition is:", 50, cal.add(10,40));
		
	}
	@Test
	public void testmul() {
		assertEquals("the output of mul is:", 50, cal.mul(5,10));
	}
	@Test
	public void testdiv() {
		assertEquals("the output of div is:", 50, cal.div(100,2));
	}

}
