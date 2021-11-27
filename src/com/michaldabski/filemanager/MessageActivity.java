package com.michaldabski.filemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//public class MessageActivity extends AppCompatActivity {
public class MessageActivity extends android.app.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
}