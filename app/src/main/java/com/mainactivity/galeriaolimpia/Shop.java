package com.mainactivity.galeriaolimpia;

public class Shop {

    private int img;
    private String category;
    private String openHr;

    public Shop(int img, String category, String openHr) {
        this.img = img;
        this.category = category;
        this.openHr = openHr;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOpenHr() {
        return openHr;
    }

    public void setOpenHr(String openHr) {
        this.openHr = openHr;
    }
}
