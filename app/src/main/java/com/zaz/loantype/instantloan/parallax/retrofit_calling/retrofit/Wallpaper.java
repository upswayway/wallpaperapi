package com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Wallpaper {
    @GET("secend api")
    Call<Response>getRespose();
}
