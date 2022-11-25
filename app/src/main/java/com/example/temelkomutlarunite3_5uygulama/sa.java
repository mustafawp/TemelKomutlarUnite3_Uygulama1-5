package com.example.temelkomutlarunite3_5uygulama;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sa extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
        EditText txt1 = findViewById(R.id.txt1);
        EditText txt2 = findViewById(R.id.txt2);
        Button giris = findViewById(R.id.button);
        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = txt1.getText().toString();
                String b = txt2.getText().toString();
                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);
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
