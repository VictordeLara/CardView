package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclePostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclePostagem = findViewById(R.id.recyclerPostagem);

        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclePostagem.setLayoutManager( layoutManager );

        //adapter
        //recyclePostagem.setAdapter();

    }
}