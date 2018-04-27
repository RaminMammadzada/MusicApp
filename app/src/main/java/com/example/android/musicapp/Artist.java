package com.example.android.musicapp;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class Artist implements Serializable{

    private String mArtistFullname = "";
    private String mArtistAbout = "";
    private ArrayList<Album> mAlbums = new ArrayList<>(  );
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Image resource ID for the word */
    private int mArtistImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean artistHasImage(){
        return mArtistImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmArtistImageResourceId() {
        return mArtistImageResourceId;
    }

    public void setmArtistImageResourceId(int mImageResourceId) {
        this.mArtistImageResourceId = mImageResourceId;
    }


    public Artist(String artistFullname, String artistAbout, int artistImage) {
        mArtistFullname = artistFullname;
        mArtistAbout = artistAbout;
        mArtistImageResourceId = artistImage;
    }

    public Artist(String artistFullname, String artistAbout) {
        mArtistFullname = artistFullname;
        mArtistAbout = artistAbout;
    }

    public Artist() {
    }

    public String getmArtistFullname() {
        return mArtistFullname;
    }

    public void setmArtistFullname(String mArtistFullname) {
        this.mArtistFullname = mArtistFullname;
    }

    public String getmArtistAbout() {
        return mArtistAbout;
    }

    public void setmArtistAbout(String mAbout) {
        this.mArtistAbout = mAbout;
    }

    public ArrayList<Album> getmAlbums() {
        return mAlbums;
    }

    public void setmAlbums(ArrayList<Album> mAlbums) {
        this.mAlbums = mAlbums;
    }
}
