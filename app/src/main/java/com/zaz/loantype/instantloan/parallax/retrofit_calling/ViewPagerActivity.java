package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zaz.loantype.instantloan.parallax.retrofit_calling.databinding.ActivityViewPagerBinding;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity {

    ActivityViewPagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViewPagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int pos=getIntent().getIntExtra("image",0);
        ArrayList<String> list=getIntent().getStringArrayListExtra("viewmore");
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(list,this);
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.viewPager.setCurrentItem(pos);
    }
}