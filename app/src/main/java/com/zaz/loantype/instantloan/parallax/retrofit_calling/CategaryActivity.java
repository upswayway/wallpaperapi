package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.zaz.loantype.instantloan.parallax.retrofit_calling.databinding.ActivityCategaryBinding;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.WallapapersItem;

public class CategaryActivity extends AppCompatActivity {

    ActivityCategaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCategaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        if (intent != null) {
            WallapapersItem item = (WallapapersItem) intent.getSerializableExtra("image");
            MoreCategaryAdapter adapter=new MoreCategaryAdapter(this,item);
            binding.recyclerview.setAdapter(adapter);

        }
    }
}