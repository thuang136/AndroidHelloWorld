package com.example.dialog;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

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
	
	public void onActivityResult(int requestCode, int resultCode, Intent data) 
	{
		if(requestCode == 1)
		{
			if(resultCode == RESULT_OK)
			{
				Toast.makeText(this, data.getData().toString(), Toast.LENGTH_SHORT).show();
			}
		}
    }
	
	

}
