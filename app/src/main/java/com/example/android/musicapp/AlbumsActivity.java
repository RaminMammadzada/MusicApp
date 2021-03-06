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

public class AlbumsActivity extends AppCompatActivity {

    static Artist staticArtist;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.albums_layout );

        Intent intent = getIntent();
        Artist artist = (Artist) intent.getSerializableExtra( "artistObject" );

        if(artist != null){
            staticArtist = artist;
        }

        final ArrayList<Album> albums = staticArtist.getmAlbums();

        // banner image, name and bio of current artist
        ImageView currentArtistImage = (ImageView) findViewById( R.id.element_image_view );
        currentArtistImage.setImageResource(staticArtist.getmArtistImageResourceId());
        TextView currentArtistName = (TextView) findViewById( R.id.element_name );
        currentArtistName.setText( staticArtist.getmArtistFullname() );
        TextView currentArtistAbout = (TextView) findViewById( R.id.element_about);
        currentArtistAbout.setText( staticArtist.getmArtistAbout() );
        // don't show play icon in album list of the current artist
        ImageView playIcon = (ImageView) findViewById( R.id.play_icon);
        playIcon.setVisibility( View.GONE );


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
