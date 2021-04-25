package com.volodymyr.countriesapp.model;

import com.google.gson.annotations.SerializedName;

public class CountryModel {
    @SerializedName("name")
    String countyName;

    @SerializedName("capital")
    String capital;

    @SerializedName("flagPNG")
    String flag;

    public CountryModel(String countyName, String capital, String flag) {
        this.countyName = countyName;
        this.capital = capital;
        this.flag = flag;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getCapitalName() {
        return capital;
    }

    public String getFlag() {
        return flag;
    }
}
