package com.example.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;

public class FragmentActivity extends Activity{

	 public void onCreate(Bundle savedInstanceState)
	 {
		 super.onCreate(savedInstanceState);
		 
		 FragmentManager fragmentManager = getFragmentManager();
		 
		 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		 
		 WindowManager wm = getWindowManager();
		 
		 Display d = wm.getDefaultDisplay();
		 
		 Point outSize = new Point();
		 
		 d.getSize(outSize);
		 
		 if(outSize.x > outSize.y)
		 {
			 Fragment1 fragment1 = new Fragment1();
			 fragmentTransaction.replace(android.R.id.content, fragment1);
		 }
		 else
		 {
			 Fragment2 fragment2 = new Fragment2();
			 fragmentTransaction.replace(android.R.id.content, fragment2);
		 }
		 
		 fragmentTransaction.commit();
		 
	 }
	 
	 
	 public void onConfigurationChanged(Configuration newConfig)
	 {
		 FragmentManager fragmentManager = getFragmentManager();
		 
		 FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		 
		 super.onConfigurationChanged(newConfig);
		 if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
		 {
			 Fragment2 fragment2 = new Fragment2();
			 fragmentTransaction.replace(android.R.id.content, fragment2);
		 }
		 else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
		 {
			 Fragment1 fragment1 = new Fragment1();
			 fragmentTransaction.replace(android.R.id.content, fragment1);
		 }
		 fragmentTransaction.commit();
	 }
}
