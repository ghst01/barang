package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PermintaanModel    implements Serializable {

    @SerializedName("no_permintaan")
    private String no_permintaan;
    @SerializedName("tanggal_permintaan")
    private String tanggal_permintaan;
    @SerializedName("jumlah_permintaan")
    private String jumlah_permintaan;
    @SerializedName("kode_barang")
    private String kode_barang;
    @SerializedName("kode_user")
    private String kode_user;
    @SerializedName("status_permintaan")
    private String status_permintaan;

    public PermintaanModel(String no_permintaan, String tanggal_permintaan,String jumlah_permintaan,String kode_barang,String kode_user,String status_permintaan) {
        this.no_permintaan = no_permintaan;
        this.tanggal_permintaan = tanggal_permintaan;
        this.jumlah_permintaan = jumlah_permintaan;
        this.kode_barang = kode_barang;
        this.kode_user = kode_user;
        this.status_permintaan = status_permintaan;
    }

    public String getNo_permintaan() {
        return no_permintaan;
    }

    public void setNo_permintaan(String no_permintaan) {
        this.no_permintaan = no_permintaan;
    }

    public String getTanggal_permintaan() {
        return tanggal_permintaan;
    }

    public void setTanggal_permintaan(String tanggal_permintaan) {
        this.tanggal_permintaan = tanggal_permintaan;
    }

    public String getJumlah_permintaan() {
        return jumlah_permintaan;
    }

    public void setJumlah_permintaan(String jumlah_permintaan) {
        this.jumlah_permintaan = jumlah_permintaan;
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

    public String getStatus_permintaan() {
        return status_permintaan;
    }

    public void setStatus_permintaan(String status_permintaan) {
        this.status_permintaan = status_permintaan;
    }
}
