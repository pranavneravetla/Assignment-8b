package com.example.oakridge.appdevelopment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Rainbow extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainbow);
        TextView color1=(TextView)findViewById(R.id.red);
        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Red",Toast.LENGTH_LONG).show();
            }

        });
        TextView color2=(TextView)findViewById(R.id.orange);
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Orange",Toast.LENGTH_LONG).show();
            }

            });
        TextView color3=(TextView)findViewById(R.id.yellow);
        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Yellow",Toast.LENGTH_LONG).show();
            }

        });
        TextView color4=(TextView)findViewById(R.id.green);
        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Green",Toast.LENGTH_LONG).show();
            }

        });
        TextView color5=(TextView)findViewById(R.id.blue);
        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Blue",Toast.LENGTH_LONG).show();
            }

        });
        TextView color6=(TextView)findViewById(R.id.indigo);
        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this,"You clicked Indigo",Toast.LENGTH_LONG).show();
            }

        });
        TextView color7=(TextView)findViewById(R.id.violet);
        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Rainbow.this, "You clicked Violet",Toast.LENGTH_LONG).show();
            }
        });




    }
}
