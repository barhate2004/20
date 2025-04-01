package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Name, Department, Course, Year;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etName);
        Department = findViewById(R.id.etDept);
        Course = findViewById(R.id.etCourse);
        Year = findViewById(R.id.etYear);
        submitButton = findViewById(R.id.btnSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                intent.putExtra("NAME", Name.getText().toString());
                intent.putExtra("DEPARTMENT", Department.getText().toString());
                intent.putExtra("COURSE", Course.getText().toString());
                intent.putExtra("YEAR", Year.getText().toString());
                startActivity(intent);
            }
        });
    }
}