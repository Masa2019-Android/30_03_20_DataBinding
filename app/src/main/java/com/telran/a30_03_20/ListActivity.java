package com.telran.a30_03_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.root,new ContactListFragment())
                .commit();
    }
}
