package com.sindhujasirigireddy.musicplayerLView.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sindhujasirigireddy.musicplayerLView.R;
import com.sindhujasirigireddy.musicplayerLView.DataModel.Song;

import java.util.ArrayList;

/**
 * Created by Bishnu.Reddy on 4/5/2016.
 */
public class AdapterSong extends ArrayAdapter<Song> {
    ViewHolder viewHolder;
    static class ViewHolder{
        ImageView playButton;
        ImageView favButton;
        TextView txtTitle;
        TextView artists;
        TextView duration;
    }
    private Activity context;
    private ArrayList<Song> input;
    public AdapterSong(Activity context, ArrayList<Song> songslist)
    {
        super(context,0,songslist);
        this.context=context;
        this.input=songslist;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        final Song song = input.get(position);
        viewHolder = new ViewHolder();;
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView=view;
        if(rowView ==null)
        {
            rowView= inflater.inflate(R.layout.activity_each_song, null, true);
            viewHolder.playButton =(ImageView)rowView.findViewById(R.id.playIB);
            viewHolder.favButton =(ImageView)rowView.findViewById(R.id.AddToFavIB);
            viewHolder.txtTitle = (TextView) rowView.findViewById(R.id.songNameTV);
            viewHolder.artists = (TextView) rowView.findViewById(R.id.artists);
            viewHolder.duration = (TextView) rowView.findViewById(R.id.Duration);
            rowView.setTag(viewHolder);
        }
        else
        {
            viewHolder =(ViewHolder)rowView.getTag();
        }

        if(song != null) {
            viewHolder.txtTitle.setText(song.getSongName());
            viewHolder.artists.setText(song.getArtists().toString());
            viewHolder.duration.setText(song.getDuration());
        }


        viewHolder.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!song.getIsPlaying()) {
                    Toast.makeText(getContext(), song.getSongName() + " is playing", Toast.LENGTH_SHORT).show();
                    ((ImageView)v).setImageResource(R.mipmap.pause);
                    song.setIsPlaying(true);
                }
                else
                {
                    ((ImageView)v).setImageResource(R.mipmap.play);
                    song.setIsPlaying(false);
                }
                }

        });

        viewHolder.favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!song.getIsAddedToFav()) {
                    Toast.makeText(getContext(), song.getSongName() + " is added to favourites", Toast.LENGTH_SHORT).show();
                    ((ImageView)v).setImageResource(R.mipmap.like_filled);
                    song.setIsAddedToFav(true);
                }
                else {
                    Toast.makeText(getContext(), song.getSongName() + " is removed from favourites", Toast.LENGTH_SHORT).show();
                    ((ImageView)v).setImageResource(R.mipmap.like);
                    song.setIsAddedToFav(false);
                }
                }
        });
        return rowView;
    }
}
