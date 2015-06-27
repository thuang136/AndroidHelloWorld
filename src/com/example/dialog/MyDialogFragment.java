package com.example.dialog;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;



public class MyDialogFragment extends DialogFragment{
	
	CharSequence[] items = {"Google","Apple","Microsoft"};
	boolean[] itemChecked = new boolean[items.length];
	
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Activity activity = this.getActivity();
		return new AlertDialog.Builder(activity).setIcon(R.drawable.ic_launcher)
				.setTitle("this is a dialog with some simple text")
				.setMultiChoiceItems(items, itemChecked, new DialogInterface.OnMultiChoiceClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which, boolean isChecked) {
						// TODO Auto-generated method stub
						Toast.makeText(activity, items[which] + (isChecked ? " checked!" : " unchecked"), Toast.LENGTH_SHORT).show();
						final ProgressDialog progressDialog = ProgressDialog.show(activity, "Doing something", "Please wait..",true);
						new Thread(new Runnable(){

							@Override
							public void run() {
								// TODO Auto-generated method stub
								try {
									Thread.sleep(5000);
									progressDialog.dismiss();
									activity.startActivity(new Intent("com.example.dialog.FragmentActivity"));
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}).start();
					}
				})
				.create();
        
    }

    public void onCancel(DialogInterface dialog) {
    }

    public void onDismiss(DialogInterface dialog) {
       
    }
}
