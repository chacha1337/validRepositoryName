package com.nothingwrotehere.validprojectname;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btnAct2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAct2 = (Button)findViewById(R.id.btnAct2);
        btnAct2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ActivityToNext.class);
                startActivity(intent);

        }
    }
