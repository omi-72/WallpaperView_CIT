package com.example.wallpaperview;

public class Wallpaper {
    private String url;
    private String name;

    public Wallpaper(final String url, final String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {

        this.url = url;
    }

    public String getName() {

        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }
}
