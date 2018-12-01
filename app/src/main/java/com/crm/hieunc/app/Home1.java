package com.crm.hieunc.app;

public class Home1 {
    private String Ten_cong_viec;
    private String Vi_tri;
    private String Ngay_dang;
    private String Nghanh_nghe;
    private int HinhAnh;
    private String Nguoi_dang;

    public Home1(String ten, String vitri, String ngay_dang, String nghanhnghe, int hinhAnh, String nguoi_dang) {
        Ten_cong_viec = ten;
        Vi_tri = vitri;
        Ngay_dang = ngay_dang;
        Nghanh_nghe = nghanhnghe;
        HinhAnh = hinhAnh;
        Nguoi_dang = nguoi_dang;
    }

    public String getTen_cong_viec() {
        return Ten_cong_viec;
    }

    public void setTen_cong_viec(String ten_cong_viec) {
        Ten_cong_viec = ten_cong_viec;
    }

    public String getVi_tri() {
        return Vi_tri;
    }

    public void setVi_tri(String vi_tri) {
        Vi_tri = vi_tri;
    }

    public String getNgay_dang() {
        return Ngay_dang;
    }

    public void setNgay_dang(String ngay_dang) {
        Ngay_dang = ngay_dang;
    }

    public String getNghanh_nghe() {
        return Nghanh_nghe;
    }

    public void setNghanh_nghe(String nghanh_nghe) {
        Nghanh_nghe = nghanh_nghe;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getNguoi_dang() {
        return Nguoi_dang;
    }

    public void setNguoi_dang(String nguoi_dang) {
        Nguoi_dang = nguoi_dang;
    }
}
