package com.osamaawad.graduationproject_tawasi.RecyclerViewClasses;

public class MostWonted {
    Integer logo;
    String RestName;
    String RestRate;

    public MostWonted(Integer logo, String restName, String restRate) {
        this.logo = logo;
        this.RestName = restName;
        this.RestRate = restRate;
    }

    public Integer getLogo() {
        return logo;
    }

    public String getRestName() {
        return RestName;
    }

    public String getRestRate() {
        return RestRate;
    }
}
