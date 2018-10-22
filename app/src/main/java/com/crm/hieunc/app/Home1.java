package com.crm.hieunc.app;

public class Home1 {
    private String Ten;
    private String DiaChi;
    private String Gia;
    private String TinhTrang;

    public Home1(String ten, String diaChi, String gia, String tinhTrang) {
        Ten = ten;
        DiaChi = diaChi;
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
