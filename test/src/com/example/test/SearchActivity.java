package com.example.test;

import com.example.test.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class SearchActivity extends Activity{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		LinearLayout mLinear = (LinearLayout) findViewById(R.id.SearchLinear);
		mLinear.setBackgroundResource(R.drawable.ic_splash_screen);
	}
}
