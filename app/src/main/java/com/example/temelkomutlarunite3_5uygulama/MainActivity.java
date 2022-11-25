package com.example.temelkomutlarunite3_5uygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button uyg1 = findViewById(R.id.btnUyg1);
        Button uyg2 = findViewById(R.id.btnUyg2);
        Button uyg3 = findViewById(R.id.btnUyg3);
        Button uyg4 = findViewById(R.id.btnUyg4);
        Button uyg5 = findViewById(R.id.btnUyg5);
        Button uyg6 = findViewById(R.id.btnUyg6);
        Button uyg7 = findViewById(R.id.btnUyg7);
        uyg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean bubirdegiskenadidir = true;
                boolean guzelbirdegiskenismi = false;
                System.out.println(bubirdegiskenadidir);
                System.out.println(guzelbirdegiskenismi);
            }
        });
        uyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte bubirbytedegiskenidir = 127;
                short bubirshortdegiskenidir = 32767;
                int bubirintdegiskenidir = 2147483647;
                long bubirlongdegiskenidir = 9223372036854775807L;
                System.out.println("Byte Degiskeni: " + bubirbytedegiskenidir);
                System.out.println("Short Degiskeni: " + bubirshortdegiskenidir);
                System.out.println("Int Degiskeni: " + bubirintdegiskenidir);
                System.out.println("Long Degiskeni:"  + bubirlongdegiskenidir);
            }
        });
        uyg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char aharfi = 'A';
                System.out.println("1. Harf: " + aharfi);
                aharfi = 'A' + 1;
                System.out.println("2. Harf: " + aharfi);
            }
        });
        uyg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char guccukA = 'a';
                int asciino = (int) guccukA;
                System.out.println("Karakter: " + guccukA);
                System.out.println("ASCII Numarası: " + asciino);
            }
        });
        uyg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float bubirfloatdegiskeni = 1f/3f;
                double bubirdoubledegiskeni = 1d/3d;
                System.out.println("Float: (1/3) = " + bubirfloatdegiskeni);
                System.out.println("Double: (1/3) = " + bubirdoubledegiskeni);
            }
        });
        uyg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double PI = 3.15;
                int yaricap = 5;
                double sonuc = 2*PI*yaricap;
                System.out.println("Sonuç: " + sonuc);
            }
        });
        uyg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = 15;
                int y = 5;
                int toplama, cikarma, carpma, bolme, modalma, arttirma,azaltma;
                toplama = x+y;
                cikarma = x-y;
                carpma = x*y;
                bolme = x / y;
                modalma = x % y;
                x++;
                y--;
                System.out.println("Toplama: " + toplama);
                System.out.println("Çıkarma: " + cikarma);
                System.out.println("Çarpma: " + carpma);
                System.out.println("Bölme: " + bolme);
                System.out.println("Mod Alma: " + modalma);
                System.out.println("Arttırma: " + x);
                System.out.println("Azaltma: " + y);
            }
        });
    }
}