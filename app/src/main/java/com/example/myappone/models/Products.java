package com.example.myappone.models;

import java.util.List;

public class Products {
    private List<HomeStore> homeStore;
    private List<BestSeller> bestSeller;

    public List<HomeStore> getHomeStore() { return homeStore; }
    public void setHomeStore(List<HomeStore> value) { this.homeStore = value; }

    public List<BestSeller> getBestSeller() { return bestSeller; }
    public void setBestSeller(List<BestSeller> value) { this.bestSeller = value; }
}

