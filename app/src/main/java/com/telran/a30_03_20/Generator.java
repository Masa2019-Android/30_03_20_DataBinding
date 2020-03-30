package com.telran.a30_03_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private static final String[] urls = {
            "https://res.cloudinary.com/sheygam/image/upload/v1511387451/avatar19_wjr1lw.png",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387451/avatar16_fnefk8.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387451/avatar4_dfb2my.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387450/avatar18_ei27xh.png",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387450/avatar20_vfrhu3.png",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387449/avatar17_oradvl.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387449/avatar15_uz0l3o.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387447/avatar11_r1mjvq.png",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387447/avatar9_ohbath.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387446/avatar1_hgkkkv.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387445/avatar12_gyftko.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387445/avatar14_uqukyb.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387444/avatar13_jkldxe.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387443/avatar7_mrmnmv.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387443/avatar10_l7oums.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387443/avatar8_g57alr.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387442/avatar6_zzncks.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387442/avatar2_fpvowp.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387442/avatar5_avunph.jpg",
            "https://res.cloudinary.com/sheygam/image/upload/v1511387442/avatar3_l4wh56.jpg"
    };

    private static final String[] names = {
            "Vasya",
            "Petya",
            "Sofa",
            "David",
            "John",
            "Anna",
            "Mike",
            "Alex",
            "Bob"
    };

    private static final String[] phones = {
            "054545678989",
            "054545643756",
            "054545324533",
            "052343542343",
            "058458465846",
            "058362735435",
            "053253437489",
            "053724552374",
            "023434243233",
            "034234554545",
    };


    public static List<Contact> getContacts() {
        List<Contact> res = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 100; i++) {
            res.add(new Contact(
                            i,
                            names[rnd.nextInt(names.length)],
                            phones[rnd.nextInt(phones.length)],
                            urls[rnd.nextInt(urls.length)]
                    )
            );
        }
        return res;
    }
}
