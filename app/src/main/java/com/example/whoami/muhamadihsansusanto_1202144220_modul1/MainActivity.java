package com.example.whoami.muhamadihsansusanto_1202144220_modul1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edtextmenu, edtextjumlah;
    Button bteatbus;
    Button btabnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtextmenu = (EditText) findViewById(R.id.editmenucuy);
        edtextjumlah = (EditText) findViewById(R.id.editjumlahcuy);
        bteatbus =  (Button) findViewById(R.id.buttoneatboss);
        btabnormal =  (Button) findViewById(R.id.buttonupnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String nasduk = edtextmenu.getText().toString();
                final String porsi1 = edtextjumlah.getText().toString();
                int jumlah_integer = Integer.parseInt(edtextjumlah.getText().toString());
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("nama_restoran", "Eatbus");
                intent.putExtra("nama_makanan", nasduk);
                intent.putExtra("porsi", porsi1);
                intent.putExtra("total_harga", jumlah_integer*50000);
                startActivity(intent);

            }

        };

        btabnormal.setOnClickListener(View) {

            final String nasduk1 = edtextmenu.getText().toString();
            final String porsi2 = edtextjumlah.getText().toString();
            int jumlah_integer = Integer.parseInt(edtextjumlah.getText(),toString());
            Intent a = new Intent(getApplicationContext(), Activity2.class);
            a.putExtra("nama_restoran", "Abnormal");
            a.putExtra("nama_makanan", nasduk1);
            a.putExtra("porsi", porsi2);
            a.putExtra("total_harga", jumlah_integer*30000);
            startActivity(a);
        }
    } ;
}