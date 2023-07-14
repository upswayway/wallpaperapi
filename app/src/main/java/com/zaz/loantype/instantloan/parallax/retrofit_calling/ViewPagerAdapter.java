package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.viewclass> {


    ArrayList<String> list;
    Context context;

    public ViewPagerAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewPagerAdapter.viewclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.view_pager,parent,false);
        return new viewclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerAdapter.viewclass holder, int position) {
        String uri=list.get(position);
        Glide.with(context).load(uri).centerCrop().into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewclass extends RecyclerView.ViewHolder {
        ImageView imageView;
        public viewclass(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view);
        }
    }
}
