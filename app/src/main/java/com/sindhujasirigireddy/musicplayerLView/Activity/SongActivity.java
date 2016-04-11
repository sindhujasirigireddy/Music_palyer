package com.sindhujasirigireddy.musicplayerLView.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.sindhujasirigireddy.musicplayerLView.Adapter.AdapterSong;
import com.sindhujasirigireddy.musicplayerLView.DataModel.Album;
import com.sindhujasirigireddy.musicplayerLView.R;
import com.sindhujasirigireddy.musicplayerLView.Utility.Util;

/**
 * Created by Bishnu.Reddy on 4/5/2016.
 */
public class SongActivity extends AppCompatActivity {
    ListView SongListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        Album album= Util.album;
        AdapterSong songAdapter=new AdapterSong(SongActivity.this,album.listOfSongs());
        setTitle(album.getName());
        ImageView albumImage=(ImageView) findViewById(R.id.BG_albumIV);
        Glide.with(this).load(album.getImage_url()).into(albumImage);
        SongListView=(ListView) findViewById(R.id.SongLV);
        SongListView.setAdapter(songAdapter);
    }
}
