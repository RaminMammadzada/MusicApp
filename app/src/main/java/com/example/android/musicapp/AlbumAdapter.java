package com.example.android.musicapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

        TextView albumName = (TextView) listItemView.findViewById( R.id.element_name );

        albumName.setText( currentAlbum.getmAlbumTitle() );

        return listItemView;
    }
}
