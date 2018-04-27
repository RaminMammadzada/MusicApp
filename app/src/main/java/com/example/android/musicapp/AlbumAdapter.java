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
import java.util.List;

public class AlbumAdapter extends ArrayAdapter<Album>{

    public AlbumAdapter(@NonNull Context context, @NonNull ArrayList<Album> objects ) {
        super( context, 0, objects );
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Album currentAlbum = getItem( position );

        // album name text view
        TextView albumName = (TextView) listItemView.findViewById( R.id.element_name );
        albumName.setText( currentAlbum.getmAlbumTitle() );

        // Find the imageview on the list_item.xml layout with the image ID and set the current artist's image to it
        ImageView albumImageView = (ImageView) listItemView.findViewById( R.id.element_image_view );

        if(currentAlbum.albumHasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            albumImageView.setImageResource(currentAlbum.getmAlbumImageResourceId());

            // Make sure the view is visible
            albumImageView.setVisibility(View.VISIBLE);
        }
        else {
            // Otherwise hide the ImageView (set visibility to GONE)
            albumImageView.setVisibility(View.GONE);
        }

        TextView aboutTextView = (TextView) listItemView.findViewById( R.id.element_about );
        aboutTextView.setVisibility( View.GONE );

        return listItemView;
    }
}
