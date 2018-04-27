package com.example.android.musicapp;

import java.util.ArrayList;

public class Track extends Album{

    private String mTrackName;
    private int mDurationInMillisecond;

    public Track(String mTrackName, int mDurationInMillisecond) {
        this.mTrackName = mTrackName;
        this.mDurationInMillisecond = mDurationInMillisecond;
    }

    public Track(String artistFullname, String artistAbout, int artistImage, String title, String mTrackName, int mDurationInMillisecond, ArrayList<Track> tracks) {
        super( artistFullname, artistAbout, artistImage, title, tracks);
        this.mTrackName = mTrackName;
        this.mDurationInMillisecond = mDurationInMillisecond;
    }

    public String getmTrackName() {
        return mTrackName;
    }

    public void setmTrackName(String mTrackName) {
        this.mTrackName = mTrackName;
    }

    public int getmDurationInMillisecond() {
        return mDurationInMillisecond;
    }

    public void setmDurationInMillisecond(int mDurationInMillisecond) {
        this.mDurationInMillisecond = mDurationInMillisecond;
    }
}
