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
        albumsMichael.add(new Album("Invincible", R.drawable.michael_album_invincible, tracksForAlbum1Michael));


        final ArrayList<Artist> artists = new ArrayList<>(  );
        artists.add( new Artist( "Michael Jackson", "Known as the King of Pop, Michael Joseph Jackson (August 29, 1958 to June 25, 2009) was a best-selling American singer, songwriter and dancer.", R.drawable.michael ) );
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
        albumsBeyonce.add(new Album("Dangerously in Love", R.drawable.beyonce_album_dangerously_in_love, tracksForAlbum1Beyonce));


        artists.add( new Artist( "Beyonce", "Beyoncé was born & raised in Houston, Texas. Her father, Mathew Knowles, manages Destiny's Child. Her mother, Tina Knowles designs their glittering costumes. Solange, her sister (they're about 5 years apart), has released her debut album.", R.drawable.beyonce ) );
        artists.get( 1 ).setmAlbums( albumsBeyonce );
        artists.get( 1 ).getmAlbums().get( 0 ).setmTracks( tracksForAlbum1Beyonce );

        // Mika Album1
        final ArrayList<Track> tracksForAlbum1Mika = new ArrayList<>(  );
        tracksForAlbum1Mika.add( new Track(  "Talk About You", 202000) );
        tracksForAlbum1Mika.add( new Track(  "All She Wants", 223000) );
        tracksForAlbum1Mika.add( new Track(  "Last Party", 240000) );
        tracksForAlbum1Mika.add( new Track(  "Starting at the Sun", 280000) );
        tracksForAlbum1Mika.add( new Track(  "Hurts", 130000) );
        tracksForAlbum1Mika.add( new Track(  "Good Wife", 230000) );
        tracksForAlbum1Mika.add( new Track(  "Rio", 340000) );
        tracksForAlbum1Mika.add( new Track(  "Porcelain", 280000) );
        tracksForAlbum1Mika.add( new Track(  "Promiseland", 340000) );
        tracksForAlbum1Mika.add( new Track(  "Ordinary Man", 280000) );


        final ArrayList<Album> albumsMika = new ArrayList<>(  );
        albumsMika.add(new Album("No Place In Heaven", R.drawable.mika_album_no_place_in_heaven, tracksForAlbum1Mika));


        artists.add( new Artist( "Mika", "ika stylised as MIKA, is a Lebanese-born English singer and songwriter. After recording his first extended play, Dodgy Holiday, Mika was named the number-one predicted breakthrough act of 2007 in an annual BBC poll of music critics, Sound of 2007. ", R.drawable.mika ) );
        artists.get( 2 ).setmAlbums( albumsMika );
        artists.get( 2 ).getmAlbums().get( 0 ).setmTracks( tracksForAlbum1Mika );

        // Mika Album2
        final ArrayList<Track> tracksForAlbum2Mika = new ArrayList<>(  );
        tracksForAlbum2Mika.add( new Track(  "Lola", 202000) );
        tracksForAlbum2Mika.add( new Track(  "Stardust", 223000) );
        tracksForAlbum2Mika.add( new Track(  "Make you happy", 240000) );
        tracksForAlbum2Mika.add( new Track(  "Underwater", 280000) );
        tracksForAlbum2Mika.add( new Track(  "Overrated", 130000) );
        tracksForAlbum2Mika.add( new Track(  "Kids", 230000) );
        tracksForAlbum2Mika.add( new Track(  "Emily", 340000) );
        tracksForAlbum2Mika.add( new Track(  "Heroes", 280000) );
        tracksForAlbum2Mika.add( new Track(  "Step With Me", 340000) );
        tracksForAlbum2Mika.add( new Track(  "Celebrate", 280000) );


        albumsMika.add(new Album("The Origin of Love", R.drawable.mika_album_the_origin_of_love,tracksForAlbum2Mika));

        artists.get( 2 ).setmAlbums( albumsMika );
        artists.get( 2 ).getmAlbums().get( 1 ).setmTracks( tracksForAlbum1Mika );




        return artists;
    }
}
