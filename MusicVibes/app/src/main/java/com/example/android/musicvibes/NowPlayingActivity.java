package com.example.android.musicvibes;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.android.musicvibes.databinding.ActivityNowPlayingBinding;

public class NowPlayingActivity extends AppCompatActivity {

    ActivityNowPlayingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_settings);

        binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(backButton);
            }
        });
    }
}
