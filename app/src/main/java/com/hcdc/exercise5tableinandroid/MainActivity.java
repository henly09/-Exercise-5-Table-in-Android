package com.hcdc.exercise5tableinandroid;

// Author: John Henly A. Montera
// Course: BSIT-3rd-Year
// CC106[01527]

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText val1main, val2main;
    TextView[] v = new TextView[9];
    Button insertbuttonmain;
    int inc = 0;
    String wholetext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        val1main = findViewById(R.id.val1);
        val2main = findViewById(R.id.val2);
        insertbuttonmain = findViewById(R.id.insertbutton);

        v[0] = (TextView) findViewById(R.id.value1);
        v[1] = (TextView) findViewById(R.id.value2);
        v[2] = (TextView) findViewById(R.id.value3);
        v[3] = (TextView) findViewById(R.id.value4);
        v[4] = (TextView) findViewById(R.id.value5);
        v[5] = (TextView) findViewById(R.id.value6);
        v[6] = (TextView) findViewById(R.id.value7);
        v[7] = (TextView) findViewById(R.id.value8);
        v[8] = (TextView) findViewById(R.id.value9);


        insertbuttonmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (v.length == inc) {
                    Toast.makeText(getBaseContext(), " You cannot enter more data! Error 404",Toast.LENGTH_LONG).show();

                }
                else {
                    wholetext = val1main.getText().toString() + val2main.getText().toString();

                    v[inc].setText(wholetext);

                    inc++;
                }
            }
        });


    }
}