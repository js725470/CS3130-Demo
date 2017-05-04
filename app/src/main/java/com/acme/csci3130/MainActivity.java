package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private EditText replace;
    private TextView display;

    public void buttonOnClick(View v){
        replace = (EditText) findViewById(R.id.textView2);
        display = (TextView) findViewById(R.id.helloText);
        display.setText(replace.getText());
    }

}
//sdfsdf