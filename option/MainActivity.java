package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        txt=findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"power");
        menu.add(0,2,1,"avarage");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        float a=Float.parseFloat(e1.getText().toString());
        float b=Float.parseFloat(e2.getText().toString());
        switch(item.getItemId())
        {
            case 1: float pow=a;
                    if(b==0)
                     pow=1;
                    for(int i=1;i<b;i++)
                        pow*=a;
                    txt.setText("result of "+a+"^"+b+"is :"+pow);
                    break;
            case 2: float ans=(a+b)/2;
                    txt.setText("avarage of numbers is :"+ans);
                    break;

        }
        return true;
    }
}