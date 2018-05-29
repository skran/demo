package com.demo.test;

import java.math.BigDecimal;

import org.junit.Test;

public class CommonTest {
	
	@Test
	public void testDouble() {
		
		double a = 1.03;
		double b = 0.42;
		System.out.println(a - b);
		
	}
	
	@Test
	public void testBigDecimal() {
		BigDecimal aDouble = new BigDecimal(1.22);
		System.out.println(aDouble);
		
		BigDecimal aString = new BigDecimal("1.22");
		System.out.println(aString);
	}

	public void test1() {
		
	}
}
