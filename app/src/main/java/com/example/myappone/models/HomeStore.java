package com.example.myappone.models;

public class HomeStore {
    private long id;
    private Boolean isNew;
    private String title;
    private String subtitle;
    private String picture;
    private boolean isBuy;

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public Boolean getIsNew() { return isNew; }
    public void setIsNew(Boolean value) { this.isNew = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getSubtitle() { return subtitle; }
    public void setSubtitle(String value) { this.subtitle = value; }

    public String getPicture() { return picture; }
    public void setPicture(String value) { this.picture = value; }

    public boolean getIsBuy() { return isBuy; }
    public void setIsBuy(boolean value) { this.isBuy = value; }
}
