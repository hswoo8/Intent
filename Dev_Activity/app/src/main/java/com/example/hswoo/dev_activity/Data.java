package com.example.hswoo.dev_activity;

import android.os.Parcel;
import android.os.Parcelable;

public class Data implements Parcelable {
    private int data;
    protected Data(Parcel in) {
        data = in.readInt();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(data);
    }
}
