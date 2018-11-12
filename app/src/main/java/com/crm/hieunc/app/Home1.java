package com.crm.hieunc.app;

public class Home1 {
    private String Ten;
    private String DiaChi;
    private String Gia;
    private String TinhTrang;
    private int HinhAnh;

    public Home1(String ten, String diaChi, String gia, String tinhTrang, int hinhAnh) {
        Ten = ten;
        DiaChi = diaChi;
        Gia = gia;
        TinhTrang = tinhTrang;
        HinhAnh = hinhAnh;
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

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }
}
