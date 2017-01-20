package android.example.com.tourguideapp;

import android.location.Location;

/**
 * Created by chad.yeo on 1/19/2017.
 */
public class Item {
    private String mAttraction;
    private String mDescription;
    private String mAddress;
    private Location mLocation;

    private int mImageResourceId;

    public Item(String attraction, String description, String address, int imageResourceId, Location location) {
        mAttraction = attraction;
        mDescription = description;
        mAddress = address;
        mImageResourceId = imageResourceId;
        mLocation = location;
    }

    public String getAttraction() {
        return mAttraction;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public Location getLocation() {
        return mLocation;
    }
}
