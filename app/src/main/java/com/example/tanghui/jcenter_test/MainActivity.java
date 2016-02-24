package com.example.tanghui.jcenter_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.tanghui.mylibrary.TestUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestUtils testUtils = new TestUtils();
        testUtils.isDate = true;
        testUtils.setDate(false,this);
        jcenterTest();
    }
    
    private void jcenterTest() {
        Log.v("ll","kkkk");
    }
}
