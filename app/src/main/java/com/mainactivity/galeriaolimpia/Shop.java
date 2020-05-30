package com.mainactivity.galeriaolimpia;

public class Shop {

    private int img;
    private String category;
    private String openHr;
    private String description;
    private String phone;
    private int imgShop;

    public int getImgShop() {
        return imgShop;
    }

    public void setImgShop(int imgShop) {
        this.imgShop = imgShop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Shop(int img, String category, String openHr, String description, String phone, int imgShop) {
        this.img = img;
        this.category = category;
        this.openHr = openHr;
        this.description = description;
        this.phone = phone;
        this.imgShop = imgShop;
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
