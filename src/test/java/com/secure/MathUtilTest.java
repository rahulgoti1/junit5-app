package com.secure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {

	@Test
	void testAdd() {
		MathUtil mathUtil = new MathUtil();
		int expected = 2;
		int actual = mathUtil.add(1, 1);
		assertEquals(expected, actual);
	}

	@Test
	void testComputeCircleRadius() {
		MathUtil mathUtil = new MathUtil();
		assertEquals(314.1592653589793, mathUtil.computeCircleArea(10), "Should return Circle Area");
	}
}
