package com.crm.hieunc.app;

public class Nghanh_nghe {
    private String Ten_nghanh_nghe;
    private String Mota;

    public Nghanh_nghe(String ten_nghanh_nghe, String mota) {
        Ten_nghanh_nghe = ten_nghanh_nghe;
        Mota = mota;
    }

    public String getTen_nghanh_nghe() {
        return Ten_nghanh_nghe;
    }

    public void setTen_nghanh_nghe(String ten_nghanh_nghe) {
        Ten_nghanh_nghe = ten_nghanh_nghe;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }
}
