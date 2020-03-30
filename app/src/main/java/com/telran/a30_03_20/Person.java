package com.telran.a30_03_20;

import android.util.Log;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class Person {
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> phone = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    public String address;

    public Car car;

    public Person(String name, String phone, int age, String address, Car car) {
        this.name.set(name);
        this.phone.set(phone);
//        this.age = age;
        this.age.set(age);
        this.address = address;
        this.car = car;
    }

    public void incAge(){
//        age++;
        age.set(age.get()+1);
        Log.d("MY_TAG", "incAge: " + age.get());
    }

    @BindingAdapter({"app:car"})
    public static void setCarToTextView(TextView textView, Car car){
        textView.setText(car.model + " " + car.manuf);
    }
}
