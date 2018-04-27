package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity{

    TextView playingTrack;
    TextView trackDuration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.now_playing_layout );

        Intent intent = getIntent();
        Track track = (Track) intent.getSerializableExtra( "trackObject" );

        playingTrack = findViewById( R.id.now_playing_track_name);
        playingTrack.setText( track.getmTrackName() );

        trackDuration = findViewById( R.id.track_duration_in_milliseconds );
        trackDuration.setText( track.getmDurationInMillisecond() + " milliseconds" );



    }
}
