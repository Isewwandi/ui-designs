package com.techleadintl.android.app1;

public class model {

    Integer logo;
    String name;

    public model(){

    }

    public model(Integer logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public Integer getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }
}
