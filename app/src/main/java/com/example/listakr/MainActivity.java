package com.example.listakr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.Spinner1);
        final String[] planetas= {"Mercurio","Venus","Tierra","Marte","Júpiter","Saturno","Urano","Neptuno"};
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planetas);
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,planetas));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), (String) parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show ();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}