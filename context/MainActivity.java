package com.example.myapplication;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText e;
    private Button btn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e = findViewById(R.id.edit);
        btn = findViewById(R.id.btn);
        txt = findViewById(R.id.txt); // Make sure to initialize the TextView

        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select Option");
        menu.add(0, v.getId(), 0, "Factorial");
        menu.add(0, v.getId(), 0, "Square");
        menu.add(0, v.getId(), 0, "Sum_of_digit");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        String input = e.getText().toString();

        // Input validation
        if (input.isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            return true;
        }

        int num = Integer.parseInt(input);

        switch (item.getTitle().toString()) {
            case "Factorial":
                    int ans = 1;
                    for (int i = num; i > 1; i--)
                        ans *= i;
                    txt.setText("Factorial is: " + ans);
                break;
            case "Square":
                txt.setText("Square is: " + (num * num));
                break;
            case "Sum_of_digit":
                int sum=0;
                while(num>0)
                {
                    sum+=num%10;
                    num/=10;
                }
                txt.setText("sum of digit is :"+sum);
                break;
        }
        return true;
    }
}