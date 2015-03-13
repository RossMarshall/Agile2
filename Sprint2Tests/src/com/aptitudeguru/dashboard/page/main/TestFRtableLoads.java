package com.aptitudeguru.dashboard.page.main;

import junit.framework.TestCase;

import org.junit.Test;

//Ensures the correct database table loads for the current device locale
public class TestFRtableLoads extends TestCase {

	// Locale must be changed on device prior to test
	@Test
	public void testGetLocale() {
		assertEquals(3, MainPageHome.getLocale(1));
	}
}
