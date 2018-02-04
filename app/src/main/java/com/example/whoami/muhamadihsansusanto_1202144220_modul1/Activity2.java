package com.example.whoami.muhamadihsansusanto_1202144220_modul1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 04/02/2018.
 */

public class Activity2 extends AppCompatActivity {
    TextView namaMakanan, porsi, namaRestoran, totalHarga;

    @Override
    protected void onCreate (Bundle savedInstanceStats) {
        super.onCreate(savedInstanceStats);
        setContentView(R.layout.eatbus);
        namaMakanan = (TextView) findViewById(R.id.nasduk);
        porsi = (TextView) findViewById(R.id.porsi1);
        totalHarga = (TextView) findViewById(R.id.harga1);
        namaRestoran = (TextView) findViewById(R.id.eatboss1);

        Intent a = getIntent();
        String restoran = a.getStringExtra("nama_restoran");
        String makanan = a.getStringExtra("nama_makanan");
        String porsi7 = a.getStringExtra("porsi");
        int x = a.getIntExtra("total_harga");
        String totalHargaa = String.valueOf(x);

        namaRestoran.setText(restoran);
        namaMakanan.setText(makanan);
        porsi.setText(porsi7);
        totalHarga.setText(totalHargaa);

    }
}
