package com.telran.a30_03_20;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class BindingAdapters {
    @BindingAdapter({"app:adapter","app:manager","app:divider"})
    public static void setAdapterToRv(RecyclerView rv, ContactAdapter adapter, RecyclerView.LayoutManager manager, RecyclerView.ItemDecoration divider){
        rv.setLayoutManager(manager);
        rv.addItemDecoration(divider);
        rv.setAdapter(adapter);
    }
}
