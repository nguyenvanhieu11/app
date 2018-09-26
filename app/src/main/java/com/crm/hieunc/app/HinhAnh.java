package com.crm.hieunc.app;

public class HinhAnh {
    private String danhmuc;
    private int Hinh;

    public HinhAnh(String danhmuc, int hinh) {
        danhmuc = danhmuc;
        Hinh = hinh;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        danhmuc = danhmuc;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
