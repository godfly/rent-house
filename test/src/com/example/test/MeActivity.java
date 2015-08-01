package com.example.test;

import com.example.test.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MeActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_me);
		LinearLayout mLinear = (LinearLayout) findViewById(R.id.MeLinear);
		mLinear.setBackgroundResource(R.drawable.ic_splash_screen2);
	}
}
