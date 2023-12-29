package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SuplierModel  implements Serializable {

    @SerializedName("kode_suplier")
    private String kode_suplier;
    @SerializedName("nama_suplier")
    private String nama_suplier;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("no_telpon")
    private String no_telpon;

    public SuplierModel(String kode_suplier, String nama_suplier,String alamat,String no_telpon) {
        this.kode_suplier = kode_suplier;
        this.nama_suplier = nama_suplier;
        this.alamat = alamat;
        this.no_telpon = no_telpon;
    }

    public String getKode_suplier() {
        return kode_suplier;
    }

    public void setKode_suplier(String kode_suplier) {
        this.kode_suplier = kode_suplier;
    }

    public String getNama_suplier() {
        return nama_suplier;
    }

    public void setNama_suplier(String nama_suplier) {
        this.nama_suplier = nama_suplier;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telpon = no_telpon;
    }
}
