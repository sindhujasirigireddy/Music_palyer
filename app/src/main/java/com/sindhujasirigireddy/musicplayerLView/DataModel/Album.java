package com.sindhujasirigireddy.musicplayerLView.DataModel;

import java.util.ArrayList;

/**
 * Created by sindhuja.sirigireddy on 4/4/2016.
 */
public class Album
{

    public String name;
    public String imageURL;
    public ArrayList<Song> listOfSongs;

    public Album(String name, String imageURL,ArrayList<Song> songslist)
    {
        this.name=name;
        this.imageURL=imageURL;
        this.listOfSongs=songslist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getImage_url() {
        return imageURL;
    }

    public void setImage_url(String ImageURL) {
        ImageURL = ImageURL;
    }

    public int getNo_Of_Songs() {
        return listOfSongs().size();
    }


    public ArrayList<Song> listOfSongs() {
        return listOfSongs;
    }

    public void listOfSongs(ArrayList<Song> songslist) {
        listOfSongs = songslist;
    }
}
