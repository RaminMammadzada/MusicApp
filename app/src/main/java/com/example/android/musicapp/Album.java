package com.example.android.musicapp;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class Album extends Artist implements Serializable{

    private String mAlbumTitle = "";
    private ArrayList<Track> mTracks = new ArrayList<>(  );

    public ArrayList<Track> getmTracks() {
        return mTracks;
    }

    public void setmTracks(ArrayList<Track> tracks) {
        this.mTracks = tracks;
    }


    public Album(){
    }

    public Album(String mTitle, ArrayList<Track> tracks) {
        this.mAlbumTitle = mTitle;
        this.mTracks = tracks;
    }

    public Album(String artistFullname, String artistAbout, String title, ArrayList<Track> tracks) {
        super( artistFullname, artistAbout );
        this.mAlbumTitle = title;
        this.mTracks = tracks;
    }

    public String getmAlbumTitle() {
        return mAlbumTitle;
    }

    public void setmAlbumTitle(String mTitle) {
        this.mAlbumTitle = mTitle;
    }
}
