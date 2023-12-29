package com.example.barang.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserModel implements Serializable {

    @SerializedName("username")
    private String username;
    @SerializedName("id")
    private String id;
    @SerializedName("password")
    private String password;
    @SerializedName("status_user")
    private String status_user;

    public UserModel(String id, String username,String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status_user = status_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStatus_user() {
        return status_user;
    }

    public void setStatus_user(String status_user) {
        this.status_user = status_user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
