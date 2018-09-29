package com.crm.hieunc.app;

public class Home1 {
    private String Ten;
    private String DiaChi;
    private int Hinh;
    private String Gia;
    private String TinhTrang;

    public Home1(String ten, String diaChi, int hinh, String gia, String tinhTrang) {
        Ten = ten;
        DiaChi = diaChi;
        Hinh = hinh;
        Gia = gia;
        TinhTrang = tinhTrang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
}
