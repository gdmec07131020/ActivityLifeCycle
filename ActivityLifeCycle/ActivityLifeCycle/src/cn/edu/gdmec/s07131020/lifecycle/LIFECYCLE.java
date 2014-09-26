package cn.edu.gdmec.s07131020.lifecycle;

import cn.gdmec.s07131020.lifecycle.R;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.Menu;
import android.util.*;
public class LIFECYCLE extends Activity {



	private static final String TAG = "LIFECYCLE"; 


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
	
		super.onDestroy();
		Log.d(TAG, "The activity state---->onDestroy");  
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d(TAG, "The activity state---->onPause");  
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d(TAG, "The activity state---->onRestart");  
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d(TAG, "The activity state---->onResume");  
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d(TAG, "The activity state---->onStart"); 
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d(TAG, "The activity state---->onStop"); 
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
     
	     Log.d(TAG, "this is a test string ");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lifecycle, menu);
        return true;
    }
    
}
