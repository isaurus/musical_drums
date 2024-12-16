package com.example.musicaldrums.view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicaldrums.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    public void initComponents(){
        SongAdapter songAdapter = new SongAdapter();
        ListView lsvSongList = findViewById(R.id.lsvSongList);

        lsvSongList.setAdapter(songAdapter);
    }
}