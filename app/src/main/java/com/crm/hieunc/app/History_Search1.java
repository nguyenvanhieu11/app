package com.crm.hieunc.app;

public class History_Search1 {

    private String Search;
    private String time;

    public History_Search1(String search, String time) {
        Search = search;
        this.time = time;
    }

    public String getSearch() {
        return Search;
    }

    public void setSearch(String search) {
        Search = search;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
