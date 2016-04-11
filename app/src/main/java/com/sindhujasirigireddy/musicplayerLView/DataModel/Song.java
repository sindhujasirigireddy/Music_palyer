package com.sindhujasirigireddy.musicplayerLView.DataModel;

import java.util.ArrayList;

/**
 * Created by sindhuja.sirigireddy on 4/7/2016.
 */
public class Song {
    private String songName;
    private ArrayList<String> artists;
    private String duration;
    private boolean isPlaying=false;
    private boolean isAddedToFav=false;

   public Song(String songname,ArrayList<String> artists,String duration)
    {
        this.songName=songname;
        this.artists=artists;
        this.duration=duration;
    }
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public ArrayList<String> getArtists() {
        return artists;
    }

    public void setArtists(ArrayList<String> artists) {
        this.artists = artists;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }
    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean getIsAddedToFav() {
        return isAddedToFav;
    }

    public void setIsAddedToFav(boolean isAddedToFav) {
        this.isAddedToFav = isAddedToFav;
    }
}
