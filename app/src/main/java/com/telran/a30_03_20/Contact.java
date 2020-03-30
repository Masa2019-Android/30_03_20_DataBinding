package com.telran.a30_03_20;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class Contact {
    public int id;
    public String name;
    public String phone;
    public String url;

    public Contact(int id, String name, String phone, String url) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.url = url;
    }

    @BindingAdapter({"app:url"})
    public static void loadImg(ImageView imageView, String url){
        Picasso.get().load(url).into(imageView);
    }
}
