package com.example.musicaldrums.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

import com.example.musicaldrums.R;

public class MediaController {

    private Context ctx;
    private MediaPlayer mp;
    private DataManager dataManager;
    private final SoundPool sp = new SoundPool.Builder().setMaxStreams(2).build();
    private final int[] songId = new int[2];

    public MediaController(){
    }

    public void loadSoundsToSoundPool(Context ctx){
        this.ctx = ctx;
        songId[0] = sp.load(ctx, R.raw.drum, 1);
        songId[1] = sp.load(ctx, R.raw.cymbal, 1);
    }


    public void playSong(Context ctx, int resId){
        this.ctx = ctx;

        if (mp == null){
            mp = MediaPlayer.create(ctx, resId);
        } else if(!mp.isPlaying() && mp != null){
            mp.seekTo(mp.getCurrentPosition());
            mp.start();
        } else if(mp.isPlaying() && mp != null){
            mp.stop();
            mp.release();
            mp = null;
            mp = MediaPlayer.create(ctx, resId);
        }
        mp.start();
    }

    public void stopMusic(){
        if(mp != null){
            mp.stop();
            mp = null;
        }
    }
    public void playDrumSound(){
        sp.play(songId[0], 1, 1, 1, 0, 1);
    }
    public void playCymbalSound(){
        sp.play(songId[1], 1, 1, 1, 0, 1);
    }
}
