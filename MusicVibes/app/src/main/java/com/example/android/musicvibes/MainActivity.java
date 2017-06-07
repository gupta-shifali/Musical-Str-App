package com.example.android.musicvibes;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicvibes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent now_playing_activity = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(now_playing_activity);
            }
        });
        binding.playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlist_activity = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlist_activity);
            }
        });
        binding.albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albums_activity = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albums_activity);
            }
        });
        binding.songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs_activity = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songs_activity);
            }
        });
        binding.settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settings_activity = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settings_activity);
            }
        });
    }
}
