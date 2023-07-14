package com.zaz.loantype.instantloan.parallax.retrofit_calling;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zaz.loantype.instantloan.parallax.retrofit_calling.retrofit.WallapapersItem;

import java.util.List;

public class CategaryAdapter extends RecyclerView.Adapter<CategaryAdapter.viewclass> {
    MainActivity mainActivity;
    List<WallapapersItem> wallapapers;

    public CategaryAdapter(MainActivity mainActivity, List<WallapapersItem> wallapapers) {
        this.mainActivity = mainActivity;
        this.wallapapers = wallapapers;
    }

    @NonNull
    @Override
    public CategaryAdapter.viewclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.catagariew_view, parent, false);
        return new viewclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategaryAdapter.viewclass holder, int position) {
        Glide.with(holder.imageView).load(wallapapers.get(position).getImages().get(0)).centerCrop().into(holder.imageView);
        holder.textView.setText(wallapapers.get(position).getCatName());

        holder.cardView.setOnClickListener(view -> {
            WallapapersItem item=wallapapers.get(position);
            Intent intent=new Intent(mainActivity, CategaryActivity.class);
            intent.putExtra("image",item);
            mainActivity.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return wallapapers.size();
    }

    public class viewclass extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        CardView cardView;

        public viewclass(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            textView = itemView.findViewById(R.id.textview);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
