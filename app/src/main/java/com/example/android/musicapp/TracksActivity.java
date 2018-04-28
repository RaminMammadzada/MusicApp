package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    static Album staticAlbum;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.tracks_layout );

        Intent intent = getIntent();
        Album album = (Album) intent.getSerializableExtra( "albumObject" );
        if(album != null) {
            staticAlbum = album;
        }

        final ArrayList<Track> tracks = staticAlbum.getmTracks();

        // banner image, name and bio of current album
        ImageView currentAlbumImage = (ImageView) findViewById( R.id.element_image_view );
        currentAlbumImage.setImageResource(staticAlbum.getmAlbumImageResourceId());
        TextView currentAlbumName = (TextView) findViewById( R.id.element_name );
        currentAlbumName.setText( staticAlbum.getmAlbumTitle() );
        TextView currentAlbumAbout = (TextView) findViewById( R.id.element_about);
        currentAlbumAbout.setVisibility( View.GONE );

        // don't show play icon in the track list of the current album
        ImageView playIcon = (ImageView) findViewById( R.id.play_icon);
        playIcon.setVisibility( View.GONE );


        TrackAdapter adapter = new TrackAdapter( this, tracks);

        ListView listView = (ListView) findViewById( R.id.list );
        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = tracks.get( position );
                if(track != null) {
                    Intent intent = new Intent( TracksActivity.this, NowPlayingActivity.class );
                    intent.putExtra( "trackObject", track );
                    startActivity( intent );
                }

            }
        } );
    }

}
