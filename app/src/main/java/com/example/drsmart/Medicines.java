package com.example.drsmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Medicines extends AppCompatActivity {

    ImageButton btCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines);

        btCall = (ImageButton) findViewById(R.id.btInclude);

        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Medicines.this, Include_Medicines.class);
                startActivity(i);
            }
        });
    }
}
