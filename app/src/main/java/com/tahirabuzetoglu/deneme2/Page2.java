package com.tahirabuzetoglu.deneme2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    //activity_page2.xml'deki TextView için değişken hazırladık
    TextView tv_page2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        //Hazırladığımız değişkeni activity_page2.xml'deki TextView'a bağlıyoruz
        tv_page2 = findViewById(R.id.tv_page2);

        //Yeni bir Intent yapıp bu sayfaya gelen verileri içinde depoluyoruz.
        Intent mesajAl = getIntent();

        //MainActivity'den gelen mesajı, 'gelenMesaj' adlı String'e atıyoruz.
        String gelenMesaj = mesajAl.getStringExtra("DENEME");

        //gelenMesaj'ı tv_page2 adlı TextView'a ekliyoruz.
        tv_page2.setText(gelenMesaj);

    }
}
