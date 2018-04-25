package com.example.android.musicapp;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;

public class Artist implements Serializable{

    private String mArtistFullname = "";
    private String mArtistAbout = "";
    private ArrayList<Album> mAlbums = new ArrayList<>(  );

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

    public String getmAbout() {
        return mArtistAbout;
    }

    public void setmAbout(String mAbout) {
        this.mArtistAbout = mAbout;
    }

    public ArrayList<Album> getmAlbums() {
        return mAlbums;
    }

    public void setmAlbums(ArrayList<Album> mAlbums) {
        this.mAlbums = mAlbums;
    }
}
