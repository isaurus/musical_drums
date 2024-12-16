package com.example.musicaldrums.controller;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class MediaController {

    private MediaPlayer mp;
    private final SoundPool sp = new SoundPool.Builder().setMaxStreams(3).build();
    private final int[] sonId = new int[3];
    private Context ctx;

    public MediaController(){}

    public void playSong(Context ctx, int resId){
        this.ctx = ctx;

        if (mp == null){
            mp = MediaPlayer.create(ctx, resId);
            mp.start();
        } else if (!mp.isPlaying() && mp != null) {
            mp.stop();
            mp.release();
        }
    }

}
