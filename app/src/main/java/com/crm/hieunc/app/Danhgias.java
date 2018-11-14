package com.crm.hieunc.app;

public class Danhgias {
    private String tenthanhvien;
    private String thoigian;
    private int hinhanh;
    private String noidung;

    public Danhgias(String tenthanhvien, String thoigian, int hinhanh, String noidung) {
        this.tenthanhvien = tenthanhvien;
        this.thoigian = thoigian;
        this.hinhanh = hinhanh;
        this.noidung = noidung;
    }

    public String getTenthanhvien() {
        return tenthanhvien;
    }

    public void setTenthanhvien(String tenthanhvien) {
        this.tenthanhvien = tenthanhvien;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
