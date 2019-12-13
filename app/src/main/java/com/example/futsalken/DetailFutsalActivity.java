package com.example.futsalken;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailFutsalActivity extends AppCompatActivity {

    public static String EXTRA_PLAYER = "extra_player";
    TextView tvAddress, tvNama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_futsal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvAddress = findViewById(R.id.tvAddress);
        tvNama = findViewById(R.id.tvNama);

        final EditText et_input1 = findViewById(R.id.et_input1);
        final EditText et_input =  findViewById(R.id.et_input);
        Button btn =  findViewById(R.id.resetbutton);

        FutsalItem futsalItem =  getIntent().getParcelableExtra(EXTRA_PLAYER);

        String no = futsalItem.getAddress();
        String name = futsalItem.getName();

        tvAddress.setText(no);
        tvNama.setText(name);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_input1.setText("");
                et_input.getText().clear();
                Toast.makeText(getApplicationContext(),"Terima Kasih, kritik dan saran anda telah terkirim",Toast.LENGTH_LONG).show();
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
