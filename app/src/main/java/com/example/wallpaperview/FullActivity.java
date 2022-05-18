package com.example.wallpaperview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullActivity extends AppCompatActivity {

    public ImageView imageView;
    public TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);

        imageView= findViewById(R.id.wallpaper);
        nameText= findViewById(R.id.wallName);

    }
}