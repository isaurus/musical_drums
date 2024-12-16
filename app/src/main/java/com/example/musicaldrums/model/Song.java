package com.example.musicaldrums.model;

public class Song {

    private int songId;
    private String songTitle;
    private int rawResource;

    public Song(){}

    public Song(int songId, String songTitle, int rawResource) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.rawResource = rawResource;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public int getRawResource() {
        return rawResource;
    }

    public void setRawResource(int rawResource) {
        this.rawResource = rawResource;
    }
}
