package com.example.Activity101;



import com.example.contentProvider.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Activity101Activity extends Activity{
	
	String tag = "Lifecycle";
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Log.d(tag,"in the onCreate() event");
	}
	
	public void onStart()
	{
		super.onStart();
		Log.d(tag,"in the onStart() event");
	}
	
	public void onRestart()
	{
		super.onRestart();
		Log.d(tag,"in the onRestart() event");
	}
	
	public void onResume()
	{
		super.onResume();
		Log.d(tag,"in the onResume() event");
	}
	
	public void onPause()
	{
		super.onPause();
		Log.d(tag,"in the onPause() event");
	}
	
	public void onStop()
	{
		super.onPause();
		Log.d(tag,"in the onStop() event ");
	}
	
	public void onDestroy()
	{
		super.onDestroy();
		Log.d(tag,"in the destroy event");
	}

}
