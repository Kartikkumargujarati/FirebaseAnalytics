package com.kartik.firebaseanalytics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.kartik.firebaseanalytics.MainActivity.EXTRA_MESSAGE;

public class Screen2Activity extends AppCompatActivity {

	private TextView textView;
	private Button button;
/* -------------------------------------- Lifecycle Methods -------------------------------------- */
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen2);

		textView = (TextView) findViewById(R.id.textview2);
		textView.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
		button = (Button) findViewById(R.id.backbtn_2);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (final View v) {
				Screen2Activity.super.onBackPressed();
			}
		});
	}
/* ------------------------------------ End Lifecycle Methods ------------------------------------ */
}
