package com.kartik.firebaseanalytics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	public static final String EXTRA_MESSAGE = "com.kartik.EXTRA_MESSAGE";
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btn4;
	public FirebaseAnalytics mFirebaseAnalytics;

	/* -------------------------------------- Lifecycle Methods -------------------------------------- */
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

		btn1 = (Button) findViewById(R.id.btn_1);
		btn1.setOnClickListener(this);
		btn2 = (Button) findViewById(R.id.btn_2);
		btn2.setOnClickListener(this);
		btn3 = (Button) findViewById(R.id.btn_3);
		btn3.setOnClickListener(this);
		btn4 = (Button) findViewById(R.id.btn_4);
		btn4.setOnClickListener(this);

	}

	/* ------------------------------------ End Lifecycle Methods ------------------------------------ */

	@Override
	public void onClick(View v){

		final View view = new View(this);
		view.setId(v.getId());
		Intent intent = null;
		Bundle bundle = new Bundle();

		switch (v.getId()){
			case R.id.btn_1:
				intent = new Intent(this, Screen1Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 1");
				bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button 1 Clicked");
				break;
			case R.id.btn_2:
				intent = new Intent(this, Screen2Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 2");
				bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button 2 Clicked");

				break;
			case R.id.btn_3:
				intent = new Intent(this, Screen3Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 3");
				bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button 3 Clicked");

				break;
			case R.id.btn_4:
				intent = new Intent(this, Screen4Activity.class);
				intent.putExtra(EXTRA_MESSAGE, "Welcome to Screen 4");
				bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button 4 Clicked");

				break;
		}
		mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);

		startActivity(intent);
	}
}
