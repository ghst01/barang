package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataPermintaanModel  {

    @SerializedName("data")
    private ArrayList<PermintaanModel> data;

    public DataPermintaanModel(ArrayList<PermintaanModel> data) {
        this.data = data;
    }

    public ArrayList<PermintaanModel> getData() {
        return data;
    }

    public void setData(ArrayList<PermintaanModel> data) {
        this.data = data;
    }

}
