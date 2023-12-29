package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DataOrderModel  {

    @SerializedName("data")
    private ArrayList<OrderModel> data;

    public DataOrderModel(ArrayList<OrderModel> data) {
        this.data = data;
    }

    public ArrayList<OrderModel> getData() {
        return data;
    }

    public void setData(ArrayList<OrderModel> data) {
        this.data = data;
    }

}
