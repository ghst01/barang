package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataPengeluaranModel   {

    @SerializedName("data")
    private ArrayList<PengeluaranModel> data;

    public DataPengeluaranModel(ArrayList<PengeluaranModel> data) {
        this.data = data;
    }

    public ArrayList<PengeluaranModel> getData() {
        return data;
    }

    public void setData(ArrayList<PengeluaranModel> data) {
        this.data = data;
    }

}
