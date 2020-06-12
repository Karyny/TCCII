package com.example.drsmart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Include_Medicines extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include__medicines);
    }


    /*public class SpinnerExample extends healt.xml {

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            String[] arraySpinner = new String[] {
                    "1", "2", "3", "4", "5", "6", "7"
            };
            Spinner s = (Spinner) findViewById(R.id.Spinner01);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, arraySpinner);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            s.setAdapter(adapter);
        }
    }*/
}
