package com.crm.hieunc.app;

import java.io.Serializable;

public class Nghanh_nghe implements Serializable {
    private String Ten_nghanh_nghe;
    private String Mota;
    private int Id_nghanh_nghe;

    public Nghanh_nghe(String ten_nghanh_nghe, String mota, int id_nghanh_nghe) {
        Ten_nghanh_nghe = ten_nghanh_nghe;
        Mota = mota;
        Id_nghanh_nghe = id_nghanh_nghe;
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

    public int getId_nghanh_nghe() {
        return Id_nghanh_nghe;
    }

    public void setId_nghanh_nghe(int id_nghanh_nghe) {
        Id_nghanh_nghe = id_nghanh_nghe;
    }
}
