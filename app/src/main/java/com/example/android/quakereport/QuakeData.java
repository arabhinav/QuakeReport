package com.example.android.quakereport;

public class QuakeData {

    //Magnitude of earthquake
    private double magnitudeOfQuake;

    //Epicenter of earthquake
    private String primaryLocation;

    // Time of the earthquake
    private long mTimeInMilliseconds;

    // URL for the specific earthquake data
    private String urlOfEpicenter;

    //Constructor
    public QuakeData(double magnitude, String epicenter, long timeInMilliseconds, String url){
        magnitudeOfQuake = magnitude;
        primaryLocation = epicenter;
        mTimeInMilliseconds = timeInMilliseconds;
        urlOfEpicenter = url;
    }

    //To get magnitude of the earthquake
    public double getMagnitudeOfQuake() {
        return magnitudeOfQuake;
    }

    //To get the epicenter of earthquake
    public String getPrimaryLocation(){
        return primaryLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrlOfEpicenter() {
        return urlOfEpicenter;
    }
}
