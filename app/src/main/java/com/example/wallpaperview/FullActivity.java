package com.example.wallpaperview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FullActivity extends AppCompatActivity {

    public ImageView imageView;
    public TextView nameText;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full);
        intent= getIntent();

        imageView= findViewById(R.id.wallpaper);
        nameText= findViewById(R.id.wallName);

        String name= intent.getStringExtra("name");
        String url = intent.getStringExtra("url");

        nameText.setText(name);

      Glide.with(FullActivity.this).load(url).placeholder(R.drawable.placeholder).into(imageView);

    }
}