package org.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Hello extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        String strName;
		strName=MatchLib.matching("test");
		Log.e("karn", strName.toString());
    }
}