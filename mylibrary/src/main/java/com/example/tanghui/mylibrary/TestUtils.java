package com.example.tanghui.mylibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class TestUtils {
    public boolean isDate = false;
    
    public TestUtils() {
        testMain();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    private void testMain() {
        Log.v("jjj","lll");
    }
    
    public void setDate(boolean b, Context context) {
        isDate = b;
        Toast.makeText(context,"wocao",Toast.LENGTH_LONG).show();
    }
}
