package com.example.musicaldrums.view;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.musicaldrums.R;
import com.example.musicaldrums.controller.DataManager;
import com.example.musicaldrums.controller.MediaController;

public class SongAdapter extends BaseAdapter {

    private DataManager dataManager;
    private MediaController mediaController;

    public SongAdapter(){
        this.dataManager = new DataManager();
        this.mediaController = new MediaController();
    }
    @Override
    public int getCount() {
        return dataManager.getSongList().size();
    }

    @Override
    public Object getItem(int position) {
        return dataManager.getSong(position);
    }

    @Override
    public long getItemId(int position) {
        return dataManager.getSong(position).getSongId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, null);

        TextView txtSongTitle = convertView.findViewById(R.id.txtSongTitle);
        txtSongTitle.setText(dataManager.getSong(position).getSongTitle());

        convertView.setOnClickListener(v -> mediaController.playSong(parent.getContext(), dataManager.getSong(position).getRawResource()));

        return convertView;
    }
}
