package com.example.hyeji.gomini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class WriteActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        final EditText edittext = (EditText) findViewById(R.id.edittext);
        Button button = (Button) findViewById(R.id.button);
    }

}

