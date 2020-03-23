package com.osamaawad.graduationproject_tawasi.RecyclerViewClasses;

public class AllRestaurant {
    Integer logo1;
    String RestName1;
    String RestRate1;

    public AllRestaurant(Integer logo1, String restName1, String restRate1) {
        this.logo1 = logo1;
        RestName1 = restName1;
        RestRate1 = restRate1;
    }

    public Integer getLogo1() {
        return logo1;
    }

    public String getRestName1() {
        return RestName1;
    }

    public String getRestRate1() {
        return RestRate1;
    }
}
