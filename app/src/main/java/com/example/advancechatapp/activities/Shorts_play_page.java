package com.example.advancechatapp.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.advancechatapp.R;
import com.example.advancechatapp.adapters.VideoAdapter;
import com.example.advancechatapp.databinding.ActivityShortsPlayPageBinding;
import com.example.advancechatapp.models.Video;

import java.util.ArrayList;
import java.util.List;

public class Shorts_play_page extends AppCompatActivity {

    ActivityShortsPlayPageBinding binding;
    List<Video> videoList;
    VideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShortsPlayPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        videoList = new ArrayList<>();
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.a, "Video Title", "Video Description from Shots Activity class"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.b, "Video Title", "Video Description from Shots Activity class"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.c, "Video Title", "Video Description from Shots Activity class"));
        videoList.add(new Video("android.resource://" + getPackageName() + "/" + R.raw.d, "Video Title", "Video Description from Shots Activity class"));

        adapter = new VideoAdapter(videoList);
        binding.shortsViewPager.setAdapter(adapter);
    }
}