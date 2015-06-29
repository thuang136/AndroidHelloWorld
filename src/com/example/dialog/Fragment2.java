package com.example.dialog;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.contentProvider.*;
public class Fragment2 extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container,false);
    }
    
    
    public void onStart()
    {
    	super.onStart();
    	Button btn = (Button)this.getActivity().findViewById(R.id.btnFrag2);
    	btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent();
		    	data.setData(Uri.parse("in fragment2"));
		    	Activity activity = Fragment2.this.getActivity();
		    	activity.setResult(Activity.RESULT_OK, data);
		    	activity.finish();
			}
		});
    	
    	Log.d("fragment","onStart");
    	
    }
    
    public void onAttach(Activity activity)
    {
    	super.onAttach(activity);
    	Log.d("fragment","onAttach");
    }
    
    public void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
    	Log.d("fragment","onCreate");
    }
    
    public void onActivityCreated(Bundle savedInstanceState) 
    {
    	super.onActivityCreated(savedInstanceState);
    	Log.d("fragment","onActivityCreated");
    }
    
    public void onResume()
    {
    	super.onResume();
    	Log.d("fragment","onResume");
    }
    
    public void onPause()
    {
    	super.onPause();
    	Log.d("fragment","onPause");
    }
    
    public void onStop()
    {
    	super.onStop();
    	Log.d("fragment","onStop");
    }
    
    public void onDestroyView()
    {
    	super.onDestroyView();
    	Log.d("fragment","onDestroyView");
    }
    
    public void onDestroy()
    {
    	super.onDestroy();
    	Log.d("fragment","onDestroy");
    }
    
    public void onDetach()
    {
    	super.onDetach();
    	Log.d("fragment","onDetach");
    }
}
