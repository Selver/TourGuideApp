package com.example.machomefolder.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Item implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        public Item[] newArray(int size) {
            return new Item[size];
        }
    };

    //The following items are shown on the fragments screen
    private int mImageResourceId;
    private String mName;

    //The address of the item if provided
    private int mAddress = NO_ADDRESS_PROVIDED;
    private static final int NO_ADDRESS_PROVIDED = -1;

    //The following item is shown on the details screen, together with mImageResourceId, mName, mAddress
    private int mInfo;

    //Creating the constructor without address info
    public Item(int photo, String name, int info) {
        //The variables take the value of the arguments
        mImageResourceId = photo;
        mName = name;
        mInfo = info;
    }

    //Creating the constructor with address info
    public Item(int photo, String name, int address, int info) {
        //The variables take the value of the arguments
        mImageResourceId = photo;
        mName = name;
        mAddress = address;
        mInfo = info;
    }

    //Get the photo of the item
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get the name of the item
    public String getName() {
        return mName;
    }

    //Get the address if available
    public int getAddress() {
        return mAddress;
    }

    public boolean hasAddress() {

        return mAddress != NO_ADDRESS_PROVIDED;
    }

    public int getInfo() {
        return mInfo;
    }

    // Parcel
    public Item(Parcel in) {
        this.mImageResourceId = in.readInt();
        this.mName = in.readString();
        this.mAddress = in.readInt();
        this.mInfo = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResourceId);
        dest.writeString(mName);
        dest.writeInt(mAddress);
        dest.writeInt(mInfo);
    }
}





