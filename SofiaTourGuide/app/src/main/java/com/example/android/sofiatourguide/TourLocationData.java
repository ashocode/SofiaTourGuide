package com.example.android.sofiatourguide;


public class TourLocationData implements LocationData {

    private String locationName= "";
    private String locationDescription = "";
    private int locationImage;


    TourLocationData(String location, String description, int image){
        if (location != null){
            this.locationName = location;
        }

        if (description != null){
            this.locationDescription = description;
        }

        this.locationImage = image;

    }

    @Override
    public String getLocationName() {
        return this.locationName;
    }

    @Override
    public String getLocationDescription() {
        return this.locationDescription;
    }

    @Override
    public int getLocationImage() {
        return this.locationImage;
    }
}
