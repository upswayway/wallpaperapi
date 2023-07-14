package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.WallapapersItem;

import java.util.ArrayList;
import java.util.List;

public class MoreCategaryAdapter extends RecyclerView.Adapter<MoreCategaryAdapter.viewclass> {
    Context context;
    WallapapersItem item;
    List<String> image;

    public MoreCategaryAdapter(Context context, WallapapersItem images) {
        this.context = context;
        this.item = images;
        this.image = images.getImages();
    }

    @NonNull
    @Override
    public MoreCategaryAdapter.viewclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.more_catagary, parent, false);
        return new viewclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoreCategaryAdapter.viewclass holder, int position) {
        Glide.with(holder.imageView).load(image.get(position)).centerCrop().into(holder.imageView);
        holder.cardView.setOnClickListener(view -> {
            Intent intent = new Intent(context, ViewPagerActivity.class);
            intent.putExtra("image", position);
            intent.putStringArrayListExtra("viewmore", (ArrayList<String>) image);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class viewclass extends RecyclerView.ViewHolder {
        ImageView imageView;
        CardView cardView;

        public viewclass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
