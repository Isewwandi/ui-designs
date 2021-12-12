package com.techleadintl.android.app1;

public class modelProduct {

    Integer logo,product;
    String name,work;




    public modelProduct(Integer logo, Integer product, String name, String work) {
        this.logo = logo;
        this.product = product;
        this.name = name;
        this.work = work;
    }

    public Integer getLogo() {
        return logo;
    }

    public Integer getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }
}
