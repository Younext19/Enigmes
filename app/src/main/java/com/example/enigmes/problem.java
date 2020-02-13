package com.example.enigmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class problem extends AppCompatActivity {
    String s1[], s3[],s4[];
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);


        recyclerView = findViewById(R.id.r);
        recyclerView.setHasFixedSize(true);

        s1 = getResources().getStringArray(R.array.Subject);
        s3 = getResources().getStringArray(R.array.Numbers);
        s4 = getResources().getStringArray(R.array.Problems);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter myAdapter = new MyAdapter(this, s1, s3, s4);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
