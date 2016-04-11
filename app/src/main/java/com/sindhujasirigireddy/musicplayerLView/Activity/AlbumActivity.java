package com.sindhujasirigireddy.musicplayerLView.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.sindhujasirigireddy.musicplayerLView.Adapter.AdapterAlbum;
import com.sindhujasirigireddy.musicplayerLView.DataModel.Album;
import com.sindhujasirigireddy.musicplayerLView.R;
import com.sindhujasirigireddy.musicplayerLView.DataModel.Song;
import com.sindhujasirigireddy.musicplayerLView.Utility.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlbumActivity extends AppCompatActivity {
   GridView albumGridView;
   List<Album> albumList=new ArrayList<Album>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        albumList.add(new Album("Bahubali","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGUUtSKYXI_SEp-aBtu-jlsuzW4btW7QuLP1GHxUEDqHA4NRPH",
                new ArrayList<Song>() {
                    {
                        add(new Song("Bahubali_Song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Bahubali_Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Bahubali_Song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Bahubali_Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("Chennai Express","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSYQ7kRqNDYxjfETSNaTfDGma_bpGmR8x4-GcjYUTD6x4V6eebA",
                new ArrayList<Song>() {
                    {
                        add(new Song("Chennai Express Song1fgfffffffffffffffffff", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Chennai Express Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Chennai Express Song3gfgdfgsdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsdf", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Chennai Express Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("Bangulore Days", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR5JkHZBgSBqYrZok0_OikywilgWuOZYzczNmDM4RlVKneuE-v64w",
                new ArrayList<Song>() {
                    {
                        add(new Song("Bangulore Days song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Bangulore Days song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Bangulore Days song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Bangulore Days song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("Bajirao mastani", "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRF8rLr9HTfHaeXzqnIjSGzSukIPxbHJ_HW_Z_dnFXcYAvX2OY9rg",
                new ArrayList<Song>() {
                    {
                        add(new Song("Bajirao mastani Song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Bajirao mastani Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Bajirao mastani Song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Bajirao mastani Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("3 idiots","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR3Kdw847vzo6U-22oKtTFYQED0Jauhra0K4vLnFphKycTbU86v4A",
                new ArrayList<Song>() {
                    {
                        add(new Song("3 idiots Song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("3 idiots Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("3 idiots Song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("3 idiots Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("Neerja","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSKTD33DZZFIJpas2XKoZKmlZ0e_-uSdUjP1nmGMMpcmRVMloZT",
                new ArrayList<Song>() {
                    {
                        add(new Song("Neerja Song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Neerja Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Neerja Song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Neerja Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));

        albumList.add(new Album("Lagaan", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDXIaBd8dG8Mzf0fkQElvsolIhtUKw8GGAyQ1RxYm1qp8ja3ltJw",
                new ArrayList<Song>() {
                    {
                        add(new Song("Lagaan Song1", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:07"));
                        add(new Song("Lagaan Song2", new ArrayList<String>(Arrays.asList("singer1,singer2")),"04:50" ));
                        add(new Song("Lagaan Song3", new ArrayList<String>(Arrays.asList("singer1,singer2")),"05:10" ));
                        add(new Song("Lagaan Song4", new ArrayList<String>(Arrays.asList("singer1,singer2")), "04:02"));

                    }
                }));


        AdapterAlbum albumAdapter=new AdapterAlbum(AlbumActivity.this,albumList);

        albumGridView=(GridView)findViewById(R.id.albumgv);
        albumGridView.setAdapter(albumAdapter);
        albumGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedAlbum = albumList.get(position).getName();
                Util.album = albumList.get(position);
                Toast.makeText(getApplicationContext(), selectedAlbum + " " + "selected.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SongActivity.class);
                startActivity(intent);
            }
        });
}


        }


