package com.a;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/* Tera bhagwan hi bhala kare
 	mere main kahan jaye hai
 	safdsfsfs
 	dado kharab thai monu
 	Sutho aaye babu chaa pyo kareen.....*/
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
