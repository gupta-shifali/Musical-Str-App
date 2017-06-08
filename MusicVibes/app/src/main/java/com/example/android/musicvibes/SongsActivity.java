package com.example.android.musicvibes;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicvibes.databinding.ActivitySongsBinding;

public class SongsActivity extends AppCompatActivity {

    ActivitySongsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_songs);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(SongsActivity.this, MainActivity.class);
                startActivity(backButton);
            }
        });
        binding.nowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowButton = new Intent(SongsActivity.this, NowPlayingActivity.class);
                startActivity(nowButton);
            }
        });
    }
}
