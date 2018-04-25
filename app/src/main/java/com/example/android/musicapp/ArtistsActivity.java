package com.example.android.musicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.artists_layout );


        final ArrayList<Artist> artists = loadAllArtistsAlbumsTracks();
        ArtistAdapter adapter = new ArtistAdapter( this, artists );

        ListView listView = (ListView) findViewById( R.id.list );
        listView.setAdapter( adapter );



        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Artist artist = artists.get( position );
                if(artist != null) {
                    Intent intent = new Intent( ArtistsActivity.this, AlbumsActivity.class );
                    intent.putExtra( "artistObject", artist );
                    startActivity( intent );
                }
            }
        } );


    }

    private ArrayList<Artist> loadAllArtistsAlbumsTracks() {

        // Michael Jackson
        final ArrayList<Track> tracksForAlbum1Michael = new ArrayList<>(  );
        tracksForAlbum1Michael.add( new Track(  "Unbreakable", 130000) );
        tracksForAlbum1Michael.add( new Track(  "Heartbreaker", 230000) );
        tracksForAlbum1Michael.add( new Track(  "Break of Dawn", 340000) );
        tracksForAlbum1Michael.add( new Track(  "Heaven Can Wait", 280000) );

        final ArrayList<Album> albumsMichael = new ArrayList<>(  );
        albumsMichael.add(new Album("Invincible", tracksForAlbum1Michael));


        final ArrayList<Artist> artists = new ArrayList<>(  );
        artists.add( new Artist( "Michael Jackson", "Good boy." ) );
        artists.get( 0 ).setmAlbums( albumsMichael );
        artists.get( 0 ).getmAlbums().get( 0 ).setmTracks( tracksForAlbum1Michael );

        // Beyonce
        final ArrayList<Track> tracksForAlbum1Beyonce = new ArrayList<>(  );
        tracksForAlbum1Beyonce.add( new Track(  "Crazy in Love", 130000) );
        tracksForAlbum1Beyonce.add( new Track(  "Naughty Girl", 230000) );
        tracksForAlbum1Beyonce.add( new Track(  "That’s How You Like It", 340000) );
        tracksForAlbum1Beyonce.add( new Track(  "Baby Boy", 19000) );
        tracksForAlbum1Beyonce.add( new Track(  "Hip Hop Star", 345000) );
        tracksForAlbum1Beyonce.add( new Track(  "Be With You", 316000) );


        final ArrayList<Album> albumsBeyonce = new ArrayList<>(  );
        albumsBeyonce.add(new Album("Dangerously in Love", tracksForAlbum1Beyonce));


        artists.add( new Artist( "Beyonce", "Good girl." ) );
        artists.get( 1 ).setmAlbums( albumsBeyonce );
        artists.get( 1 ).getmAlbums().get( 0 ).setmTracks( tracksForAlbum1Beyonce );


        return artists;
    }
}
