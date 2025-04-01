package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText item;
    Button add,remove;
    Spinner sp;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        remove=findViewById(R.id.remove);
        sp=findViewById(R.id.sp);
        item=findViewById(R.id.item);

        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

        add.setOnClickListener(view -> {
            String s=item.getText().toString().trim();
            if(!s.isEmpty() && !list.contains(s))
            {
                list.add(s);
                adapter.notifyDataSetChanged();
                Toast.makeText(this,"Iten added",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"invalid itemn",Toast.LENGTH_SHORT).show();

            }
        });
        remove.setOnClickListener(view -> {
            String s=item.getText().toString().trim();
            if(list.contains(s))
            {
                list.remove(s);
                adapter.notifyDataSetChanged();
                Toast.makeText(this,"item removed",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"item not found",Toast.LENGTH_SHORT).show();
            }

        });

    }
}