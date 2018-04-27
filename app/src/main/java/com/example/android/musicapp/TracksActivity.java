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

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.tracks_layout );

        Intent intent = getIntent();
        Album album = (Album) intent.getSerializableExtra( "albumObject" );

        final ArrayList<Track> tracks = album.getmTracks();

        TrackAdapter adapter = new TrackAdapter( this, tracks);

        ListView listView = (ListView) findViewById( R.id.list );
        listView.setAdapter( adapter );

/*        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Track track = tracks.get( position );

                Intent intent = new Intent( TracksActivity.this, AlbumsActivity.class );
                intent.putExtra( "albumObject", (Serializable) album );
                startActivity( intent );

            }
        } );*/
    }

}
