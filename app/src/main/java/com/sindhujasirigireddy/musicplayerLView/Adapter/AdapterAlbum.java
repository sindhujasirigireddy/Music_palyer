package com.sindhujasirigireddy.musicplayerLView.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.sindhujasirigireddy.musicplayerLView.DataModel.Album;
import com.sindhujasirigireddy.musicplayerLView.R;

import java.util.List;

/**
 * Created by sindhuja.sirigireddy on 4/4/2016.
 */
public class AdapterAlbum extends ArrayAdapter<Album> {
    static class ViewHolder{
        TextView txtTitle;
        TextView SongCount ;
        ImageView albumImage;
    }
    private Activity context;
    private List<Album> albumList;

    public AdapterAlbum(Activity context, List<Album> albumlist)
    {
        super(context,0,albumlist);
        this.context=context;
        this.albumList=albumlist;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Album album = albumList.get(position);
        ViewHolder viewHolder;
        LayoutInflater inflater = context.getLayoutInflater();
        View convertView=view;
        if(convertView ==null)
        {
            convertView= inflater.inflate(R.layout.activity_each_album, null, true);
            viewHolder=new ViewHolder();
            viewHolder.txtTitle = (TextView) convertView.findViewById(R.id.album_nameTV);
            viewHolder.SongCount = (TextView) convertView.findViewById(R.id.No_Of_SongsTV);
            viewHolder.albumImage = (ImageView) convertView.findViewById(R.id.albumIV);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder)convertView.getTag();
        }
        if(album != null) {
            viewHolder.txtTitle.setText(album.getName());
            viewHolder.SongCount.setText("songs:"+""+album.getNo_Of_Songs()+"");
            Glide.with(context).load(album.getImage_url()).centerCrop().into(viewHolder.albumImage);
        }
        return convertView;
    }

}




