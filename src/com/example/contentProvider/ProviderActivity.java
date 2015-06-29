package com.example.contentProvider;
import com.example.contentProvider.R;

import android.app.ListActivity;
import android.content.CursorLoader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.CursorAdapter;
import android.widget.SimpleCursorAdapter;

public class ProviderActivity extends ListActivity {

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.listview);
		
		Uri allContacts = ContactsContract.Contacts.CONTENT_URI;
		
		CursorLoader cursorLoader = new CursorLoader(this,allContacts,null,null,null,null);
		
		Cursor c = cursorLoader.loadInBackground();
		
		String[] columns = new String[] {
				ContactsContract.Contacts.DISPLAY_NAME,
				ContactsContract.Contacts._ID
		};
		
		int[] views = new int[] {R.id.text1,R.id.text2};
		
		SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,R.layout.listview,c,columns,views,CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
		
		this.setListAdapter(adapter);
		
	}
}
