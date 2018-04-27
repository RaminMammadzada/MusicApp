package com.example.android.musicapp;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class Album extends Artist implements Serializable{

    private String mAlbumTitle = "";
    private ArrayList<Track> mTracks = new ArrayList<>(  );

    private static final int NO_IMAGE_PROVIDED = -1;

    public int getmAlbumImageResourceId() {
        return mAlbumImageResourceId;
    }

    public void setmAlbumImageResourceId(int mAlbumImageResourceId) {
        this.mAlbumImageResourceId = mAlbumImageResourceId;
    }

    /** Image resource ID for the word */
    private int mAlbumImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean albumHasImage(){
        return mAlbumImageResourceId != NO_IMAGE_PROVIDED;
    }


    public ArrayList<Track> getmTracks() {
        return mTracks;
    }

    public void setmTracks(ArrayList<Track> tracks) {
        this.mTracks = tracks;
    }


    public Album(){
    }

    public Album(String mTitle, int albumImageResourceId, ArrayList<Track> tracks) {
        this.mAlbumTitle = mTitle;
        this.mTracks = tracks;
        this.mAlbumImageResourceId = albumImageResourceId;
    }

    public Album(String artistFullname, String artistAbout, int artistImageId, String title, ArrayList<Track> tracks) {
        super( artistFullname, artistAbout, artistImageId );
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
