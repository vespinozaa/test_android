package com.tel335.androidapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {
    private String name;

    public Persona(String name){
        this.name = name;
    }

    protected Persona(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() { //id pa identificar ej cantidad de elementos (?
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(name);
    }
}
