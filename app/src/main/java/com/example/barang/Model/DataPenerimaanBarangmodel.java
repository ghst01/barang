package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataPenerimaanBarangmodel {

    @SerializedName("data")
    private ArrayList<PenerimaanBarangModel> data;

    public DataPenerimaanBarangmodel(ArrayList<PenerimaanBarangModel> data) {
        this.data = data;
    }

    public ArrayList<PenerimaanBarangModel> getData() {
        return data;
    }

    public void setData(ArrayList<PenerimaanBarangModel> data) {
        this.data = data;
    }

}
