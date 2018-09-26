package com.crm.hieunc.app;

public class HinhAnh {
    private String DanhMuc;
    private int Hinh;

    public HinhAnh(String danhMuc, int hinh) {
        DanhMuc = danhMuc;
        Hinh = hinh;
    }

    public String getDanhMuc() {
        return DanhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        DanhMuc = danhMuc;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
