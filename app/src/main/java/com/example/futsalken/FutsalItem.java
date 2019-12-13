package com.example.futsalken;

import android.os.Parcel;
import android.os.Parcelable;


public class FutsalItem implements Parcelable {
    private String name, address , phone, Poster;

    public FutsalItem(String name, String address, String phone, String Poster ) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.Poster = Poster;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getPoster() {
        return Poster;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {this.address = address; }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.address);
        parcel.writeString(this.phone);
        parcel.writeString(this.Poster);
    }

    public FutsalItem(){
    }

    protected FutsalItem(Parcel in ){
        this.name = in.readString();
        this.address = in.readString();
        this.phone = in.readString();
        this.Poster = in.readString();
    }

    public static final Parcelable.Creator<FutsalItem> CREATOR = new Parcelable.Creator<FutsalItem>(){

        @Override
        public FutsalItem createFromParcel(Parcel source) {
            return new FutsalItem(source);
        }

        @Override
        public FutsalItem[] newArray(int size) {
            return new FutsalItem[size];
        }
    };
}