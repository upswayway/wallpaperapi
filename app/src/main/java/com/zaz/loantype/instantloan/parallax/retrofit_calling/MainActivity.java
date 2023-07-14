package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zaz.loantype.instantloan.parallax.retrofit_calling.databinding.ActivityMainBinding;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.Response;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.Wallpaper;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.Wallpaperapi;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Wallpaper wallpaper= Wallpaperapi.getClient().create(Wallpaper.class);
        wallpaper.getRespose().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response response1= response.body();
                CategaryAdapter adapter=new CategaryAdapter(MainActivity.this,response1.getWallapapers());
                binding.recyclerview.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
}