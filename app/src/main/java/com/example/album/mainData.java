package com.example.album;

public class mainData {
    private int resourceId;
    private String tvUseG;
    private String tvDate;

    public mainData(int resourceId, String tvUseG, String tvDate) {
        this.resourceId = resourceId;
        this.tvUseG = tvUseG;
        this.tvDate = tvDate;
    }


    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTvUseG() {
        return tvUseG;
    }

    public void setTvUseG(String tvUseG) {
        this.tvUseG = tvUseG;
    }

    public String getTvDate() {
        return tvDate;
    }

    public void setTvDate(String tvDate) {
        this.tvDate = tvDate;
    }
}
