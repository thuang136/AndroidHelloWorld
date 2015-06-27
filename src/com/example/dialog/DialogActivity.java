package com.example.dialog;



import android.app.Activity;
import android.os.Bundle;

public class DialogActivity  extends Activity{
	
	CharSequence [] items = {"Google","Apple","Microsoft"};
	
	boolean[] itemsChecked = new boolean[items.length];
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		MyDialogFragment dialog = new MyDialogFragment();
		dialog.show(getFragmentManager(), "showDialog");
	}
	
	
	

}
