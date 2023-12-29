package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataUserModel {

    @SerializedName("data")
    private ArrayList<UserModel> data;

    public DataUserModel(ArrayList<UserModel> data) {
        this.data = data;
    }

    public ArrayList<UserModel> getData() {
        return data;
    }

    public void setData(ArrayList<UserModel> data) {
        this.data = data;
    }

}
