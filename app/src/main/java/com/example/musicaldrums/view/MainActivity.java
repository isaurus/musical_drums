package com.example.musicaldrums.view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musicaldrums.R;
import com.example.musicaldrums.controller.DataManager;
import com.example.musicaldrums.controller.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    public void initComponents(){
        SongAdapter songAdapter = new SongAdapter();
        MediaController mediaController = new MediaController();
        DataManager dataManager = new DataManager();
        ListView lsvSongList = findViewById(R.id.lsvSongList);
        lsvSongList.setAdapter(songAdapter);
        mediaController.loadSoundsToSoundPool(this);

        ImageView imgPlay = findViewById(R.id.imgPlay);
        ImageView imgStop = findViewById(R.id.imgStop);
        ImageView imgDrum = findViewById(R.id.imgDrum);
        ImageView imgLeftCymbal = findViewById(R.id.imgLeftCymbal);
        ImageView imgRightCymbal = findViewById(R.id.imgRightCymbal);

        imgPlay.setOnClickListener(v -> mediaController.playSong(this, songAdapter.getSelectedSong().getRawResource()));

        imgDrum.setOnClickListener(v -> mediaController.playDrumSound());
        imgLeftCymbal.setOnClickListener(v -> mediaController.playCymbalSound());
        imgRightCymbal.setOnClickListener(v -> mediaController.playCymbalSound());

    }


}