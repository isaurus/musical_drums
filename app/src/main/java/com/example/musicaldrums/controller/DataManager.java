package com.example.musicaldrums.controller;

import com.example.musicaldrums.R;
import com.example.musicaldrums.model.Song;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private final List<Song> dataSet = new ArrayList<>();

    public DataManager(){
        loadData();
    }

    public void loadData(){
        dataSet.add(new Song(1, "Don't Dream Is Over", R.raw.crowded_house_dont_dream_its_over));
        dataSet.add(new Song(2, "Enemy", R.raw.imagine_dragons_enemy));
        dataSet.add(new Song(3, "Riders On The Storm", R.raw.snoop_dogg_riders_on_the_storm));
        dataSet.add(new Song(4, "C.R.E.A.M.", R.raw.wu_tang_clan_cream));
    }

    public List<Song> getSongList(){
        return dataSet;
    }

    public Song getSong(int pos){
        return dataSet.get(pos);
    }
}
