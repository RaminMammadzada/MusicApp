package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(@NonNull Context context, @NonNull ArrayList<Track> objects) {
        super( context, 0, objects );
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_item, parent, false );
        }

        Track currentTrack = getItem( position );

        // Find the textview on the list_item.xml layout with the text ID and set the current track'' name to it
        TextView currentTrackName = (TextView) listItemView.findViewById( R.id.element_name );
        currentTrackName.setText( currentTrack.getmTrackName() );

        // Find the imageview on the list_item.xml layout with the image ID and set the current track's image GONE,
        // because track doesn't have image.
        ImageView currentTrackImage = (ImageView) listItemView.findViewById( R.id.element_image_view );
        currentTrackImage.setVisibility(View.GONE);

        // Find the textview on the list_item.xml layout with the text ID and set the current track's about text GONE,
        // because track doesn't have about text.
        TextView currentTrackAbout = (TextView) listItemView.findViewById( R.id.element_about );
        currentTrackAbout.setVisibility( View.GONE );


        return listItemView;
    }
}