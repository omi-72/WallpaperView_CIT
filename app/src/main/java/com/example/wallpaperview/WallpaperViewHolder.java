package com.example.wallpaperview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WallpaperViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView nameText;

    public WallpaperViewHolder(@NonNull final View itemView) {
        super(itemView);

        imageView= itemView.findViewById(R.id.wallpaper);
        nameText= itemView.findViewById(R.id.wallName);

    }
}
