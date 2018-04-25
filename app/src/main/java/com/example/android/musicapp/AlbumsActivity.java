package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.albums_layout );

        Intent intent = getIntent();
        Artist artist = (Artist) intent.getSerializableExtra( "artistObject" );

        final ArrayList<Album> albums = artist.getmAlbums();

        AlbumAdapter adapter = new AlbumAdapter( this, albums );

        ListView listView = (ListView) findViewById( R.id.list );
        listView.setAdapter( adapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Album album = albums.get( position );
                if(album != null) {
                    Intent intent = new Intent( AlbumsActivity.this, TracksActivity.class );
                    intent.putExtra( "albumObject", album );
                    startActivity( intent );
                }

            }
        } );

    }
}