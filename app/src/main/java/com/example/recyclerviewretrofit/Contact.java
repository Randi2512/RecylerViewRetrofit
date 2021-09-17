package com.example.recyclerviewretrofit;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class Contact{
    public ArrayList<Result> result;
}

class Result{
    public String id;
    public String nama;
    public String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

