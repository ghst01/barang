package com.example.barang.Model;

import java.io.Serializable;

public class HistoryModel implements Serializable {

    // string course_name for storing course_name
    // and imgid for storing image id.
    private String name;
    private String id;
    private String tipe;
    private int imgid;

    public HistoryModel(String course_name, int imgid, String id, String tipe) {
        this.id = id;
        this.tipe = tipe;
        this.name = course_name;
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String course_name) {
        this.name = course_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
}
