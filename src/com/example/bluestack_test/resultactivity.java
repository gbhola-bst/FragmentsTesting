package com.example.bluestack_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class resultactivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result_activity_layout);
		((TextView)findViewById(R.id.textView1)).setText( getIntent().getStringExtra("data")  );
	}

}
