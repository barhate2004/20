package com.example.datetimepicker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView tvDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        Button btnPickDate = findViewById(R.id.btnPickDate);
        Button btnPickTime = findViewById(R.id.btnPickTime);
        tvDateTime = findViewById(R.id.tvDateTime);

        // Set click listeners for buttons
        btnPickDate.setOnClickListener(v -> pickDate());
        btnPickTime.setOnClickListener(v -> pickTime());
    }

    // Method to show Date Picker
    private void pickDate() {
        Calendar calendar = Calendar.getInstance();

        // Get current date
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Open DatePickerDialog
        new DatePickerDialog(this, (view, y, m, d) -> {
            tvDateTime.setText("Selected Date: " + d + "/" + (m + 1) + "/" + y);
        }, year, month, day).show();
    }

    // Method to show Time Picker
    private void pickTime() {
        Calendar calendar = Calendar.getInstance();

        // Get current time
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        // Open TimePickerDialog
        new TimePickerDialog(this, (view, h, m) -> {
            tvDateTime.append("\nSelected Time: " + h + ":" + m);
        }, hour, minute, true).show();
    }
}
