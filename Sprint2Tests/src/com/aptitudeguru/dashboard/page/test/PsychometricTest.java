package com.aptitudeguru.dashboard.page.test;

import org.junit.Test;

import com.aptitudeguru.dashboard.page.test.Psychometric;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidhive.dashboard.R;

public class PsychometricTest extends
		ActivityInstrumentationTestCase2<Psychometric> {

	public Activity act;
	private Spinner mostSpinner;
	private Spinner leastSpinner;
	private Button button;
	private TextView tView;
	private TextView tView2;
	private String result;
	private String result2;

	public PsychometricTest() {
		super(Psychometric.class);
	}

	// Sets the values for global variables for all tests
	public void createTestConditions() {
		act = getActivity();
		mostSpinner = (Spinner) act.findViewById(R.id.mostLikelySpinner);
		leastSpinner = (Spinner) act.findViewById(R.id.leastLikelySpinner);
		button = (Button) act.findViewById(R.id.btn_getResult);
		tView = (TextView) act.findViewById(R.id.MostLikey);
		tView2 = (TextView) act.findViewById(R.id.LeastLikey);
	}

	//Ensure the spinners used to select answers for psychometric test are not null
	@Test
	public void testSpinnerForNull(){
		createTestConditions();
		assertNotNull(mostSpinner);
		assertNotNull(leastSpinner);
	}
	
	// Sets the spinner from Psychometric to different values
	// and asserts the correct response is added
	@UiThreadTest
	public void testSpinnerAtAandB() {
		createTestConditions();
		mostSpinner.setSelection(0);
		leastSpinner.setSelection(1);
		button.performClick();
		result = tView.getText().toString();
		result2 = tView2.getText().toString();
		assertEquals(
				"This is the least effective response as you are not giving the customer any direct help and you are unaware as to whether the customer has access to a computer and is able to shop 'online'.",
				result);
		assertEquals(
				"This is the most effective response as you are trying to give the customer what he wants without him having to do too much more. By telling the customer how long it will take to order, he can make an informed decision as to whether he wishes to take this option.",
				result2);
	}
	
	@UiThreadTest
	public void testSpinnerAtBandA() {
		createTestConditions();
		mostSpinner.setSelection(1);
		leastSpinner.setSelection(0);
		button.performClick();
		result = tView.getText().toString();
		result2 = tView2.getText().toString();
		assertEquals(
				"This is the least effective response as you are not giving the customer any direct help and you are unaware as to whether the customer has access to a computer and is able to shop 'online'.",
				result2);
		assertEquals(
				"This is the most effective response as you are trying to give the customer what he wants without him having to do too much more. By telling the customer how long it will take to order, he can make an informed decision as to whether he wishes to take this option.",
				result);
	}
	
	@UiThreadTest
	public void testSpinnerAtCandD() {
		createTestConditions();
		mostSpinner.setSelection(2);
		leastSpinner.setSelection(3);
		button.performClick();
		result = tView.getText().toString();
		result2 = tView2.getText().toString();
		assertEquals("A reasonable response but you are doing little to directly help the customer find the book; he will still have to make quite an effort himself.",
				result);
		assertEquals("Not a particularly appropriate response as it is, almost certainly, obvious to the customer that he could try elsewhere and so your response is not adding any value to what he already know. You have managed to make him aware of an alternative branch of More Than Pens, which is positive, but perhaps you could have offered to ring that branch to check the availability of the book before the customer set off to Alpston. You could also have improved this response by giving the customer specific details of other local bookshops and how to find them as well as the address of the Alpston More Than Pens branch.",
				result2);
	}
	
	@UiThreadTest
	public void testSpinnerAtDandC() {
		createTestConditions();
		mostSpinner.setSelection(3);
		leastSpinner.setSelection(2);
		button.performClick();
		result = tView.getText().toString();
		result2 = tView2.getText().toString();
		assertEquals("A reasonable response but you are doing little to directly help the customer find the book; he will still have to make quite an effort himself.",
				result2);
		assertEquals("Not a particularly appropriate response as it is, almost certainly, obvious to the customer that he could try elsewhere and so your response is not adding any value to what he already know. You have managed to make him aware of an alternative branch of More Than Pens, which is positive, but perhaps you could have offered to ring that branch to check the availability of the book before the customer set off to Alpston. You could also have improved this response by giving the customer specific details of other local bookshops and how to find them as well as the address of the Alpston More Than Pens branch.",
				result);
	}
}
