package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BarangModel   implements Serializable {

    @SerializedName("kode_barang")
    private String kode_barang;
    @SerializedName("nama_barang")
    private String nama_barang;
    @SerializedName("harga_beli")
    private String harga_beli;
    @SerializedName("harga_jual")
    private String harga_jual;
    @SerializedName("stok")
    private String stok;

    public BarangModel(String kode_barang, String nama_barang,String harga_beli,String harga_jual,String stok) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.harga_beli = harga_beli;
        this.harga_jual = harga_jual;
        this.stok = stok;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getHarga_beli() {
        return harga_beli;
    }

    public void setHarga_beli(String harga_beli) {
        this.harga_beli = harga_beli;
    }

    public String getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(String harga_jual) {
        this.harga_jual = harga_jual;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}
