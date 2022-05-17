package com.example.wallpaperview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperViewHolder> {

    ArrayList<Wallpaper>wallpapers;
    Context context;

    public WallpaperAdapter(ArrayList<Wallpaper> wallpapers, Context context) {
        this.wallpapers = wallpapers;
        this.context = context;
    }

    @NonNull
    @Override
    public WallpaperViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_wallpaper,parent,false);


        return new WallpaperViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
