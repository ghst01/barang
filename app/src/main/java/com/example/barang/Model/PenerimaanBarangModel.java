package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PenerimaanBarangModel   implements Serializable {

    @SerializedName("no_surat_jalan")
    private String no_surat_jalan;
    @SerializedName("tanggal_penerimaan")
    private String tanggal_penerimaan;
    @SerializedName("kode_user")
    private String kode_user;
    @SerializedName("nama_barang")
    private String nama_barang;
    @SerializedName("jumlah_penerimaan")
    private String jumlah_penerimaan;

    public PenerimaanBarangModel(String no_surat_jalan, String tanggal_penerimaan,String kode_user,String nama_barang,String jumlah_penerimaan) {
        this.no_surat_jalan = no_surat_jalan;
        this.nama_barang = nama_barang;
        this.tanggal_penerimaan = tanggal_penerimaan;
        this.kode_user = kode_user;
        this.jumlah_penerimaan = jumlah_penerimaan;
    }

    public String getNo_surat_jalan() {
        return no_surat_jalan;
    }

    public void setNo_surat_jalan(String no_surat_jalan) {
        this.no_surat_jalan = no_surat_jalan;
    }

    public String getTanggal_penerimaan() {
        return tanggal_penerimaan;
    }

    public void setTanggal_penerimaan(String tanggal_penerimaan) {
        this.tanggal_penerimaan = tanggal_penerimaan;
    }

    public String getKode_user() {
        return kode_user;
    }

    public void setKode_user(String kode_user) {
        this.kode_user = kode_user;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getJumlah_penerimaan() {
        return jumlah_penerimaan;
    }

    public void setJumlah_penerimaan(String jumlah_penerimaan) {
        this.jumlah_penerimaan = jumlah_penerimaan;
    }
}
