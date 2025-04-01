package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{
    EditText e1,e2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail[]={e1.getText().toString()};
                String msg=e2.getText().toString();

                Intent i=new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));

                i.putExtra(Intent.EXTRA_EMAIL,"");
                i.putExtra(Intent.EXTRA_CC,mail);
                i.putExtra(Intent.EXTRA_SUBJECT,"its a demo mail");
                i.putExtra(Intent.EXTRA_TEXT,msg);
                startActivity(Intent.createChooser(i,"mail"));
            }
        });


    }

}