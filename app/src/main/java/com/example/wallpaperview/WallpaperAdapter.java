package com.example.wallpaperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperViewHolder> {

    ArrayList<Wallpaper> wallpapers;
    Context context;

    public WallpaperAdapter(final ArrayList<Wallpaper> wallpapers, final Context context) {
        this.wallpapers = wallpapers;
        this.context = context;
    }

    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_wallpaper,parent,false);


        return new WallpaperViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final WallpaperViewHolder holder, final int position) {

        Wallpaper wallpaper= wallpapers.get(position);
        holder.nameText.setText(wallpaper.getName());

        Glide.with(context).load(wallpaper.getUrl()).placeholder(R.drawable.placeholder).into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }

    @Override
    public int getItemCount() {

        return wallpapers.size();
    }
}
