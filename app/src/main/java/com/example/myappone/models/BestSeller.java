package com.example.myappone.models;

public class BestSeller {
    private long id;
    private boolean isFavorites;
    private String title;
    private long priceWithoutDiscount;
    private long discountPrice;
    private String picture;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getIsFavorites() { return isFavorites; }
    public void setIsFavorites(boolean value) { this.isFavorites = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public long getPriceWithoutDiscount() { return priceWithoutDiscount; }
    public void setPriceWithoutDiscount(long value) { this.priceWithoutDiscount = value; }

    public long getDiscountPrice() { return discountPrice; }
    public void setDiscountPrice(long value) { this.discountPrice = value; }

    public String getPicture() { return picture; }
    public void setPicture(String value) { this.picture = value; }
}
