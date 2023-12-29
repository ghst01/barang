package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PengeluaranModel   implements Serializable {

    @SerializedName("no_pengeluaran")
    private String no_pengeluaran;
    @SerializedName("tanggal_pengeluaran")
    private String tanggal_pengeluaran;
    @SerializedName("jumlah_pengeluaran")
    private String jumlah_pengeluaran;
    @SerializedName("no_permintaan")
    private String no_permintaan;
    @SerializedName("nama_barang")
    private String nama_barang;
    @SerializedName("nama_pelanggan")
    private String nama_pelanggan;

    public PengeluaranModel(String no_pengeluaran, String tanggal_pengeluaran,String jumlah_pengeluaran,String no_permintaan,String nama_pelanggan,String nama_barang) {
        this.no_pengeluaran = no_pengeluaran;
        this.nama_barang = nama_barang;
        this.tanggal_pengeluaran = tanggal_pengeluaran;
        this.jumlah_pengeluaran = jumlah_pengeluaran;
        this.no_permintaan = no_permintaan;
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getNo_pengeluaran() {
        return no_pengeluaran;
    }

    public void setNo_pengeluaran(String no_pengeluaran) {
        this.no_pengeluaran = no_pengeluaran;
    }

    public String getTanggal_pengeluaran() {
        return tanggal_pengeluaran;
    }

    public void setTanggal_pengeluaran(String tanggal_pengeluaran) {
        this.tanggal_pengeluaran = tanggal_pengeluaran;
    }

    public String getJumlah_pengeluaran() {
        return jumlah_pengeluaran;
    }

    public void setJumlah_pengeluaran(String jumlah_pengeluaran) {
        this.jumlah_pengeluaran = jumlah_pengeluaran;
    }

    public String getNo_permintaan() {
        return no_permintaan;
    }

    public void setNo_permintaan(String no_permintaan) {
        this.no_permintaan = no_permintaan;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }
}