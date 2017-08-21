package com.kartik.firebaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	public static final String EXTRA_MESSAGE = "com.kartik.EXTRA_MESSAGE";
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;

	/* -------------------------------------- Lifecycle Methods -------------------------------------- */
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (final View v) {
				onButtonClick(v);
			}
		});
		btn2 = (Button) findViewById(R.id.btn_2);
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (final View v) {
				onButtonClick(v);
			}
		});
		btn3 = (Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (final View v) {
				onButtonClick(v);
			}
		});
		btn4 = (Button) findViewById(R.id.btn_4);
		btn4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick (final View v) {
				onButtonClick(v);
			}
		});
	}

	/* ------------------------------------ End Lifecycle Methods ------------------------------------ */

	private void onButtonClick (final View v) {
		final View view = new View(this);
		view.setId(v.getId());
		Intent intent = null;
		switch (v.getId()){
			case R.id.btn_1:
				intent = new Intent(this, Screen1Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 1");
				break;
			case R.id.btn_2:
				intent = new Intent(this, Screen2Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 2");
				break;
			case R.id.btn_3:
				intent = new Intent(this, Screen3Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 3");
				break;
			case R.id.btn_4:
				intent = new Intent(this, Screen4Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 4");
				break;
		}
		startActivity(intent);
	}

}
