package com.example.dialog;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.contentProvider.*;
public class Fragment1 extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container,false);
    }
    
    public void onStart()
    {
    	super.onStart();
    	Button btn = (Button)this.getActivity().findViewById(R.id.btnFrag1);
    	btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent();
		    	data.setData(Uri.parse("in fragment1"));
		    	Activity activity = Fragment1.this.getActivity();
		    	activity.setResult(Activity.RESULT_OK, data);
		    	activity.finish();
			}
		});
    	
    }
}
