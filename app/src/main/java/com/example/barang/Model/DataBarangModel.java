package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataBarangModel   {

    @SerializedName("data")
    private ArrayList<BarangModel> data;

    public DataBarangModel(ArrayList<BarangModel> data) {
        this.data = data;
    }

    public ArrayList<BarangModel> getData() {
        return data;
    }

    public void setData(ArrayList<BarangModel> data) {
        this.data = data;
    }

}
