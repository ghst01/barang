package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataSuplierModel  {

    @SerializedName("data")
    private ArrayList<SuplierModel> data;

    public DataSuplierModel(ArrayList<SuplierModel> data) {
        this.data = data;
    }

    public ArrayList<SuplierModel> getData() {
        return data;
    }

    public void setData(ArrayList<SuplierModel> data) {
        this.data = data;
    }

}

