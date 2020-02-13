package com.example.enigmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {
    TextView txt;
    String data4;
    Button hint;
    String sol[];
    TextView hintt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        sol = getResources().getStringArray(R.array.Solutions);

        txt= findViewById(R.id.txt);
        hintt= findViewById(R.id.hintt);
        getData();
        setData();

        //lamba ta3 hint f paga talya
        hint=findViewById(R.id.hint);
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void getData(){
        if(getIntent().hasExtra("data4")){
            data4= getIntent().getStringExtra("data4");


        }else{
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){

        txt.setText(data4);
    }
}
