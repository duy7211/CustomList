package com.example.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class clsMoto {
    private String name;
    private String detail;
    private int imgHinh;

    public clsMoto(String name, String detail, int imgHinh) {
        this.name = name;
        this.detail = detail;
        this.imgHinh = imgHinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImgHinh() {
        return imgHinh;
    }

    public void setImgHinh(int imgHinh) {
        this.imgHinh = imgHinh;
    }
}
