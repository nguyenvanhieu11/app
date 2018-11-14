package com.crm.hieunc.app;

public class Details {
    private String tenmota;
    private String mota;
    private int icon;

    public Details(String tenmota, String mota, int icon) {
        this.tenmota = tenmota;
        this.mota = mota;
        this.icon = icon;
    }

    public String getTenmota() {
        return tenmota;
    }

    public void setTenmota(String tenmota) {
        this.tenmota = tenmota;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
