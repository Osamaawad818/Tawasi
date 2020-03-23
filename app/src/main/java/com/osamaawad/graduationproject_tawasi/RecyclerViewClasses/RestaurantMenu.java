package com.osamaawad.graduationproject_tawasi.RecyclerViewClasses;

public class RestaurantMenu {
    Integer logo2;
    String MealName2;
    String MealPrice2;

    public RestaurantMenu(Integer logo2, String mealName2, String mealPrice2) {
        this.logo2 = logo2;
        MealName2 = mealName2;
        MealPrice2 = mealPrice2;
    }

    public Integer getLogo2() {
        return logo2;
    }

    public String getMealName2() {
        return MealName2;
    }

    public String getMealPrice2() {
        return MealPrice2;
    }
}
