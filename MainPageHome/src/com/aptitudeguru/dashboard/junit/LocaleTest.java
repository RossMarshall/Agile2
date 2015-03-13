package com.aptitudeguru.dashboard.junit;

import static org.junit.Assert.*;
import java.util.Locale;
import org.junit.*;
import com.aptitudeguru.dashboard.page.main.MainPageHome;

public class LocaleTest {

	@Test
	public void set_locale() throws Exception {
		//Locale setLoc = new Locale("en-gb");
		//Locale.setDefault(setLoc);
		MainPageHome mph = new MainPageHome();
		assertFalse(mph.getLocale(1) == 1);
	}

}
