package android.example.com.tourguideapp;

/**
 * Created by chad.yeo on 1/19/2017.
 */
public class Item {
    private String mLocation;
    private String mDescription;
    private String mAddress;

    private int mImageResourceId;

    public Item(String location, String description, String address, int imageResourceId) {
        mLocation = location;
        mDescription = description;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getLocation() {
        return mLocation;
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
}
