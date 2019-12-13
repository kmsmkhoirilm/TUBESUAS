package com.example.futsalken;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button but1 = findViewById(R.id.btn);
        Button but2 = findViewById(R.id.btn1);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent int1 = new Intent(home.this, PicActivity.class);
                startActivity(int1);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int2 = new Intent(home.this, MainActivity.class);
                startActivity(int2);
            }
        });
    }
}
