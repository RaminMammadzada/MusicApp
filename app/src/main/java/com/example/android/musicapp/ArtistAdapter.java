package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist>{

    public ArtistAdapter(@NonNull Context context, @NonNull ArrayList<Artist> objects ) {
        super( context, 0, objects );
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Artist currentArtist = getItem( position );

        // artist name text view
        TextView artistName = (TextView) listItemView.findViewById( R.id.element_name );
        artistName.setText( currentArtist.getmArtistFullname() );

        // Find the imageview on the list_item.xml layout with the image ID and set the current artist's image to it
        ImageView imageView = (ImageView) listItemView.findViewById( R.id.element_image_view );

        if(currentArtist.artistHasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            imageView.setImageResource(currentArtist.getmArtistImageResourceId());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        TextView aboutTextView = (TextView) listItemView.findViewById( R.id.element_about );
        aboutTextView.setText( currentArtist.getmArtistAbout() );

        // don't show play icon in artist list
        ImageView playIcon = (ImageView) listItemView.findViewById( R.id.play_icon);
        playIcon.setVisibility( View.GONE );

        return listItemView;
    }
}
