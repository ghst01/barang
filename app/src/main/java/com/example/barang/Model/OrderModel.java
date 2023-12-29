package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class OrderModel    implements Serializable {

    @SerializedName("id_order")
    private String id_order;
    @SerializedName("kode_barang")
    private String kode_barang;
    @SerializedName("tanggal")
    private String tanggal;
    @SerializedName("jumlah_diperlukan")
    private String jumlah_diperlukan;
    @SerializedName("kode_user")
    private String kode_user;

    public OrderModel(String id_order, String kode_barang,String tanggal,String jumlah_diperlukan,String kode_user) {
        this.id_order = id_order;
        this.kode_barang = kode_barang;
        this.tanggal = tanggal;
        this.jumlah_diperlukan = jumlah_diperlukan;
        this.kode_user = kode_user;
    }

    public String getId_order() {
        return id_order;
    }

    public void setId_order(String id_order) {
        this.id_order = id_order;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getKode_user() {
        return kode_user;
    }

    public void setKode_user(String kode_user) {
        this.kode_user = kode_user;
    }

    public String getJumlah_diperlukan() {
        return jumlah_diperlukan;
    }

    public void setJumlah_diperlukan(String jumlah_diperlukan) {
        this.jumlah_diperlukan = jumlah_diperlukan;
    }
}