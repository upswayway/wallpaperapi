package com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Wallpaperapi {

    public static Retrofit getClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://filedn.eu/lT5MTrPP9oSbL8W0tjWsva5/inCall/Wallpaper/Wallpaper%20List/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
