package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String sName[], sDescription[];
    int images[] = {R.drawable.java, R.drawable.c, R.drawable.python,
                        R.drawable.cpp, R.drawable.vbnet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        sName = getResources().getStringArray(R.array.programming_languages);
        sDescription = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, sName, sDescription, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}