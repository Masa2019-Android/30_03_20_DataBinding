package com.telran.a30_03_20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.telran.a30_03_20.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    Person p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        p = new Person("Petya","0523455667",23,"Ashqelon", new Car("Civic","Honda"));
        binding.setPerson(p);
        binding.setListener(this);

//        p.name = "Vasya";

//        binding.setPerson(p);
//        binding.invalidateAll();
//        binding.nameTxt.setText("Vasya");
//        binding.phoneTxt.setText("05455555555");
    }

    @Override
    public void onClick() {
        p.name.set("Vasya");
        Toast.makeText(this, "Btn Clicked", Toast.LENGTH_SHORT).show();
        Log.d("MY_TAG", "onClick: " + p.phone);
    }
}
