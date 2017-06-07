package com.example.android.musicvibes;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicvibes.databinding.ActivityPlaylistBinding;

public class PlaylistActivity extends AppCompatActivity {

    ActivityPlaylistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_settings);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(backButton);
            }
        });
        binding.nowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowButton = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(nowButton);
            }
        });
    }
}
