package com.aptitudeguru.dashboard.page.main;

import java.util.Locale;

import junit.framework.TestCase;

import org.junit.Test;

import com.aptitudeguru.dashboard.lib.DatabaseHandler;

//Ensures the correct database table loads for the current device locale
public class TestLocaleTableLoads extends TestCase {


	
	@Test
	public void testTableUK(){
		Locale.setDefault(Locale.UK);
		MainPageHome.getLocale();
		assertEquals(DatabaseHandler.TABLE_QUANTS, "quantsUK");
	}
	
	@Test
	public void testTableUS(){
		Locale.setDefault(Locale.US);
		MainPageHome.getLocale();
		assertEquals(DatabaseHandler.TABLE_QUANTS, "quantsUS");
	}
	
	@Test
	public void testTableFR(){
		Locale.setDefault(Locale.FRANCE);
		MainPageHome.getLocale();
		assertEquals(DatabaseHandler.TABLE_QUANTS, "quantsFR");
	}
}
