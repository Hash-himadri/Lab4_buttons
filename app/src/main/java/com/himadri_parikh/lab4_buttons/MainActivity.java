package com.himadri_parikh.lab4_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 1 - local instances
    EditText edtName, edtCity;
    Button btnSubmit;
    String name, city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2 - binding views
        edtName = findViewById(R.id.edtName);
        edtCity = findViewById(R.id.edtCity);
        btnSubmit = findViewById(R.id.btnSubmit);
    }
    //Step 3 - implement listener
    public void onSubmitClick(View view) {
        name = edtName.getText().toString();
        city = edtCity.getText().toString();

        Toast.makeText(MainActivity.this, name+" lives in "+city,
                Toast.LENGTH_SHORT).show();
    }
}