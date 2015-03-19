package com.aptitudeguru.dashboard.page.test;

import android.os.Bundle;
import androidhive.dashboard.R;

import com.aptitudeguru.dashboard.model.ModelPsychometric;
import com.aptitudeguru.dashboard.page.main.MainPage_Base;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Psychometric extends MainPage_Base {

	public final ModelPsychometric ModPsych = new ModelPsychometric();
	public static String mostLikelyString;
	public static String leastLikelyString;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.psychometric);

		//Adds the scenario and answer options the the psychometric layout
		((TextView) findViewById(R.id.scenario))
				.setText(ModPsych.getScenario());
		((TextView) findViewById(R.id.answerA)).setText(ModPsych.getAnswerA());
		((TextView) findViewById(R.id.answerB)).setText(ModPsych.getAnswerB());
		((TextView) findViewById(R.id.answerC)).setText(ModPsych.getAnswerC());
		((TextView) findViewById(R.id.answerD)).setText(ModPsych.getAnswerD());

		//Adds the values to the spinners 
		final Spinner dropdown = (Spinner) findViewById(R.id.mostLikelySpinner);
		String[] items = new String[] { "A", "B", "C", "D" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items);
		dropdown.setAdapter(adapter);

		final Spinner dropdown1 = (Spinner) findViewById(R.id.leastLikelySpinner);
		String[] items1 = new String[] { "A", "B", "C", "D" };
		ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, items1);
		dropdown1.setAdapter(adapter1);

		//Gets the choices from the spinners (via strings) and displays the appropriate response
		Button btn_getResult = (Button) findViewById(R.id.btn_getResult);
		btn_getResult.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {

				mostLikelyString = dropdown.getSelectedItem().toString();
				leastLikelyString = dropdown1.getSelectedItem().toString();

				if (mostLikelyString == leastLikelyString) {
					Toast.makeText(getApplicationContext(),
							"Your Choices cannot match", Toast.LENGTH_LONG)
							.show();
				} else {
					if (mostLikelyString == "A") {
						((TextView) findViewById(R.id.MostLikey))
								.setText(ModPsych.getResultA());
					} else if (mostLikelyString == "B") {
						((TextView) findViewById(R.id.MostLikey))
								.setText(ModPsych.getResultB());
					} else if (mostLikelyString == "C") {
						((TextView) findViewById(R.id.MostLikey))
								.setText(ModPsych.getResultC());
					} else if (mostLikelyString == "D") {
						((TextView) findViewById(R.id.MostLikey))
								.setText(ModPsych.getResultD());
					}
					if (leastLikelyString == "A") {
						((TextView) findViewById(R.id.LeastLikey))
								.setText(ModPsych.getResultA());
					} else if (leastLikelyString == "B") {
						((TextView) findViewById(R.id.LeastLikey))
								.setText(ModPsych.getResultB());
					} else if (leastLikelyString == "C") {
						((TextView) findViewById(R.id.LeastLikey))
								.setText(ModPsych.getResultC());
					} else if (leastLikelyString == "D") {
						((TextView) findViewById(R.id.LeastLikey))
								.setText(ModPsych.getResultD());
					}
				}
			}
		});
	}
}
