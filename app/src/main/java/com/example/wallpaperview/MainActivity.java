package com.example.wallpaperview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Wallpaper> wallpaperList =new ArrayList<>();

        wallpaperList.add(new Wallpaper("https://wallpapercave.com/wp/wp4814693.jpg","NightMoon"));
        wallpaperList.add(new Wallpaper("https://www.teahub.io/photos/full/0-8676_hd-nature-wallpapers-for-android-phones-wallpaper-an.jpg","ShiningLeaf"));
        wallpaperList.add(new Wallpaper("https://wallpaperaccess.com/full/5553487.jpg","Nature"));
        wallpaperList.add(new Wallpaper("https://cdn.wallpapersafari.com/80/28/FSgxVE.jpg","Nature"));
        wallpaperList.add(new Wallpaper("https://wallpaper.dog/large/17164618.jpg","Nature"));
        wallpaperList.add(new Wallpaper("https://3dandroidwallpaper.com/wp-content/uploads/2018/03/Wallpaper-Spring-Nature-Android.jpg","Sakura"));
        wallpaperList.add(new Wallpaper("https://www.wallpaperuse.com/wallp/8-87885_m.jpg","Nature"));
    }
}