package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {

    TextView displayInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        displayInfo = findViewById(R.id.tvDisplayInfo);

        String Name = getIntent().getStringExtra("NAME");
        String Department = getIntent().getStringExtra("DEPARTMENT");
        String Course = getIntent().getStringExtra("COURSE");
        String Year = getIntent().getStringExtra("YEAR");

        String info = "Name: " + Name + "\n"+ "Department" + Department + "\n" + "Course" + Course + "\n" +
                "Year " + Year;

        displayInfo.setText(info);
    }
}