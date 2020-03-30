package com.telran.a30_03_20;

import androidx.databinding.BindingConversion;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public String model;
    public String manuf;
    public List<String> phones;

    public Car(String model, String manuf) {
        this.model = model;
        this.manuf = manuf;
        phones = new ArrayList<>();
        phones.add("05456789");
        phones.add("0324354677");
    }

    @BindingConversion
    public static String listToString(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(String str : list){
            sb.append(str).append("\n");
        }
        return sb.toString();
    }
}
